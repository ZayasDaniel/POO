import java.awt.*;

public class BicicletaMain {

    public static void main(String[] args) {
        Bicicleta bic = new Bicicleta("Argon", "18", Color.BLUE, 44000.0);
        System.out.println(bic);

        bic.enMovimiento();
        bic.reposo();
        bic.color();

        bic.setColor(Color.BLUE);
        System.out.println("El color de la bicicleta es :" + bic.getColor() );

        bic.setPrecio(650000.0);
        System.out.print("Daniel se asombroso al ver el precio de la bicicleta Argon el cual era " + bic.getPrecio() );
        System.out.print(" de pesos mexicanos ");
    }
}
