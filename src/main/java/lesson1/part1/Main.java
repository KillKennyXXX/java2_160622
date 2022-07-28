package lesson1.part1;

import lesson1.part1.interfaces.Flying;
import lesson1.part1.interfaces.Runner;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();
        Wolf wolf = new Wolf();

        Runner cat2 = new Cat();

        Runner[] runners = {cat, dog, duck};

        for (Runner runner : runners) {
            runner.run();
        }
        Flying[] flyings = {duck, plane};

        doFly(plane);
        doFly(duck);
    }

    private static void doFly(Flying f) {
        System.out.println("Подготовка к полету");
        f.fly();
        System.out.println("Завершение полета");
    }
}
