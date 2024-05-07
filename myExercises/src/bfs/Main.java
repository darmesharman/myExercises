package bfs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        new Main().findDistance(-2, -2);
    }

    public void findDistance(int targetX, int targetY) {
        Coordinate target = new Coordinate(targetX, targetY);

        int layerNumber = 0;
        HashSet<Coordinate> previousLayer = new HashSet<>();
        HashSet<Coordinate> currentLayer = new HashSet<>(Collections.singleton(new Coordinate(0, 0)));

        while (!currentLayer.contains(target)) {
            HashSet<Coordinate> nextLayer = new HashSet<>();
            HashSet<Coordinate> finalPreviousLayer = previousLayer;

            currentLayer.forEach(coordinate ->
                    getKnightMoves(coordinate).forEach(nextCell -> {
                        if (!finalPreviousLayer.contains(nextCell)) {
                            nextLayer.add(nextCell);
                        }
                    })
            );

            previousLayer = currentLayer;
            currentLayer = nextLayer;
            layerNumber++;
        }

        System.out.println(layerNumber);
    }

    public static Set<Coordinate> getKnightMoves(Coordinate coordinate) {
        return Set.of(
                new Coordinate(coordinate.x() + 2, coordinate.y() + 1),
                new Coordinate(coordinate.x() + 2, coordinate.y() - 1),
                new Coordinate(coordinate.x() - 2, coordinate.y() + 1),
                new Coordinate(coordinate.x() - 2, coordinate.y() - 1),
                new Coordinate(coordinate.x() + 1, coordinate.y() + 2),
                new Coordinate(coordinate.x() + 1, coordinate.y() - 2),
                new Coordinate(coordinate.x() - 1, coordinate.y() + 2),
                new Coordinate(coordinate.x() - 1, coordinate.y() - 2));

    }

}


