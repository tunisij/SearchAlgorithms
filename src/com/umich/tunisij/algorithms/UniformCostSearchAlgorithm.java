package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;
import com.umich.tunisij.environment.Node;

import java.util.Map;
import java.util.PriorityQueue;

public class UniformCostSearchAlgorithm implements SearchAlgorithm {

    PriorityQueue<Node> priorityQueue;
    
    @Override
    public void run(MazeContext mazeContext) {
        priorityQueue = new PriorityQueue<>((nodeA, nodeB) -> {
            if (nodeA.getDistance() == nodeB.getDistance()) {
                return Integer.parseInt(nodeA.getPrevious().getValue()) < Integer.parseInt(nodeB.getPrevious().getValue()) ? -1 : 1;
            }
            return nodeA.getDistance() < nodeB.getDistance() ? -1 : 1;
        });

        Node startNode = mazeContext.getNode(Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN));
        priorityQueue.add(startNode);
        mazeContext.visit(startNode.getPosition());

        while (!priorityQueue.isEmpty()) {
            System.out.println(mazeContext.toString());
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
