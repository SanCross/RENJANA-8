package dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class FXMLDiagramController implements Initializable {
    XYChart.Series dataPost = new XYChart.Series<>();
    
    @FXML
    private BarChart bcPost;
    
    @FXML
    private void tambahButton(ActionEvent event) {
        dataPost.getData().add(new XYChart.Data("HatchBack", 400));
        System.out.println("tambahButton's clicked");
    }

    @FXML
    private void kurangButton(ActionEvent event) {
        dataPost.getData().remove(3);
        System.out.println("kurangButton's clicked");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dataPost.getData().add(new XYChart.Data("Vacation", 300));
        dataPost.getData().add(new XYChart.Data("Beach", 200));
        dataPost.getData().add(new XYChart.Data("Selat Sunda", 500));

        bcPost.getData().addAll(dataPost);
    }    
    
}
