package ico.fes;

public class Computadora {

    private String marca;
    private double precio;
    private double pulgadas;

    public Computadora() {
    }

    public Computadora(String marca, double precio, double pulgadas) {
        this.marca = marca;
        this.precio = precio;
        this.pulgadas = pulgadas;
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

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pulgadas=" + pulgadas +
                '}';
    }

    public boolean encender(){
        System.out.println("Encendiendo la computadora de marca " + marca );
        return true;
    }

    public boolean apagar(){
        System.out.println("Apagando  la computadora de marca " + marca );
        return true;
    }

    public boolean precio(){
        System.out.println("El precio de la computadora  es de  " + precio );
        return true;
    }
}
