package ico.fes;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Clase Pais");
        Pais pais1 = new Pais("México", "America", "Occidental","Español");
        System.out.println(pais1);
        pais1.bienvenida();
        pais1.despedida();
        pais1.idioma();
        Pais pais2 = new Pais();
        pais2.setPais("Honduras");
        pais2.setContinente("America");
        pais2.setHemisferio("Occidental");
        pais2.setIdioma("ESPAÑOL");
        System.out.println( pais2.getPais() );
        System.out.println( pais2.getContinente() );
        System.out.println( pais2.getHemisferio() );
        System.out.println( pais2.getIdioma() );
        pais2.bienvenida();
        pais2.despedida();
        pais2.idioma();
        System.out.println("------------------------------------------");

        System.out.println("Clase Giroscopio");
        Giroscopio gir = new Giroscopio("Bosch Sensortec","BMI160","SPI", "100");
        System.out.println(gir);
        gir.inicar();
        gir.finalizar();
        gir.interfaz();
        System.out.println("------------------------------------------");

        System.out.println("Clase Computadora");
        Computadora comp = new Computadora("Asus",17000.0, 27.5 );
        System.out.println(comp);
        comp.encender();
        comp.apagar();
        comp.precio();
        System.out.println("------------------------------------------");

        System.out.println("Cubo de Rubik");
        CuboRubik cub = new CuboRubik("3x3","Normal","80");
        System.out.println(cub);
        cub.jugar();
        cub.tamaño();
        cub.precio();
        System.out.println("------------------------------------------");

        System.out.println("Clase Libro");
        Libro lib = new Libro("Pablo Augusto Sznajdleder","JAVA A FONDO","Didactico","344","Alfaomega",290.00);
        System.out.println(lib);
        lib.leyendo();
        lib.genero();
        lib.paginas();
        System.out.println("------------------------------------------");

        System.out.println("Clase Balón");
        Balon bal = new Balon("Futbol Soccer","Voit", 700.00, Color.CYAN,"Cesped");
        System.out.println(bal);
        bal.rebotar();
        bal.patear();
        bal.superficie();
        System.out.println("------------------------------------------");

        System.out.println("Clase Lámpara");
        Lampara lamp = new Lampara("ARLO","LED","Metal", "Moderno", 800);
        System.out.println(lamp);
        lamp.encender();
        lamp.apagar();
        lamp.precio();
        System.out.println("------------------------------------------");

        System.out.println("Clase Gato");
        Gato cat = new Gato("Macho",2,"Zafiro", Color.BLACK);
        System.out.println(cat);
        cat.genero();
        cat.nombre();
        cat.color();
        cat.maunar();
        System.out.println("------------------------------------------");

    }


}
