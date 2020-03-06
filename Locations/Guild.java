package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Guild extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationGuild(){
        locationsSample.setElements(2,
                new File("src/img/backgroundsLocations/backgroundGuildImage.png").toURI().toString(),
                "Гильдия героев");
        locationsSample.setButtonName("Глава гильдии", "Городская площадь");
        setActionButtonGuild();
    }
    public void setActionButtonGuild(){
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Глава гильдии
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
