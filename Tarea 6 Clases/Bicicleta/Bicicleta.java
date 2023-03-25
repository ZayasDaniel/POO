import java.awt.*;
import java.util.ArrayList;

public class Bicicleta {

    private String marca;
    private String modelo;
    private Color color;
    private double precio;

    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, Color color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("Specialized");
        marcas.add("Scott");
        marcas.add("Trek");
        marcas.add("Argon");
        if (marcas.contains(marca.toUpperCase() ) ){
            this.marca = marca;
        }else{
            System.out.println("Esta marca no esta disponible");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", precio=" + precio +
                '}';
    }

    public boolean enMovimiento(){
        System.out.println("La bicicleta esta en movimiento de la marca: " + marca );
        return true;
    }

    public boolean reposo(){
        System.out.println("La bicicleta esta en reposo de la marca: " + marca );
        return true;
    }

    public void color(){
        System.out.println("La bicicleta es de color: " + color);
    }

}

