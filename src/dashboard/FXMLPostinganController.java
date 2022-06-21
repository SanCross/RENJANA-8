package dashboard;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLPostinganController implements Initializable {
    ArrayList<DaftarPostingan> data = new ArrayList<DaftarPostingan>();

    @FXML
    private TextField tfJudul;

    @FXML
    private TextField tfDeskripsi;

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
    private void unggah(ActionEvent event) {
        XStream xstream = new XStream(new StaxDriver());
        String judul = tfJudul.getText();
        String deskripsi = tfDeskripsi.getText();
        
        openTabel();

        data.add(new DaftarPostingan(judul, deskripsi));

        String xml = xstream.toXML(data);
        FileOutputStream berkasKeluar;

        try {
            byte[] info = xml.getBytes("UTF-8");
            berkasKeluar = new FileOutputStream("berkas.xml");
            berkasKeluar.write(info);
            berkasKeluar.close();

        } catch (Exception io) {
            System.out.println("Terjadi kesalahan : " + io.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        openTabel();
    }

}
