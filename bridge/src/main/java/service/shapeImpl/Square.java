package service.shapeImpl;

import service.Color;
import service.Shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void showInfoFigure() {
        System.out.println("This is square" + color.showColor());
    }
}
