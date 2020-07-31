import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Employeers emp = new Employeers("Garegin","It director","sangas@yandex.ru","89261119990","250000",32);

    emp.info();
        Employeers[] persArray = new Employeers[5];
        persArray[0] = new Employeers("Garegin","It director","sangas@yandex.ru","89166897511","250000",32);
        persArray[1] = new Employeers("Николай","It director","home@yandex.ru","89055633449","300000",60);
        persArray[2] = new Employeers("Валера","It director","ema@yandex.ru","89261119990","40000",25);
        persArray[3] = new Employeers("Георгий","It director","lam@gmail.com","89882552222","70000",45);
        persArray[4] = new Employeers("Грач","It director","samara@yandex.ru","89997774411","100000",50);

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].infoAge(40);
        }

    }
}
