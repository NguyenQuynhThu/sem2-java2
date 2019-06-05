package assignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;

public class Login {

    public TextField txtUsername;
    public PasswordField txtPassword;

    public void login(){

        String username = txtUsername.getText();
        String password = txtPassword.getText();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");

            String sql = "SELECT * FROM user WHERE username=? AND password=?";

            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);

            ResultSet rs = stm.executeQuery();

            if(rs.next()){
                goToList();
            }

        } catch (Exception e){};

    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void register() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }

    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
