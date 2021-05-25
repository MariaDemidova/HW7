package demidova;

public class Main {

    public static void main(String[] args) {
        Cat[] catsArr = {
                new Cat("Мурка", 20),
                new Cat("Жорлик", 50),
                new Cat("Барсик", 30),
                new Cat("Дохля", 10),
        };
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < catsArr.length; i++) {
            catsArr[i].catEat(plate);
            plate.info();
            System.out.println("Наелся?: " + catsArr[i].isSatisfied());
            System.out.println();
            if (i < catsArr.length - 1) plate.moreFood();
        }
        catsArr[1].catEat(plate);

    }
}
