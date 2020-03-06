package sample.Character;

import jdk.nashorn.internal.objects.Global;
import sample.OtherActions.SearchResourses;
import sample.SupportClasses.LocationsLoader;

public class Inventory extends LocationsLoader {
    SearchResourses searchResourses = new SearchResourses();
       public String[] nameResourses = {"Шёлк","Дерево","Медь","Металл","Красные ягоды","Черный цветок","Камень"};
       public int[] invIdResourses = {0,1,2,3,4,5,6,7,8,9,10};
       public int[] amt = {0,0,0,0,0,0,0,0,0,0,0};

    public void a(){
        for(int i = 0; i < 10; i++){
            System.out.println(amt[i]);
        }
    }

    public void setInventory(){
        for(int i = 0; i < invIdResourses.length; i++){

            if(amt[i] != 0){
                controller.inventoryTextArea.appendText("\n"+nameResourses[i]+" : "+amt[i]+" шт.");
            }

        }

    }

}
