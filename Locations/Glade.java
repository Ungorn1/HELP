package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Glade extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationGlade(){
        locationsSample.setElements(2,
                new File("src/img/backgroundsLocations/backgroundGladeImage.png").toURI().toString(),
                "Поляна");
        locationsSample.setButtonName("Лес", "Ворота");
        setActionButtonGlade();
    }
    public void setActionButtonGlade() {
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Forest forest = new Forest();
                forest.startLocationForest();
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainGate mainGate = new MainGate();
                mainGate.startLocationMainGate();
            }
        });
        controller.searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controller.textAreaMain.appendText("\nВрятли ты что-то здесь найдёшь.");
            }
        });
    }
}
