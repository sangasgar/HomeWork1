import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мася");
        Dog dog = new Dog("Бобик");
        cat.run(50);
        cat.swim();
        dog.run(500);
        dog.swim(10);
        Cat MusiaCat = new Cat("Муся");
        MusiaCat.run(50);


        Animals[] animal = {
                new Cat("Мася"),
                new Dog("Бобик"),
                new Cat("Муся"),
                new Animals("Жираф")
        };
        countAnimals(animal);

    }
      public static void countAnimals(Animals[] arrayAnimal) {
          int count = 0;
          for (int i = 0; i < arrayAnimal.length; i++) {
              count += 1;
          }
          System.out.println("Всего создано " + count + " типа животных");
      }
}
