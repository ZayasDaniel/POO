public class StringsIntro

{
  public static void main (String[] args)
  {
    String nombre = "Ingeniería en Computación, #1";
    System.out.println (nombre);
    System.out.println ("Tamaño cadena = " + nombre.length() );

    System.out.println ("Vacia? = " + nombre.isEmpty() );
    System.out.println ("Vacia? = " + "".isEmpty() );
    System.out.println (nombre.charAt(2) );


  }
  
}