package viewer;

import image.Point;
import image.Shape;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        return point.x >= this.x && point.x <= this.x + this.width && point.y >= this.y && point.y <= this.y + this.height;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
