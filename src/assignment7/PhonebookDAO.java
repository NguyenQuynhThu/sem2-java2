package assignment7;

import connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class PhonebookDAO implements PhonebookInterface {

    private static PhonebookDAO instance;

    private PhonebookDAO(){

    }

    public static PhonebookDAO getInstance(){
        if (instance == null){
            instance = new PhonebookDAO();
        }
        return instance;
    }

    @Override
    public boolean create(Phonebook pb) {
        Connector cn = Connector.getInstance();
        String sql = "INSERT INTO phonebook (user_id, telephone, status) VALUES ('"+pb.getUser_id()+"','"+pb.getTelephone()+"','"+pb.getStatus()+"')";

        try {
            if (cn.updateQuery(sql)>0){
                return true;
            }
        } catch (Exception e){}

        return false;
    }

    @Override
    public ArrayList<Phonebook> getList() {

        ArrayList<Phonebook> phonebook = new ArrayList<>();
        Connector cn = Connector.getInstance();
        String sql = "SELECT * FROM phonebook";

        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()) {
                return (phonebook);
            }
        }catch(Exception e){}

        return null;
    }

    @Override
    public boolean update(Phonebook pb) {
        Connector cn = Connector.getInstance();
        String sql = "UPDATE phonebook SET user_id = '"+pb.getUser_id()+"', email = '"+pb.getTelephone()+"', password = '"+pb.getStatus()+"' WHERE id = '"+pb.getId()+"'";

        try {
            if (cn.updateQuery(sql)>0){
                return true;
            }
        } catch (Exception e){}

        return false;
    }

    @Override
    public boolean delete(Phonebook pb) {
        Connector cn = Connector.getInstance();
        String sql = "DELETE FROM phonebook WHERE id = " +pb.getId();

        try {
            if (cn.updateQuery(sql)>0){
                return true;
            }
        } catch (Exception e){}

        return false;
    }

    public Phonebook getPhonebook(Integer id){
        Connector cn = Connector.getInstance();
        String sql = "SELECT * FROM phonebook WHERE id = "+id;

        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()){
                return new Phonebook(rs.getInt("id"), rs.getInt("user_id"), rs.getString("telephone"), rs.getString("status"));
            }
        } catch (Exception e){}

        return null;
    }
}
