package assignment1;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class StudentList implements Initializable {

    public TextArea txtList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String str ="";

        for (Student s : Main.studentList){
            String st = "Name: "+s.name + " - Age: " +s.age+ " - Mark: " + s.mark;
            str += (st+ "\n");
        }
        txtList.setText(str);

    }

    class AgeComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.mark == s2.mark)
                return 0;
            else if (s1.mark > s2.mark)
                return 1;
            else
                return -1;
        }
    }

    class AgeComparator2 implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.mark == s2.mark)
                return 0;
            else if (s1.mark < s2.mark)
                return 1;
            else
                return -1;
        }
    }

    boolean orderDone = true;

    public void order() {
        if(orderDone){
            String str2 ="";
            Collections.sort(Main.studentList, new AgeComparator());
            for (Student s : Main.studentList) {
                String st = "Name: "+s.name + " - Age: " +s.age+ " - Mark: " + s.mark;
                str2 += (st+ "\n");
            }
            txtList.setText(str2);
        } else {
            String str2 ="";
            Collections.sort(Main.studentList, new AgeComparator2());
            for (Student s : Main.studentList) {
                String st = "Name: "+s.name + " - Age: " +s.age+ " - Mark: " + s.mark;
                str2 += (st+ "\n");
            }
            txtList.setText(str2);
        }
        orderDone = !orderDone;

    }


    public void toAdd() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addStudent.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }


}

