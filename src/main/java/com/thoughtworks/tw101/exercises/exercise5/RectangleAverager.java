package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private Rectangle[] rectangles;

    public float averageArea(Rectangle[] rectangles) {
        this.rectangles = rectangles;
        int totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea = rectangle.area();
        }
        float averageArea = totalArea/rectangles.length;
        return averageArea;
    }
}
