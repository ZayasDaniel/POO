package ico.fes.Herencia.Tarea;

import java.awt.*;

public class Automovil extends Vehiculo {

    protected String tipoMotor;
    protected int numeroPuertas;
    protected Color color;

    public Automovil() {
    }

    public Automovil(String tipoCombustible, String modelo, String tipotransmision, String tipoMotor, int numeroPuertas, Color color) {
        super(tipoCombustible, modelo, tipotransmision);
        this.tipoMotor = tipoMotor;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
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
                "tipoMotor='" + tipoMotor + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color=" + color +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipotransmision='" + tipotransmision + '\'' +
                '}';
    }

    public void acelerar(){
        System.out.println("El automovil modelo " + modelo + " esta acelerando");
    }

    public void transm(){
        System.out.println("El automovil tiene una transmision de tipo " + tipotransmision);
    }
}
