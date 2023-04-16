public class Casting
{
  
  public static void main(String[] args)
  {
    char letra = ' ';
    byte val = 35;
    int val2 = 33;

    System.out.println ("Letra = " + letra );
    System.out.println ("Valor byte = " + val );
    System.out.println ("Valor 2 = " + val2 );

    letra = (char) val;

    System.out.println ("Letra = " + letra);
    val = (byte) val2;

    System.out.println ("Valor byte = " + val);
    System.out.println ("Valor 2 int = " + val2 );

    int a = 10;
    int b = 20;
    int c = 0;

    if (a<b)
    {
      c = a; 
    } else 
      {
        c = b;
        System.out.println("c = " + c);
        System.out.println("--------------------");
        c = a<b ? a:b;
        System.out.println("c =" + c);
        System.out.println("c = " + (a<b?a:b) );
      }   
  }
}