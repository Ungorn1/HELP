package sample.Locations;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Character.Inventory;
import sample.OtherActions.SearchResourses;
import sample.SupportClasses.*;

import java.io.File;

public class City extends LocationsLoader {
    LocationsSample locationsSample = new LocationsSample();
    public void startLocationCity(){
        locationsSample.setElements(4,
                new File("src/img/backgroundsLocations/backgroundCityImage.png").toURI().toString(),
                "Городская площадь");
        locationsSample.setButtonName("Рынок", "Гильдия героев", "Замок", "Главные ворота");
        setActionButtonCity();
    }
    public void setActionButtonCity(){
     // Кнопка 1
        controller.buttonLockOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Market market = new Market();
                market.startLocationMarket();
            }
        });
     // Кнопка 2
        controller.buttonLockTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Guild guild = new Guild();
                guild.startLocationGuild();
            }
        });
     // Кнопка 3
        controller.buttonLockThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            Castle castle = new Castle();
            castle.startLocationCastle();
            }
        });
     // Кнопка 4
        controller.buttonLockFore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainGate mainGate = new MainGate();
                mainGate.startLocationMainGate();
            }
        });
     // Кнопка искать
        controller.searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controller.textAreaMain.appendText("\nВрятли ты что-то здесь найдёшь.");
            }
        });
        controller.inventoryButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../inventory.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage1 = new Stage();
                stage1.setScene(new Scene(root1, 240, 340));
                stage1.show();} catch (Exception e){
                    e.printStackTrace();
                    Inventory inventory = new Inventory();
                    inventory.setInventory();
                }
            }
        });
    }

}
