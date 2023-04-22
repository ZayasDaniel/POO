package ico.ejemplo2;

public class DriverVehiculo {

    public static void main(String[] args) {

        System.out.println("------Camión-------");
        Camion camion = new Camion("Diesel",3);
        System.out.println(camion);

        System.out.println( camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println( camion.apagar());
        System.out.println("------Motocicleta-------");
        Motocicleta moto = new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}
