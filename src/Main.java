import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 20);
        cat1.catInfo();
        Plate plate1 = new Plate(300);
        plate1.plateFoodInfo();
        cat1.eat(plate1);
        plate1.plateFoodInfo();
        System.out.println(cat1.isSatiety());
        cat1.satietyInfo();
        Cat[] catArray =  {
            new Cat("Маруся", 50),
            new Cat("Витя", 20),
            new Cat("Маша", 30)
        };
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate1);
            System.out.println(catArray[i].getName() + " поел  " + catArray[i].getTheAmountofCatFood() + " единиц еды.");
        }
        plate1.plateFoodInfo();
        plate1.addFood(100);
    }
}
