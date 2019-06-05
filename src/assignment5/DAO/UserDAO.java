package assignment5.DAO;

import assignment5.User;
import assignment5.connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO implements UserInterface {

    private static UserDAO instance;

    private UserDAO(){

    }

    public static UserDAO getInstance(){
        if(instance == null){
            instance = new UserDAO();
        }
        return instance;
    }

    @Override
    public boolean create(User u) {
        Connector cn = Connector.getInstance();
        String sql = "INSERT INTO user (username, email, password) VALUES ('"+u.getUsername()+"','"+u.getEmail()+"','"+u.getPassword()+"')";

        try {
            if (cn.updateQuery(sql)>0){
                return true;
            }
        } catch (Exception e){}

        return false;
    }

    @Override
    public ArrayList<User> getList() {

        ArrayList<User> user = new ArrayList<>();
        Connector cn = Connector.getInstance();
        String sql = "SELECT * FROM user";

        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()) {
                return (user);
            }
        }catch(Exception e){}

            return null;
    }

    @Override
    public boolean update(User u) {
        Connector cn = Connector.getInstance();
        String sql = "UPDATE user SET username = '"+u.getUsername()+"', email = '"+u.getEmail()+"', password = '"+u.getPassword()+"' WHERE id = '"+u.getId()+"'";

        try {
            if (cn.updateQuery(sql)>0){
                return true;
            }
        } catch (Exception e){}

        return false;
    }

    @Override
    public boolean delete(User u) {
        Connector cn = Connector.getInstance();
        String sql = "DELETE FROM user WHERE id = " +u.getId();

        try {
            if (cn.updateQuery(sql)>0){
                return true;
            }
        } catch (Exception e){}

        return false;
    }

    public User getUser(Integer id){
        Connector cn = Connector.getInstance();
        String sql = "SELECT * FROM user WHERE id = "+id;

        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()){
                return new User(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
            }
        } catch (Exception e){}

        return null;
    }
}
