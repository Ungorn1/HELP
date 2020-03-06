package sample.SupportClasses;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import sample.Locations.City;

public class Controller {
    @FXML
    public TextArea textAreaMain;

    @FXML
    public ImageView imageViewLockations;

    @FXML
    public Button buttonLockOne;

    @FXML
    public Button buttonLockTwo;

    @FXML
    public Button buttonLockThree;

    @FXML
    public Button buttonLockFore;

    @FXML
    public Label goingLabelOne;

    @FXML
    public Label goingLabelSec;

    @FXML
    public Label goingLabelTwo;

    private LocationsSample locationsSample;

    @FXML
    public Button searchButton;

    @FXML
    public Button inventoryButton1;

    @FXML
    public TextArea inventoryTextArea;

    @FXML
    void initialize() {
        LocationsLoader.controller = this;
        City city = new City();
        city.startLocationCity();

    }
}
