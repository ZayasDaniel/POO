import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LeerArchivo lectura = new LeerArchivo();
       //Primera opcion lectura.leer("datos.txt");

        try{
            lectura.metodoUno("datos.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}