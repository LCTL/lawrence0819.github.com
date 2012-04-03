package factory;

import component.Door;
import component.Road;
import component.Wall;
import component.green.GreenDoor;
import component.green.GreenRoad;
import component.green.GreenWall;

public class GreenStyleLabyrinthComponentFactory implements
        LabyrinthComponentFactory {

    @Override
    public Wall createWall() {
        return new GreenWall();
    }

    @Override
    public Door createDoor() {
        return new GreenDoor();
    }

    @Override
    public Road createRoad() {
        return new GreenRoad();
    }

}
