package ru.geekbrains.Lesson7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Масяня", 5, false);
        allCats[1] = new Cat("Вафик", 30, false);
        allCats[2] = new Cat("Снежок", 10, false);
        allCats[3] = new Cat("Стив", 45, false);
        Plate plate = new Plate(15);
        System.out.println("#################################");
        plate.info();
        System.out.println("#################################");

        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite <= plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Кот " + allCat.name + " покушал!");
            } else {
                System.out.println("Кот " + allCat.name + " не поел!");
            }
        }
        System.out.println("#################################");
        plate.info();
        System.out.println("#################################");
        System.out.println("Сколько добавить еще в тарелку");
        action = sc.nextInt();
        plate.increaseFood(action);
        System.out.println("#################################");
        plate.info();
        System.out.println("#################################");

    }
}
