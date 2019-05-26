package assignment1;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class StudentList implements Initializable {

    public TextArea txtList;

    //interface bat su kien khoi tao man hinh
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String str = "";

        for (String s: Main.studentList){
            str += (s + "\n");
        }
        txtList.setText(str + "\n");
    }


    public void toAdd() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addStudent.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }


}

