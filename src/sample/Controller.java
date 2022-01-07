package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class Controller {
    @FXML
    private TextField textbox;

    @FXML
    private Button meter;

    @FXML
    private Button kilimeter;

    @FXML
    private Button INR;

    @FXML
    private Button celsius;

    @FXML
    private Button volume;

    @FXML
    private Button farenheit;

    @FXML
    private Label label;
    Pattern validEditingState = Pattern.compile("-?(([1-9][0-9]*)|0)?(\\.[0-9]*)?");

    @FXML
    void ActionCelsius(ActionEvent event) {

      String t1=textbox.getText().trim();
        if ((validEditingState.matcher(t1).matches())) {

            Double n1 = Double.parseDouble(t1);

            Double C = ((5 * (n1 - 32)) / 9);
            String Celsius = Double.toString(C);
            label.setVisible(true);
            label.setText(t1 + "farenheit" + "=" + Celsius + "Celsius");
        }
        else{
            label.setVisible(true);
            label.setText("Please enter a number");
        }


    }

    @FXML
    void ActionFarenheit(ActionEvent event) {
        String t1=textbox.getText().trim();

        if ((validEditingState.matcher(t1).matches())) {
            Double n1 = Double.parseDouble(t1);

            Double F = (((9 * n1) / 5) + 32);
            String farenheit = Double.toString(F);
            label.setVisible(true);
            label.setText(t1 + "Celsius" + "=" + farenheit + "farenheit");
        }else{
            label.setVisible(true);
            label.setText("Please enter a number");
        }

    }

    @FXML
    void ActionINR(ActionEvent event) {
        String t1=textbox.getText().trim();
        if ((validEditingState.matcher(t1).matches())) {
            Double n1 = Double.parseDouble(t1);

            Double inr = (n1 / 2.7);
            String INR = Double.toString(inr);
            label.setVisible(true);
            label.setText(t1 + "Srilankan rupees" + "=" + INR + "Indian rupees");
        }else{
            label.setVisible(true);
            label.setText("Please enter a number");
        }

    }

    @FXML
    void ActionKM(ActionEvent event) {
        String t1=textbox.getText().trim();
        if ((validEditingState.matcher(t1).matches())) {
            Double n1 = Double.parseDouble(t1);

            Double km = (n1 / 1000);
            String KM = Double.toString(km);
            label.setVisible(true);
            label.setText(t1 + "Meter" + "=" + KM + "KiloMeter");
        }else{
            label.setVisible(true);
            label.setText("Please enter a number");
        }

    }

    @FXML
    void ActionM(ActionEvent event) {
        String t1=textbox.getText().trim();
        if ((validEditingState.matcher(t1).matches())) {
            Double n1 = Double.parseDouble(t1);

            Double m = (n1 * 1000);
            String M = Double.toString(m);
            label.setVisible(true);
            label.setText(t1 + "KiloMeter" + "=" + M + "Meter");
        }else{
            label.setVisible(true);
            label.setText("Please enter a number");
        }

    }

    @FXML
    void ActionVolume(ActionEvent event) {
        String t1=textbox.getText().trim();
        if ((validEditingState.matcher(t1).matches())) {
            Double n1 = Double.parseDouble(t1);

            Double m = (n1 * n1*n1);
            String M = Double.toString(m);
            label.setVisible(true);
            label.setText("Volume of" +t1+ "=" + M );
        }else{
            label.setVisible(true);
            label.setText("Please enter a number");
        }

    }

    @FXML
    void initialize() {


    }
}
