public class Cat {
    private String name;
    private int defaultEatCat = 20;
    private boolean satiety;
    private int theAmountofCatFood;
    public Cat (String name) {
        this.name = name;
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
        if (plate.getFood() > defaultEatCat) {
            plate.setFood(plate.getFood()-defaultEatCat);
            theAmountofCatFood = defaultEatCat;
        } else {
            System.out.println("В тарелке недостаточно еды");
        }

    }
    public boolean isSatiety () {
        if (theAmountofCatFood == defaultEatCat) {
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

