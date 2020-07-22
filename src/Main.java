import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //       1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        //       [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] num = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i < num.length; i++) {
            if (num[i] ==  0) {
                num[i] = 1;
            } else if  (num[i] ==  1) {
                num[i] = 0;
            }
        }
        System.out.print(Arrays.toString(num));
        System.out.println();
        //       2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] numArr = new int[8];
        for (int i= 1; i < numArr.length; i ++){
            numArr[i] = numArr[i-1] + 3;
        }
        System.out.println(Arrays.toString(numArr));

        //       3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] numberArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1  };
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < 6) {
                numberArray[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(numberArray));
        System.out.println();
        //        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с
        //        помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] numArray2 = new int[5][5];
        NumArrayOp(numArray2);

        //        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        //        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
        //        вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        //        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        //        или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи
        //        нельзя пользоваться вспомогательными массивами.
    }
    public static void NumArrayOp(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j ==  arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
