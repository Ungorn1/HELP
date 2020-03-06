package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.OtherActions.SearchResourses;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Mountains extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationMountains(){
        locationsSample.setElements(4,
                new File("src/img/backgroundsLocations/backgroundMountainsImage.png").toURI().toString(),
                "Горы");
        locationsSample.setButtonName("Поселение в горах", "Вершина горы", "Пещера", "Предгорье");
        setActionButtonMountains();
    }
    public void setActionButtonMountains() {
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Поселение в горах
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Вершина горы
            }
        });
        // Кнопка 3
        controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Пещера
            }
        });
        // Кнопка 4
        controller.buttonLockFore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Foothill foothill = new Foothill();
                foothill.startLocationFoothill();
            }
        });
        controller.searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int[] res = {6,3,4,5};
                int[] shans = {10, 3, 2, 2};
                int[] kolvo = {1, 1, 2, 1};
                searchResourses.startSearchResourses(res, shans, kolvo);
            }
        });
    }
}
