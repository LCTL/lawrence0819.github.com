package factory;

import component.Door;
import component.Road;
import component.Wall;

public interface LabyrinthComponentFactory {

    public Wall createWall();

    public Door createDoor();

    public Road createRoad();

}
