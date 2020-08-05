public class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }
    public void run (int let) {
        System.out.println(name + " пробежал " + let + " м.");
    }
    public void swim (int let) {
        System.out.println(name + " проплыл " + let + " м.");
    }
}
