package dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Acer
 */
public class FXMLDocumentController implements Initializable {
    OpenScene bukaScene = new OpenScene();
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void home(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLDashboard");
        mainPane.setCenter(halaman);
        System.out.println("Button home's Clicked");
    }
    
    @FXML
    private void pencarian(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLCari");
        mainPane.setCenter(halaman);
        System.out.println("Button pencarian's Clicked");
    }
    
    @FXML
    private void lihatDiagram(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLDiagram");
        mainPane.setCenter(halaman);
        System.out.println("Button lihat diagram's Clicked");
    }
    
    @FXML
    private void tambahPostingan(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLPostingan");
        mainPane.setCenter(halaman);
        System.out.println("Button tambah postingan's Clicked");
    }
    
    @FXML
    private void tambahTokoLokal(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLToko");
        mainPane.setCenter(halaman);
        System.out.println("Button tambah toko lokal's Clicked");
    }
    
    @FXML
    private void lihatPostingan(ActionEvent event) {
        Pane halaman = bukaScene.getPane("LihatPostingan");
        mainPane.setCenter(halaman);
        System.out.println("Button lihat postingan lokal's Clicked");
    }
    
    @FXML
    private void lihatToko(ActionEvent event) {
        Pane halaman = bukaScene.getPane("LihatToko");
        mainPane.setCenter(halaman);
        System.out.println("Button lihat toko lokal's Clicked");
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Main m = new Main();
//        m.changeScene("FXMLDocument.fxml");
    }    
    
}
