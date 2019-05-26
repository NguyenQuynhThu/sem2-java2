package assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


import java.util.ArrayList;

public class Student {

    public TextField txtName;
    public TextField txtAge;
    public TextField txtMark;

    public String name;
    public int age;
    public float mark;

    public ArrayList<String> studentList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student(){

    }

    public void addStudent(){
        String name = txtName.getText();
        String age = txtAge.getText();
        String mark = txtMark.getText();

        Main.studentList.add(name);
        Main.studentList.add(age);
        Main.studentList.add(mark);

        txtName.setText("");
        txtAge.setText("");
        txtMark.setText("");
    }

    public void toListPane() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

}
