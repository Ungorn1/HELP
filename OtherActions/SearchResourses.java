package sample.OtherActions;

import sample.Character.Inventory;
import sample.SupportClasses.LocationsLoader;

import java.util.Random;

public class SearchResourses extends LocationsLoader {
    int[] idResourses;
    int[] a;
    String[] nameResourses;
    boolean detectRefresh = true;
    Inventory inventory = new Inventory();

    public SearchResourses(){
        // Ресурсы которые можно найти
        idResourses = new int[20];
        a = new int[20];
        nameResourses = new String[20];
        idResourses[0] = 0;
        nameResourses[0] = "Шёлк";
        idResourses[1] = 1;
        nameResourses[1] = "Дерево";
        idResourses[2] = 2;
        nameResourses[2] = "Медь";
        idResourses[3] = 3;
        nameResourses[3] = "Металл";
        idResourses[4] = 4;
        nameResourses[4] = "Красные ягоды";
        idResourses[5] = 5;
        nameResourses[5] = "Чёрный цветок";
        idResourses[6] = 6;
        nameResourses[6] = "Камень";
        // Ресурсы которые выбиваются с мобов

        //Ресурсы в рюкзаке

    }
    public void startSearchResourses(int[]id, int[]shans, int[]kolvo){

        Random random = new Random();
        boolean detect = false;
        for(int i = 0; i < id.length; i++){
           int b = random.nextInt(100);
            System.out.println(b);
           if(b <= shans[i]){
               a[i] = 1 + random.nextInt(kolvo[i]);
               searchResoursesWrite(nameResourses[id[i]], a[i], id[i]);
               detect = true;
           }
        }
        if(detect == false){
            System.out.println("Ничего не найдено");
            controller.textAreaMain.appendText("\nНичего не найдено");
        }
    }
    public void searchResoursesWrite(String a, int b, int id){
        System.out.println("Вы нашли "+ a + " "+ b + " шт.");
        controller.textAreaMain.appendText("\nВы нашли "+ a + " "+ b + " шт.");
        putInventory(b, id);
    }
    public void putInventory(int amt, int id) {
        inventory.amt[id] = inventory.amt[id] + amt;
        inventory.a();
    }

}
