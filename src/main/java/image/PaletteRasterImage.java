package image;

import javafx.scene.paint.Color;
import java.util.ArrayList;
import static util.Matrices.*;

public class PaletteRasterImage implements Image{

    private int width;
    private int height;
    private int[][] pixels;
    private ArrayList<Color> colors;

    public PaletteRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);
        this.createRepresentation();
        this.setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        setWidth(getRowCount(pixels));
        setHeight(getColumnCount(pixels));
        this.createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation(){
        this.pixels = new int[this.getWidth()][this.getHeight()];
        this.colors = new ArrayList<Color>();
    }

    public void setPixelColor(Color color, int x, int y){
        if (!colors.contains(color)){
            colors.add(color);
        }
        this.pixels[x][y] = this.colors.indexOf(color);
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

    @Override
    public Color getPixelColor(int x, int y){
        return this.colors.get(this.pixels[x][y]);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
}
