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

public class LihatPostinganController implements Initializable {

    ObservableList dataPostingan = observableArrayList();
    ArrayList<DaftarPostingan> data = new ArrayList<>();

    @FXML
    private TableView<DaftarPostingan> table;

    @FXML
    private TableColumn<DaftarPostingan, String> tcJudul;

    @FXML
    private TableColumn<DaftarPostingan, String> tcDeskripsi;

    void openTabel() {
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream berkasMasuk;
        try {
            berkasMasuk = new FileInputStream("berkas.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != - 1) {
                c = (char) isi;
                s = s + c;
            }
            data = (ArrayList<DaftarPostingan>) xstream.fromXML(s);
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
        tcJudul.setCellValueFactory(new PropertyValueFactory<>("judul"));
        tcDeskripsi.setCellValueFactory(new PropertyValueFactory<>("deskripsi"));

        openTabel();

        for (int i = 0; i < data.size(); i++) {
            dataPostingan.add(data.get(i));
        }

        table.setItems(dataPostingan);
    }

}
