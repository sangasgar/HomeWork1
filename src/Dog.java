public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }
    public void run (int let) {
        if (let > 500) {
            System.out.println("Введите значение в диапазоне от 0 до 500");
        } else {
            System.out.println(name + " пробежал " + let + " м.");
        }
    }
    public void swim (int let) {
        if (let > 10) {
            System.out.println("Введите значение в диапазоне от 0 до 10");
        } else {
            System.out.println(name + " проплыл " + let + " м.");
        }
    }
}
