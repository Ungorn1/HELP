package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class DarkForest extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationDarkForest(){
        locationsSample.setElements(3,
                new File("src/img/backgroundsLocations/backgroundDarkForestImage.png").toURI().toString(),
                "Тёмный лес");
        locationsSample.setButtonName("Лес", "Хижина лесника", "Рябиновая роща");
        setActionButtonDarkForest();
    }
    public void setActionButtonDarkForest() {
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
                // Хижина лесника
            }
        });
        // Кнопка 3
        controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Рябиновая роща
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
