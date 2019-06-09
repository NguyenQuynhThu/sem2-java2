package assignment8;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


public class ClockController implements Initializable {

    public TextArea txtTime;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Runnable timer = new Runnable() {
            @Override
            public void run() {
                while (true){
                    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss\ndd/MM/yyyy");
                    Date date = new Date();

                    txtTime.setText(dateFormat.format(date));

                    try {
                        Thread.sleep(1000);
                    } catch (Exception E) {
                    }
                }
            }
        };
        new Thread(timer).start();
    }
}
