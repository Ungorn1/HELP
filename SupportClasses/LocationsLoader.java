package sample.SupportClasses;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import sample.Character.Inventory;
import sample.OtherActions.SearchResourses;

public class LocationsLoader{
   public static Controller controller;
   public static SearchResourses searchResourses = new SearchResourses();
    public void disableButtons(){   //Дизактивация всех кнопок
        controller.buttonLockOne.setDisable(true);
        controller.buttonLockOne.setVisible(false);
        controller.buttonLockTwo.setDisable(true);
        controller.buttonLockTwo.setVisible(false);
        controller.buttonLockThree.setDisable(true);
        controller.buttonLockThree.setVisible(false);
        controller.buttonLockFore.setDisable(true);
        controller.buttonLockFore.setVisible(false);
    }

    public void activateButtons(int a){     // активация заданного количества кнопок
        for(int i = 0; i <=a; i++){
            if(i == 1){controller.buttonLockOne.setDisable(false); controller.buttonLockOne.setVisible(true);}
            if(i == 2){controller.buttonLockTwo.setDisable(false); controller.buttonLockTwo.setVisible(true);}
            if(i == 3){controller.buttonLockThree.setDisable(false); controller.buttonLockThree.setVisible(true);}
            if(i == 4){controller.buttonLockFore.setDisable(false); controller.buttonLockFore.setVisible(true);}
        }
    }

    public void setImage(String srcImage){  // Загрузка картинки локации
        Image image = new Image(srcImage);
        System.out.println(srcImage);
        controller.imageViewLockations.setImage(image);
    }

    public void writeTextArea(String locationName){
        controller.textAreaMain.appendText("\nВы прибыли в локацию: "+locationName);
    }

    public void timeGoingLocation(int sec){

    }

    public void setButtonName(String b1){
        controller.buttonLockOne.setText(b1);
    }
    public void setButtonName(String b1, String b2){
        controller.buttonLockOne.setText(b1);
        controller.buttonLockTwo.setText(b2);
    }
    public void setButtonName(String b1, String b2, String b3){
        controller.buttonLockOne.setText(b1);
        controller.buttonLockTwo.setText(b2);
        controller.buttonLockThree.setText(b3);
    }
    public void setButtonName(String b1, String b2, String b3, String b4){
        controller.buttonLockOne.setText(b1);
        controller.buttonLockTwo.setText(b2);
        controller.buttonLockThree.setText(b3);
        controller.buttonLockFore.setText(b4);
    }

}
