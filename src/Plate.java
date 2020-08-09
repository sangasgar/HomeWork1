public class Plate {
    private int food;
    int defaultMaxFoodPlate = 300;
    public Plate (int food) {
        if (food > defaultMaxFoodPlate) {
            System.out.println("В тарелке не помещается еды больше 300 единиц");
        } else  {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void  plateFoodInfo () {
        System.out.println("В тарелке " + food + " еды.");
    }
    public void addFood (int food) {
        if (this.food + food > defaultMaxFoodPlate) {
            System.out.println("Объем тарелки не помещает столько еды.");
        } else   {
            this.food =  this.food + food;
        }
        System.out.println("В тарелке " + this.food);
    }
}
