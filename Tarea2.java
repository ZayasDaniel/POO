import java.util.Scanner;

public class Tarea2
{
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa tu nombre, profesion y nacionalidad:  ");
    String input = scanner.nextLine();

    String[] nombres = input.split(" ");

    String nombre = nombres[0];
    String profesion = nombres[1];
    String nacionalidad = nombres[2];

    String n = nombre.toUpperCase();
    String p = profesion.toUpperCase();
    String a = nacionalidad.toUpperCase();

    System.out.println("Nombre: " + n);
    System.out.println("Profesion: " + p );
    System.out.println("Nacionalidad: " + a);
  }
}