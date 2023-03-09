package ico.fes;

public class CuboRubik {

    private String orden;
    private String tamaño;
    private String precio;

    public CuboRubik() {
    }

    public CuboRubik(String orden, String tamaño, String precio) {
        this.orden = orden;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String toString() {
        return "CuboRubik{" +
                "orden='" + orden + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    public void jugar(){
        System.out.println("Daniel esta tratando de armar el cubo rubik de orden " + orden );
    }

    public void tamaño(){
        System.out.println("Daniel esta tratando de armar el cubo rubik de tamaño " + tamaño );
    }

    public void precio(){
        System.out.print("Ese cubo rubik le costo a Daniel " + precio );
        System.out.print( " pesos " );
    }
}
