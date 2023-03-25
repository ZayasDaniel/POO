package ico.fes;

import java.awt.*;

public class BalonDriver {

    public static void main(String[] args) {
        Balon bal = new Balon("Futbol Soccer","Voit", 700.00, Color.CYAN,"Cesped");
        System.out.println(bal);
        bal.rebotar();
        bal.patear();
        bal.superficie();
    }
}
