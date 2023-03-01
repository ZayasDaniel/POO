import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese la cadena la cual solo debe aceptar caracteres  x,o y _
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de 9 caracteres ( X, O o _ ):");
        String cadena = scanner.nextLine();

        // Validamos que la cadena tenga exactamente 9 caracteres
        if (cadena.length() != 9) {
            System.out.println("La cadena debe tener exactamente 9 caracteres.");
            return;
        }

        // Validamos que la cadena solo contenga X, O o _
        for (int i = 0; i < 9; i++) {
            char c = cadena.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("La cadena solo puede contener X, O o _.");
                return;
            }
        }

        // Creaamos el marco del juego del gato
        String marco = " " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " \n";
        marco += "---+---+---\n";
        marco += " " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " \n";
        marco += "---+---+---\n";
        marco += " " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " \n";

        // Imprimimos la cadena y el marco
        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("Marco del juego del gato:");
        System.out.println(marco);
    }
}
