package lesson1.part1;

import lesson1.part1.interfaces.Flying;

public class Plane implements Flying {

    @Override
    public void fly() {
        System.out.println("Самолет полетел");
    }
}
