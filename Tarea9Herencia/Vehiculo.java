package ico.fes.Herencia.Tarea;

public class Vehiculo {
    protected String tipoCombustible;
    protected String modelo;
    protected String tipotransmision;

    public Vehiculo() {
    }

    public Vehiculo(String tipoCombustible, String modelo, String tipotransmision) {
        this.tipoCombustible = tipoCombustible;
        this.modelo = modelo;
        this.tipotransmision = tipotransmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipotransmision() {
        return tipotransmision;
    }

    public void setTipotransmision(String tipotransmision) {
        this.tipotransmision = tipotransmision;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoCombustible=" + tipoCombustible +
                ", modelo='" + modelo + '\'' +
                ", tipotransmision='" + tipotransmision + '\'' +
                '}';
    }

    public void llenar(){
        System.out.println("Llenando tanque........");
    }

    public void vacio(){
        System.out.println("Tanque vacio!!!!!!!");
    }
}
