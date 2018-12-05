package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

import java.util.Arrays;

public class BruteRasterImage implements Image {
    private int width;
    private int height;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height){
        setWidth(width);
        setHeight(height);
        this.createRepresentation();

        for (Color[] col : colors) {
            Arrays.fill(col, color);
        }
    }

    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);

        setWidth(getRowCount(colors));
        setHeight(getColumnCount(colors));
        this.createRepresentation();
        setPixelsColor(colors);
    }

    public void createRepresentation(){
        this.colors = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y] = color;
    }

    private void setPixelsColor(Color[][] pixels){
        for (int i = 0; i < this.width; i++)
            for (int j = 0; j < this.height; j++)
            {
                setPixelColor(pixels[i][j], i, j);
            }
    }

    private void setPixelsColor(Color color){
        for (int i = 0; i < this.width; i++)
            for (int j = 0; j < this.height; j++)
            {
                setPixelColor(color, i, j);
            }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return this.colors[x][y];
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}
