package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class DarkLane extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationDarkLane(){
        locationsSample.setElements(3,
                new File("src/img/backgroundsLocations/backgroundDarkLaneImage.png").toURI().toString(),
                "Тёмный переулок");
        locationsSample.setButtonName("Преступный переулок", "Дыра в заборе", "Рынок");
        setActionButtonDarkLane();
    }
    public void setActionButtonDarkLane(){
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SlaverLane slaverLane = new SlaverLane();
                slaverLane.startLocationSlaverLane();
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Дыра в заборе
            }
        });
        // Кнопка 3
        controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Market market = new Market();
                market.startLocationMarket();
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
