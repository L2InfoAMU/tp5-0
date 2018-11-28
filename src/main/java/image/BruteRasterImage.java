package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

import java.util.Arrays;

public class BruteRasterImage implements Image {
    private int width;
    private int height;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        colors = new Color[this.width][this.height];

        for (Color[] col : colors) {
            Arrays.fill(col, color);
        }
    }


    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
