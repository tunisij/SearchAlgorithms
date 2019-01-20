package com.umich.tunisij.environment;

import java.util.Map;

public class Node {

    Map.Entry<Integer, Integer> position;
    String value;
    Node previous;
    int distance;
    boolean visited = false;

    public Node(Map.Entry<Integer, Integer> position, int distance, Node previous) {
        this.position = position;
        this.distance = distance;
        this.previous = previous;
    }

    public void visit(String value) {
        this.value = value;
        this.visited = true;
    }
}
