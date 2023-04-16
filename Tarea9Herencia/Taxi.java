package ico.fes.Herencia.Tarea;

import java.awt.*;

public class Taxi extends Automovil {
    
    private String numeroLicencia;
    private int tarifa;
    private String disponibilidad;

    public Taxi() {
    }

    public Taxi(String tipoCombustible, String modelo, String tipotransmision, String tipoMotor, int numeroPuertas, Color color, String numeroLicencia, int tarifa, String disponibilidad) {
        super(tipoCombustible, modelo, tipotransmision, tipoMotor, numeroPuertas, color);
        this.numeroLicencia = numeroLicencia;
        this.tarifa = tarifa;
        this.disponibilidad = disponibilidad;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "numeroLicencia='" + numeroLicencia + '\'' +
                ", tarifa=" + tarifa +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color=" + color +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipotransmision='" + tipotransmision + '\'' +
                '}';
    }

    public void libre(){
        System.out.println("El taxi esta disponible.....");
    }

    public void tarifa(){
        System.out.println("El taxi tiene una tarifa inicial de " + tarifa + " pesos");
    }
}
