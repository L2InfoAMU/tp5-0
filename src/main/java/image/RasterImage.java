package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

abstract class RasterImage implements Image{

    int height;
    int width;

    public abstract void createRepresentation();
    public abstract void setPixelColor(Color color, int x, int y);
    public abstract Color getPixelColor(int x, int y);

    public RasterImage(Color[][] colors){
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);

        setWidth(getRowCount(colors));
        setHeight(getColumnCount(colors));
        createRepresentation();
        setPixelsColor(colors);
    }

    public RasterImage(Color color, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    public void setPixelsColor(Color[][] pixels){
        for (int i = 0; i < this.getWidth(); i++){
            for (int j = 0; j < this.getHeight(); j++){
                setPixelColor(pixels[i][j], i, j);
            }
        }
    }

    private void setPixelsColor(Color color){
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++){
                setPixelColor(color, i, j);
            }
        }
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
