package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.OtherActions.SearchResourses;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Foothill extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    //SearchResourses searchResourses = new SearchResourses();

    public void startLocationFoothill() {
        locationsSample.setElements(2,
                new File("src/img/backgroundsLocations/backgroundFoothillImage.png").toURI().toString(),
                "Предгорье");
        locationsSample.setButtonName("Горы", "Лес");
        setActionButtonFoothill();
    }

    public void setActionButtonFoothill() {
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Mountains mountains = new Mountains();
                mountains.startLocationMountains();
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Forest forest = new Forest();
                forest.startLocationForest();
            }
        });
        controller.searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int[] res = {6,2}; // Шелк и черный цветок
                int[] shans = {10, 4};
                int[] kolvo = {1, 1};
                searchResourses.startSearchResourses(res, shans, kolvo);
            }
        });
    }
}
