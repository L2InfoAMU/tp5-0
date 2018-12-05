package image;

import javafx.scene.paint.Color;
import java.util.ArrayList;

public class PaletteRasterImage extends RasterImage{

    private int[][] pixels;
    private ArrayList<Color> colors;

    public PaletteRasterImage(Color color, int width, int height){
        super(color, width, height);
    }

    public PaletteRasterImage(Color[][] pixels){
        super(pixels);
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

    @Override
    public Color getPixelColor(int x, int y){
        return this.colors.get(this.pixels[x][y]);
    }
}
