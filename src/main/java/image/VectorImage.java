package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Image {

    private List<Shape> shapes;
    private int width;
    private int height;


    /**
     * Crée une nouvelle VectorImage avec les formes données en paramètre, et la largeur et hauteur correspondantes.
     * @param shapes Une List de Shape déterminant l'image, qui sera copiée.
     * @param width La largeur de l'image
     * @param height La hauteur de l'image
     */
    VectorImage(List<Shape> shapes, int width, int height) {
        this.shapes = new ArrayList(); //Copie des formes contenues dans la liste envoyée au constructeur avec la méthode clone()
        for (Shape shape : shapes){
            this.shapes.add(shape.clone());
        }
        this.setWidth(width);
        this.setHeight(height);
    }


    /**
     * Donne la couleur du pixel donné en paramètre. Blanc par défaut si il n'est contenu dans aucune forme de la VectorImage.
     * @param x La position Horizontale du pixel
     * @param y La position Verticale du pixel
     * @return La couleur du pixel concerné, de type Color.
     */
    @Override
    public Color getPixelColor(int x, int y) {
        for (Shape i : this.shapes) {
            if (i.contains(new Point(x, y))){
                return i.getColor();
            }
        }
        return Color.WHITE;
    }


    /**
     * Donne la largeur actuelle de l'image
     * @return La largeur de l'image
     */
    @Override
    public int getWidth() {
        return this.width;
    }

    /**
     * Donne la hauteur actuelle de l'image
     * @return La hauteur de l'image
     */
    @Override
    public int getHeight() {
        return this.height;
    }


    /**
     * Modifie la largeur de l'image
     * @param width La nouvelle largeur
     */
    protected void setWidth(int width) {
        this.width = width;
    }

    /**
     * Modifie la hauteur de l'image
     * @param height La nouvelle hauteur
     */
    protected void setHeight(int height){
        this.height = height;
    }
}
