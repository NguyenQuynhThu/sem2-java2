package assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Student {

    public TextField txtName;
    public TextField txtAge;
    public TextField txtMark;

    public String name;
    public int age;
    public float mark;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getMark() {
        return mark;
    }

    public Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student(){}

    public void addStudent(){
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        float mark = Float.parseFloat(txtMark.getText());

        Student st = new Student();

        st.setName(name);
        st.setAge(age);
        st.setMark(mark);

        Main.studentList.add(st);

        txtName.setText("");
        txtAge.setText("");
        txtMark.setText("");
    }

    public void toListPane() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

}
