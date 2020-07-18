public class Main {
// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
// 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte b = 1;
        short s = 10;
        int i = 15;
        long l = 20l;
        float f = 20.15f;
        double d = 10.25;
        char c = 'A';
        boolean bool = true;
        System.out.println(result(10.9f,13.921f,10.921f,1.5f));
        System.out.println(res(5,8));
        numb(-50);
        System.out.println(numbBool(-25));
        NameHello("Гарегин");
        Year(2400);

    }
// 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
        public static float result (float a,float b,float c,float d) {
            float result = a * (b + (c / d));
            return result;
        }
// 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        public static boolean res (int a, int b) {
        boolean res = false;
        if (a+b <=20 && a+b >=10) {
            return res = true;
        }
        return res;
}
// 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        public static void numb (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
          } else {
            System.out.println("Число отрицательное");
        }
        }
// 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        public static boolean numbBool (int a) {
        boolean res;
         if (a < 0) {
             res = true;
         } else {
            res = false;
         }
         return res;
        }
// 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        public static void NameHello (String name) {
            System.out.println("Привет, " + name + "!");
        }
// 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        public static void Year (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("Год высокосный");
        } else  {
            System.out.println("Год невысокосный");
        }
}
}
