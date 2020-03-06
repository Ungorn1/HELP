package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class SlaverLane extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationSlaverLane(){
        locationsSample.setElements(2,
                new File("src/img/backgroundsLocations/backgroundSlaverLaneImage.png").toURI().toString(),
                "Преступный переулок");
        locationsSample.setButtonName("Работорговец", "Тёмный переулок");
        setActionButtonSlaverLane();
    }
    public void setActionButtonSlaverLane(){
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Работорговец
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DarkLane darkLane = new DarkLane();
                darkLane.startLocationDarkLane();
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
