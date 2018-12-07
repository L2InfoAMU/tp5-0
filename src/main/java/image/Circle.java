package image;

import javafx.scene.paint.Color;

public class Circle implements Shape {

    private Point center;
    private int radius;
    private Color color;


    /**
     * Crée un cercle avec les coordonnées de son centre, son rayon et sa couleur
     * @param x La position horizontale du centre du cercle
     * @param y La position verticale du centre du cercle
     * @param radius Le rayon du cercle
     * @param color La couleur du cercle
     */
    public Circle(int x, int y, int radius, Color color){
        this.center = new Point(x, y);
        this.radius = radius;
        this.color = color;
    }

    /**
     * Détermine si un point fait partie du cercle
     * @param point le point à vérifier
     * @return True si le point est dans le cercle, False sinon.
     */
    @Override
    public boolean contains(Point point) {
        return (this.center.x - point.x) * (this.center.x - point.x) + (this.center.y - point.y) * (this.center.y - point.y) <= this.radius * this.radius;
    }

    /**
     * Donne la couleur du cercle.
     * @return La couleur du cercle
     */
    @Override
    public Color getColor() {
        return this.color;
    }


    /**
     * Renvoie une référence vers un nouvel objet créé avec les mêmes attributs
     * @return Un nouvel objet ayant les mêmes attributs
     */
    @Override
    public Shape clone() {
        return new Circle(this.center.x, this.center.y, this.radius, this.color);
    }
}
