package dashboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Label salahLogin;

    @FXML
    private TextField tfEmail;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private Button jadiMasuk;

    public void login(ActionEvent event) throws IOException {
        DashBoard d = new DashBoard();
        String email = tfEmail.getText();
        String pass = tfPassword.getText();

        if (email.equals("javierJinan") && pass.equals("123")) {
            System.out.println("Anda berhasil masuk");
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(tableViewScene);
            window.show();
        } else if (email.isEmpty() || pass.isEmpty()) {
            System.out.println("Email atau Password Anda salah");
        } else {
            salahLogin.setText("Email atau Password Anda salah");
        }

    }

//    private void checkLogin() throws IOException {
//        DashBoard d = new DashBoard();
//        String email = tfEmail.getText();
//        String pass = tfPassword.getText();
//
//        if (email.equals("javierJinan") && pass.equals("123")) {
//            System.out.println("Anda berhasil masuk");
//            
//        } else if (email.isEmpty() || pass.isEmpty()) {
//            System.out.println("Email atau Password Anda salah");
//        } else {
//            salahLogin.setText("Email atau Password Anda salah");
//        }
//
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
