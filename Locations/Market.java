package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Market extends LocationsLoader{
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationMarket(){
        locationsSample.setElements(4,
                new File("src/img/backgroundsLocations/backgroundMarketImage.png").toURI().toString(),
                "Торговый район");
        locationsSample.setButtonName("Алхимик", "Бронник", "Тёмный переулок", "Городская площадь");
        setActionButtonMarket();
    }
    public void setActionButtonMarket(){
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Алхимик
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Бронник
            }
        });
        // Кнопка 3
        controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DarkLane darkLane = new DarkLane();
                darkLane.startLocationDarkLane();
            }
        });
        // Кнопка 4
        controller.buttonLockFore.setOnAction(new EventHandler<ActionEvent>() {
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
