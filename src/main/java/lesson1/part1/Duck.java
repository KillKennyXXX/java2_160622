package lesson1.part1;

import lesson1.part1.interfaces.Flying;
import lesson1.part1.interfaces.Jumper;
import lesson1.part1.interfaces.Runner;

public class Duck extends Animal implements Flying, Runner, Jumper {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public Duck() {
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Утка полетела");

    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}
