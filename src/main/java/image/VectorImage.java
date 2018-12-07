package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Image {

    private List<Shape> shapes;
    private int width;
    private int height;

    VectorImage(List<Shape> shapes, int width, int height) {
        this.shapes = new ArrayList(); //Copie des formes contenues dans la liste envoyée au constructeur avec la méthode clone()
        for (Shape shape : shapes){
            this.shapes.add(shape.clone());
        }
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for (Shape i : this.shapes) {
            if (i.contains(new Point(x, y))){
                return i.getColor();
            }
        }
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}
