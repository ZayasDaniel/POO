package ico.fes;

import java.awt.*;

public class Balon {

    private String deporte;
    private String marca;
    private double precio;
    private Color color;
    private String superficieBalon;

    public Balon() {
    }

    public Balon(String deporte, String marca, double precio, Color color, String superficieBalon) {
        this.deporte = deporte;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.superficieBalon = superficieBalon;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSuperficieBalon() {
        return superficieBalon;
    }

    public void setSuperficieBalon(String superficieBalon) {
        this.superficieBalon = superficieBalon;
    }

    public String toString() {
        return "Balon{" +
                "deporte='" + deporte + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color=" + color +
                ", superficieBalon='" + superficieBalon + '\'' +
                '}';
    }

    public void rebotar(){
        System.out.println("El balón esta rebotando ");
    }

    public void patear(){
        System.out.println("El niño acaba de patear ese balón de la marca " + marca);
    }

    public void superficie(){
        System.out.println("Este balón esta hecho para una superficie de tipo " + superficieBalon );
    }
}
