package component.green;

import component.Door;

public class GreenDoor implements Door {

    @Override
    public void draw() {
        System.out.println("Green Door");
    }

}
