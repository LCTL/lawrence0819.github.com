import component.Labyrinth;

import factory.BlueStyleLabyrinthComponentFactory;
import factory.GreenStyleLabyrinthComponentFactory;
import factory.LabyrinthComponentFactory;

public class Main {

    public static void main(String[] args) {

        LabyrinthComponentFactory blueStyleLabyrinthComponentFactory = new BlueStyleLabyrinthComponentFactory();
        LabyrinthComponentFactory greenStyleLabyrinthComponentFactory = new GreenStyleLabyrinthComponentFactory();

        Labyrinth blueStyleLabyrinth = new Labyrinth(blueStyleLabyrinthComponentFactory);
        Labyrinth greenStyleLabyrinth = new Labyrinth(greenStyleLabyrinthComponentFactory);

        blueStyleLabyrinth.draw();

        System.out.println("------------------");

        greenStyleLabyrinth.draw();

    }

}
