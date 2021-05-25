package demidova;

public class Cat {
    private String name;
    private int appetite;
    private int satisfied = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void catEat(Plate food) {
        if (satisfied == appetite) System.out.println(name + " уже наелся.");
        else if(food.isEnough(appetite)) {
            food.decreaseFood(appetite);
            satisfied = appetite;
            System.out.println(name + " съел " + appetite + " единиц корма.");
        }else System.out.println("В тарелке нет столько еды, сколько хочет кот " + name);
    }
    public boolean isSatisfied() {
        if(satisfied == appetite) return true;
        else return false;
    }
}
