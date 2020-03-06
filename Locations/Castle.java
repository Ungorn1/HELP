package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Castle extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationCastle(){
        locationsSample.setElements(2,
                new File("src/img/backgroundsLocations/backgroundMainCastleImage.png").toURI().toString(),
                "Замок");
        locationsSample.setButtonName("Король", "Городская площадь");
        setActionButtonCastle();
    }
    public void setActionButtonCastle(){
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Король
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                City city = new City();
                city.startLocationCity();
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
