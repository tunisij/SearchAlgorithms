package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;
import com.umich.tunisij.environment.Node;

import java.util.Map;
import java.util.PriorityQueue;

public class AStarSearchAlgorithm implements SearchAlgorithm {

    PriorityQueue<Node> priorityQueue;

    @Override
    public void run(MazeContext mazeContext) {
        priorityQueue = new PriorityQueue<>((nodeA, nodeB) -> {
            int nodeADistance = nodeA.getDistance() + mazeContext.getManhattanDistanceToGoal(nodeA);
            int nodeBDistance = nodeB.getDistance() + mazeContext.getManhattanDistanceToGoal(nodeB);

            if (nodeADistance == nodeBDistance) {
                return Integer.parseInt(nodeA.getPrevious().getValue()) < Integer.parseInt(nodeB.getPrevious().getValue()) ? -1 : 1;
            }
            return nodeADistance < nodeBDistance ? -1 : 1;
        });

        Node startNode = mazeContext.getNode(Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN));
        priorityQueue.add(startNode);
        mazeContext.visit(startNode.getPosition());

        while (!priorityQueue.isEmpty()) {
            System.out.println(mazeContext.toString());
            priorityQueue.forEach(node -> System.out.println("Node " + node.getValue() + ": Distance: " + node.getDistance() + " + Manhattan: " + mazeContext.getManhattanDistanceToGoal(node) + " = " + (node.getDistance() + mazeContext.getManhattanDistanceToGoal(node))));

            Node node = priorityQueue.remove();

            mazeContext.getAdjacentPositions(node.getPosition()).forEach(neighborPosition -> {
                if (!mazeContext.isVisited(neighborPosition)) {
                    Node neighbor = mazeContext.getNode(neighborPosition);
                    neighbor.setPrevious(node);
                    neighbor.setDistance(node.getDistance() + mazeContext.getManhattanDistance(node, neighbor));
                    priorityQueue.add(neighbor);
                    mazeContext.visit(neighborPosition);
                }
            });
        }
    }
}
