package assignment5;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import assignment5.DAO.UserDAO;

import java.net.URL;
import java.util.ResourceBundle;

public class Edit implements Initializable {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public static User userEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtUsername.setText(userEdit.getUsername());
        txtEmail.setText(userEdit.getEmail());
        txtPassword.setText(userEdit.getPassword());
    }

    public void update(){
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        try {
            userEdit.setUsername(username);
            userEdit.setEmail(email);
            userEdit.setPassword(password);
            UserDAO ud = UserDAO.getInstance();
            ud.update(userEdit);
        } catch (Exception e){}

    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }

    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

}
