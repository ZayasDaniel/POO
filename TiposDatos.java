public class TiposDatos
{
  public static final double PI = 3.1416;
  public static void main (String[] args)
  {
    int edad = 10;
    System.out.println("Edad = " + edad);
    Integer edad2 = 10;
    System.out.println("Edad 2 = " + edad2.floatValue() );
    System.out.println( true && false );
    System.out.println( false || true );
    System.out.println("Pi = " + TiposDatos.PI );
    System.out.println("Hola \"Daniel\" ");

    var edad3 = 12;
    System.out.println(edad3);
    String x = "Hola";
    String y = "Hola";
    System.out.println( x == y );
    


  }


}