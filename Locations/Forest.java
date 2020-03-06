package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.OtherActions.SearchResourses;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class Forest extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    //SearchResourses searchResourses = new SearchResourses();
    public void startLocationForest(){
        locationsSample.setElements(4,
                new File("src/img/backgroundsLocations/backgroundForestImage.png").toURI().toString(),
                "Лес");
        locationsSample.setButtonName("Поле", "Равнина", "Предгорье", "Тёмный лес");
        setActionButtonForest();
    }
    public void setActionButtonForest() {
        // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Field field = new Field();
                field.startLocationField();
            }
        });
        // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Glade glade = new Glade();
                glade.startLocationGlade();
            }
        });
        // Кнопка 3
        controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Foothill foothill = new Foothill();
                foothill.startLocationFoothill();
            }
        });
        // Кнопка 4
        controller.buttonLockFore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DarkForest darkForest = new DarkForest();
                darkForest.startLocationDarkForest();
            }
        });
        controller.searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int[] res = {1,4};
                int[] shans = {20, 5};
                int[] kolvo = {1, 3};
                searchResourses.startSearchResourses(res, shans, kolvo);
            }
        });
    }
}
