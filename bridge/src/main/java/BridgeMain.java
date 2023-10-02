import service.Shape;
import service.colorImpl.Blue;
import service.colorImpl.Red;
import service.shapeImpl.Square;
import service.shapeImpl.Triangle;

public class BridgeMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Blue());
        triangle.showInfoFigure();

        Shape square = new Square(new Red());
        square.showInfoFigure();
    }
}
