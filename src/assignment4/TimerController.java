package assignment4;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class TimerController {

    public TextArea txtTimer;

    public void runTimer(){
        Runnable timer = new Runnable() {
            @Override
            public void run() {
                for (int i=9; i >=0; i--){
                    for (int j=59; j >=0; j--){
                        txtTimer.setText(String.format("%02d", i)+":"+String.format("%02d", j));
                        try {
                            Thread.sleep(1000);
                        } catch (Exception E) {
                        }
                    }
                }
            }

        };
        new Thread(timer).start();
    }
}
