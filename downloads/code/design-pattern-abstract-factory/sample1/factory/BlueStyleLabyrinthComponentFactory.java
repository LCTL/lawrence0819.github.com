package factory;

import component.Door;
import component.Road;
import component.Wall;
import component.blue.BlueDoor;
import component.blue.BlueRoad;
import component.blue.BlueWall;

public class BlueStyleLabyrinthComponentFactory implements
        LabyrinthComponentFactory {

    @Override
    public Wall createWall() {
        return new BlueWall();
    }

    @Override
    public Door createDoor() {
        return new BlueDoor();
    }

    @Override
    public Road createRoad() {
        return new BlueRoad();
    }

}
