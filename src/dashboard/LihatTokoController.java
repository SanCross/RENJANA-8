package dashboard;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class LihatTokoController implements Initializable {

    ObservableList dataToko = observableArrayList();
    ArrayList<DaftarToko> daftarToko = new ArrayList<>();

    @FXML
    private TableView<DaftarPostingan> table;

    @FXML
    private TableColumn<DaftarToko, String> tcNamaToko;

    @FXML
    private TableColumn<DaftarToko, String> tcAlamat;
    
    @FXML
    private TableColumn<DaftarToko, String> tcEmail;
    
    @FXML
    private TableColumn<DaftarToko, String> tcNoTelfon;

    void openTabel() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream berkasMasuk;
        try {
            berkasMasuk = new FileInputStream("berkas2.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != - 1) {
                c = (char) isi;
                s = s + c;
            }
            daftarToko = (ArrayList<DaftarToko>) xstream.fromXML(s);
            berkasMasuk.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    @FXML
    private void removeBthAction(ActionEvent event) {
        int selectedID = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(selectedID);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcNamaToko.setCellValueFactory(new PropertyValueFactory<>("namaToko"));
        tcAlamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tcNoTelfon.setCellValueFactory(new PropertyValueFactory<>("noTelfon"));

        openTabel();

        for (int i = 0; i < daftarToko.size(); i++) {
            dataToko.add(daftarToko.get(i));
        }

        table.setItems(dataToko);
    }

}

