import java.awt.*;
import java.util.ArrayList;

public class Automovil {

    //Atributos
    private String marca;
    private String subMarca;
    private byte modelo;
    private Color color;

    public Automovil() { //constructor por defecto
    }

    public Automovil(String marca, String subMarca, byte modelo, Color color) { // Constructor Sobrecargado
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("TOYOTA");
        marcas.add("NISSAN");
        marcas.add("VM");
        marcas.add("HONDA");
        marcas.add("TESLA");
        if(marcas.contains(marca.toUpperCase() ) ){
            this.marca = marca;
        }else{
            System.out.println("No existe!!!!");
        }
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }
}
