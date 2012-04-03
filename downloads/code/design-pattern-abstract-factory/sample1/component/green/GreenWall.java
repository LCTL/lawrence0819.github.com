package component.green;

import component.Wall;

public class GreenWall implements Wall {

    @Override
    public void draw() {
        System.out.println("Green Wall");
    }

}
