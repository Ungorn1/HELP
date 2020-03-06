package sample.Locations;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.SupportClasses.LocationsLoader;
import sample.SupportClasses.LocationsSample;

import java.io.File;

public class MainGate extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationMainGate(){
        locationsSample.setElements(3,
                new File("src/img/backgroundsLocations/backgroundMainGateImage.png").toURI().toString(),
                "Главные ворота");
        locationsSample.setButtonName("Городская площадь", "Равнина", "Поле");
        setActionButtonMainGate();
    }
    public void setActionButtonMainGate(){
        // Кнопка 1
    controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            City city = new City();
            city.startLocationCity();
        }
    });
    controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Glade glade = new Glade();
            glade.startLocationGlade();
        }
    });
    controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Field field = new Field();
            field.startLocationField();
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
