import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
     * 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
     * 3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
     * 4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
     */
    static  final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i =0; i < SIZE; i++) {
            for (int j=0; j <SIZE; j++) {

            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <SIZE;i++){
            System.out.println();

        }
    }
    public static void main(String[] args) {




    }


}
