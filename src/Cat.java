public class Cat {
    private String name;
    private int defaultEatCat = 20;
    private boolean satiety;
    private int appetit;
    private int theAmountofCatFood;
    public Cat (String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }
    public String getName() {
        return name;
    }
    public void catInfo () {
        System.out.println("Кот по имени " + name);
    }

    public int getDefaultEatCat() {
        return defaultEatCat;
    }

    public int getTheAmountofCatFood() {
        return theAmountofCatFood;
    }

    public void eat (Plate plate) {
        if (plate.getFood() > appetit) {
            plate.decreaseFood(appetit);
            theAmountofCatFood = appetit;
        } else {
            System.out.println("В тарелке недостаточно еды");
        }

    }
    public boolean isSatiety () {
        if (theAmountofCatFood == appetit) {
            satiety = false;
        } else {
            satiety = true;
        }
        return satiety;
    }
    public void satietyInfo () {
        if (satiety == false) {
            System.out.println("Кот сыт");
        } else {
            System.out.println("Кот голоден");
        }

    }
}

