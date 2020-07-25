import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static int count = 9; // Диапазон случайных чисел, которое загадывает компьютер.
    static int num = random.nextInt(count);
    static int tries = 3;  // Количество попыток для разгадывания.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
//        При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет).
        gameRandomInt (num);

    }
    public static void gameRandomInt (int rand) {
                    do {
                        for (int i = 0; i < tries; i++) {
                            System.out.println("Введите число от 0 до 9");
                            num = scanner.nextInt();
                            if (num == rand) {
                                System.out.println("Вы выиграли");
                                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет)");
                                num = scanner.nextInt();
                                if (num > 1 || num < 0) {
                                    System.out.println("Введите 1 – да / 0 – нет» (1 – повторить, 0 – нет)");
                                    num = scanner.nextInt();
                                }
                                System.out.println("Игра закончена");
                            }
                            else if (num < rand && i < tries-1) {
                                System.out.println("Ваше число меньше загаданного");
                            } else if (num > rand && i < tries-1) {
                                System.out.println("Ваше число больше загаданного");
                            } else {
                                System.out.println("Вы проиграли");
                                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет)");
                                num = scanner.nextInt();
                                if (num > 1 || num < 0) {
                                    System.out.println("Введите 1 – да / 0 – нет» (1 – повторить, 0 – нет)");
                                    num = scanner.nextInt();
                                }
                                System.out.println("Игра закончена");
                            }
                        }
                    } while (num == 1);
                  }
}
