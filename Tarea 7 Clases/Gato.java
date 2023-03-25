package ico.fes;

import java.awt.*;

public class Gato {
    private String genero;
    private int edad;
    private String nombre;

    private Color color;

    public Gato() {
    }
    public Gato(String genero, int edad, String nombre, Color color) {
        this.genero = genero;
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "genero='" + genero + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", color=" + color +
                '}';
    }

    public void genero(){
        System.out.println("El genero del gato es " + genero );
    }

    public void nombre(){
        System.out.println("El nombre del gato es " + nombre );
    }

    public void color(){
        System.out.println("El color del gato es " + color );
    }

    public void maunar(){
        System.out.println("El gato esta maullando");
    }
}
