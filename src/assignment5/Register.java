package assignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import assignment5.DAO.UserDAO;


public class Register {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public void register(){
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        //Cach cu:
//        String sql = "INSERT INTO user (username, email, password) VALUES('"+username+"','"+email+"','"+password+"')";
//
//        try {
//            //Connector cn = new Connector(); --> se bi loi do da khoa ham Connector()
//            Connector cn = Connector.getInstance();
//            int number = cn.updateQuery(sql);
//            if(number > 0){
//                goToList();
//
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        };

        //Dung DAO da tao trong session7, ko can viet cau sql
        try {
            User u = new User(null, username, email, password);
            UserDAO ud = UserDAO.getInstance();
            ud.create(u);
        } catch (Exception e){}

    }

    public void login() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }

}
