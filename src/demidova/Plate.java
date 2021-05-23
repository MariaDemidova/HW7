package demidova;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int catEat) {
        food -= catEat;
    }

    public void info() {
        System.out.printf("В тарелке осталось: %s единиц корма.%n", food);
    }

    public boolean isEnough(int catEat) {
        if (food >= catEat) {
            return true;
        } else return false;
    }

    public void moreFood() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добавить бедным котикам еды?\n1 - да, 2 - нет.");
            int s = scanner.nextInt();
            if (s == 1) {
                System.out.println("Сколько единиц корма добавить?");
                s = scanner.nextInt();
                food += s;
                System.out.println("Теперь в миске " + food + " единиц еды.");
                break;
            } else if (s == 2) {
                System.out.println("Бедные котики, ну чтож...\n");
                break;
            }
            else
                System.out.println("Не увиливайте от ответа, необходимо ввести 1, чтоб добавить еды и 2, чтоб не добавлять.");
        }
    }
}
