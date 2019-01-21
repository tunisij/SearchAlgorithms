package com.umich.tunisij.environment;

import java.util.Map;

public class Node {

    private Map.Entry<Integer, Integer> position;
    private String value;
    private Node previous;
    private int distance;
    private boolean visited = false;

    public Node(Map.Entry<Integer, Integer> position, int distance, Node previous) {
        this.position = position;
        this.distance = distance;
        this.previous = previous;
    }

    public int getDepth() {
        if (previous == null) {
            return 0;
        }
        return previous.getDepth() + 1;
    }

    public void visit(String value) {
        this.value = value;
        this.visited = true;
    }

    public Map.Entry<Integer, Integer> getPosition() {
        return position;
    }

    public void setPosition(Map.Entry<Integer, Integer> position) {
        this.position = position;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
