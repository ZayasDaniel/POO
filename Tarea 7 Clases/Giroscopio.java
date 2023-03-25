package ico.fes;

public class Giroscopio {

    private String marca;
    private String modelo;
    private String interfaz;
    private String precio;

    public Giroscopio() {
    }

    public Giroscopio(String marca, String modelo, String interfaz, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.interfaz = interfaz;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Giroscopio{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", interfaz='" + interfaz + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    public void inicar(){
        System.out.println("Inicializando analisis del giroscopio marca " + marca );
    }

    public void finalizar(){
        System.out.println("Finalizando analisis del giroscopio marca " + marca );
    }

    public void interfaz(){
        System.out.println("La interfaz  del giroscopio es: " + interfaz );
    }
}
