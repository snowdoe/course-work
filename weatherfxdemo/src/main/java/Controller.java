import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by machu on 2017-05-06.
 */
public class Controller implements Initializable{

    @FXML
    ImageView image;

    @FXML
    Label tempLabel;

    public void initialize(URL location, ResourceBundle resources) {
        tempLabel.setText("Pobierania");

        try {
            URL url = new URL("http://api.apixu.com/v1/current.json?key=d578c483ed8b494bad8170534161511&q=Warsaw");
            JSONObject json = new JSONObject(IOUtils.toString(url));
            JSONObject json2 = (JSONObject)json.get("current");
            String stemp = json2.get("temp_c").toString();
            Double temp = Double.parseDouble(stemp);
            if (temp<= 5){
                Image im = new Image("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQSmmmLN1JfEkCvdvbhIDsQw_xAJQ5QKjVxmQ0lXlq3pbJ-vts4");
                image.setImage(im);
            }else{
                Image im = new Image("http://clipart-library.com/images/rinGgodBT.jpg");
                image.setImage(im);
            }
            tempLabel.setText("Temperatura to :"+stemp);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
