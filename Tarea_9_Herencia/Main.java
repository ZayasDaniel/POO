package ico.fes.Herencia.Tarea;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Clase Vehiculo------");
        Vehiculo vehi = new Vehiculo("Gasolina","AMG","Manual");
        System.out.println(vehi);
        vehi.llenar();
        vehi.vacio();

        System.out.println("------Clase Automovil------");
        Automovil auto = new Automovil("Gasolina","AMG","Manual","V12",4, Color.BLACK);
        System.out.println(auto);
        auto.acelerar();
        auto.transm();

        System.out.println("------Clase Taxi------");
        Taxi tax = new Taxi("Gasolina","Tsuru","Manual","GA16DNE",4,Color.white,"1478LKUDG",15,"Diponible");
        System.out.println(tax);
        tax.libre();
        tax.tarifa();



    }
}
