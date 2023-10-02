package service.shapeImpl;

import service.Color;
import service.Shape;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void showInfoFigure() {
        System.out.println("This is triangle" + color.showColor());
    }
}
