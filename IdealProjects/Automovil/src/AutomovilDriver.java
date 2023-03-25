import java.awt.*;
public class AutomovilDriver {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        int edad = 12;
        Automovil auto3 = new Automovil("VM","Polo", (byte)15, Color.BLUE);
        System.out.println(auto3);
        Automovil auto4 = new Automovil(Color.RED);
        System.out.println(auto4);
        auto1.setMarca("Honda");
        System.out.println(auto1.getMarca() );
        auto1.setMarca("Una marca que no existe....");
        System.out.println("FIN");
    }
}
