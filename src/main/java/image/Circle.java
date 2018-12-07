package image;

import javafx.scene.paint.Color;

public class Circle implements Shape {

    private Point center;
    private int radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color){
        this.center = new Point(x, y);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        return (this.center.x - point.x) * (this.center.x - point.x) + (this.center.y - point.y) * (this.center.y - point.y) <= this.radius * this.radius;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.center.x, this.center.y, this.radius, this.color);
    }
}
