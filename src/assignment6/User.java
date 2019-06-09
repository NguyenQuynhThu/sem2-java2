package assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class User {

    public Integer id;
    public String username;
    public String email;
    public String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(){

    }

    public void login(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Usename: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");

            String sql = "SELECT * FROM user WHERE username=? AND password=?";

            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);

            ResultSet rs = stm.executeQuery();

            if(rs.next()){
                System.out.println("Login successfully.");
            } else {
                System.out.println("Invalid username.");
            }

        } catch (Exception e){};
    }

    public void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usename: ");
        String username = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        String sql = "INSERT INTO user (username, email, password) VALUES('"+username+"','"+email+"','"+password+"')";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");

            String sqlchecking = "SELECT * FROM user WHERE username=? OR email=?";
            PreparedStatement stmCheck = con.prepareStatement(sqlchecking);
            stmCheck.setString(1, username);
            stmCheck.setString(2, email);

            ResultSet rschecking = stmCheck.executeQuery();
            if(rschecking.next()){
                System.out.println("User already exist.");
            } else {
                PreparedStatement stm = con.prepareStatement(sql);
                stm.executeUpdate();
                ResultSet rs = stm.getGeneratedKeys();

                if(rs.next()){
                    System.out.println("Register successfully.");
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        };

    }

    public void showList(){

        String sql = "SELECT * FROM user";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            System.out.println("USER LIST");

            while (rs.next()){
                System.out.print(rs.getInt("id")+"    ");
                System.out.print(rs.getString("username")+"    ");
                System.out.println(rs.getString("email"));
                System.out.println("--------------------------");
            }

        } catch (Exception e){};
    }

}
