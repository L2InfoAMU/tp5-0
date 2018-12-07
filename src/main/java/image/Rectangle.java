package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;


    /**
     * Crée un rectangle avec la position haut/gauche, sa largeur, hauteur et sa couleur
     * @param x La position horizontale du coin haut/gauche du rectangle
     * @param y La position verticale du coin haut/gauche du rectangle
     * @param width La largeur du rectangle
     * @param height La hauteur du rectangle
     * @param color La couleur du rectangle
     */
    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    /**
     * Détermine si un point est dans le rectangle
     * @param point Le point à vérifier
     * @return True si le point est contenu dans le rectangle, False sinon.
     */
    @Override
    public boolean contains(Point point) {
        return point.x >= this.x && point.x <= this.x + this.width && point.y >= this.y && point.y <= this.y + this.height;
    }


    /**
     * Donne la couleur du rectangle
     * @return La couleur du rectangle
     */
    @Override
    public Color getColor() {
        return this.color;
    }


    /**
     * Crée et renvoie un nouveau rectangle avec les mêmes attributs
     * @return Une référence vers un nouvel objet Rectangle ayant les mêmes attributs
     */
    @Override
    public Shape clone() {
        return new Rectangle(this.x, this.y, this.width, this.height, this.color);
    }
}
