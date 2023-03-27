public class MaquinaDeCafe {
    private int cantidadAgua;
    private int cantidadCafe;
    private int cantidadCrema;
    private int cantidadVasosTermicos;

    public MaquinaDeCafe() {
        cantidadAgua = 5000;
        cantidadCafe = 1000;
        cantidadCrema = 1500;
        cantidadVasosTermicos = 50;
    }

    public MaquinaDeCafe(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasosTermicos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasosTermicos = cantidadVasosTermicos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasosTermicos() {
        return cantidadVasosTermicos;
    }

    public void setCantidadVasosTermicos(int cantidadVasosTermicos) {
        this.cantidadVasosTermicos = cantidadVasosTermicos;
    }

    public String toString() {
        return "MaquinaDeCafe{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafe=" + cantidadCafe +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVasosTermicos=" + cantidadVasosTermicos +
                '}';
    }

    public boolean hacerAmericano() {
        if (cantidadAgua >= 180 && cantidadCafe >= 15) {
            cantidadAgua -= 180;
            cantidadCafe -= 15;
            cantidadVasosTermicos -= 1;
            System.out.println("Todavia hay ingredientes ");
            return true;
        } else {
            System.out.println("Ya no hay Ingredientes ");
        }return false;
    }

    public boolean hacerExpreso() {
        if (cantidadAgua >= 120 && cantidadCafe >= 20) {
            cantidadAgua -= 120;
            cantidadCafe -= 20;
            cantidadVasosTermicos -= 1;
            System.out.println("Todavia hay ingredientes ");
            return true;
        } else {
            System.out.println("Ya no hay Ingredientes ");
        } return false;
    }

    public boolean hacerCapuchino() {
        if (cantidadAgua >= 100 && cantidadCafe >= 14 && cantidadCrema >= 70) {
            cantidadAgua -= 100;
            cantidadCafe -= 14;
            cantidadCrema -= 70;
            cantidadVasosTermicos -= 1;
            System.out.println("Todavia hay ingredientes ");
            return true;
        } else {
            System.out.println("Ya no hay Ingredientes ");
        }return false;
    }

    public String obtenerCantidadIngredientes() {
        return "Cantidad de agua: " + cantidadAgua + " ml\n" +
                "Cantidad de café: " + cantidadCafe + " gr\n" +
                "Cantidad de crema: " + cantidadCrema + " ml\n" +
                "Cantidade de vasos: " + cantidadVasosTermicos + "\n";

    }

}
