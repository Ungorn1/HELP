package sample.SupportClasses;

import sample.Locations.City;

import java.io.File;

public class LocationsSample {
    LocationsLoader locationsLoader = new LocationsLoader();
    public void setElements(int quantityButtons, String srcImage, String nameLocation){
        locationsLoader.disableButtons();
        locationsLoader.activateButtons(quantityButtons);
        locationsLoader.setImage(srcImage);
        locationsLoader.writeTextArea(nameLocation);
    }

    public void setButtonName(String b1){
        locationsLoader.setButtonName(b1);
    }
    public void setButtonName(String b1, String b2){
        locationsLoader.setButtonName(b1, b2);
    }
    public void setButtonName(String b1, String b2, String b3){
        locationsLoader.setButtonName(b1, b2, b3);
    }
    public void setButtonName(String b1, String b2, String b3, String b4){
        locationsLoader.setButtonName(b1, b2, b3, b4);
    }

}
