public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }
    public void run (int let) {
        if (let > 200) {
            System.out.println("Введите значение в диапазоне от 0 до 200");
        } else {
            System.out.println(name + " пробежал " + let + " м.");
        }
    }
    public void swim () {
        System.out.println(name + " не умеет плавать.");
    }
}
