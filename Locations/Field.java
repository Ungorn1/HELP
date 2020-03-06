package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.OtherActions.SearchResourses;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Field extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    //SearchResourses searchResourses = new SearchResourses();

    public void startLocationField() {
        locationsSample.setElements(2,
                new File("src/img/backgroundsLocations/backgroundFieldImage.png").toURI().toString(),
                "Поле");
        locationsSample.setButtonName("Ворота", "Лес");
        setActionButtonField();
    }

    public void setActionButtonField() {
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainGate mainGate = new MainGate();
                mainGate.startLocationMainGate();
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
                int[] res = {0,5}; // Шелк и черный цветок
                int[] shans = {20, 5};
                int[] kolvo = {2, 1};
                searchResourses.startSearchResourses(res, shans, kolvo);
            }
        });
    }
}
