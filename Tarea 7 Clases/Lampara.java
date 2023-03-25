package ico.fes;

public class Lampara {

    private String marca;
    private String tipo;
    private String material;
    private String estilo;
    private double precio;

    public Lampara() {
    }
    public Lampara(String marca, String tipo, String material, String estilo, double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;
        this.estilo = estilo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", estilo='" + estilo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo la lampara de la marca " + marca );
    }

    public void apagar(){
        System.out.println("Apagando la lampara de la marca " + marca );
    }

    public void precio(){
        System.out.println("Esta lampara costo " + precio );
    }
}
