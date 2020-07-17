package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    private TextField text1;
    @FXML
    private TextField tA;
    @FXML
    private TextField tB;
    @FXML
    private TextField tC;
    @FXML
    public void onClickMethod(){
        double rez=0;
        double x = Double.parseDouble(tA.getText());
        double a = Double.parseDouble(tB.getText());
        double b = Double.parseDouble(tC.getText());
        if (x<=7) {
            rez=(x+4)/(a*a+b*b);
        }else {
            rez = x * (a + b) * (a + b);
        }
        String str = Double.toString(rez);
        text1.setText(str);
    }

}
