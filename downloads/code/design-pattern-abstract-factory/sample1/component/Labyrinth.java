package component;

import java.util.Random;

import factory.LabyrinthComponentFactory;

public class Labyrinth implements Component {

    private LabyrinthComponentFactory labyrinthFactory;

    public Labyrinth(LabyrinthComponentFactory labyrinthFactory) {
        this.labyrinthFactory = labyrinthFactory;
    }

    @Override
    public void draw() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(15)) {
            case 0:
                labyrinthFactory.createDoor().draw();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                labyrinthFactory.createRoad().draw();
                break;
            default:
                labyrinthFactory.createWall().draw();
                break;
            }
        }

    }

}
