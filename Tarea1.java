public class  Tarea1
{
  public static void main (String[] args)
  {
     System.out.println(" \"Longitud de una Cadena por length:\" ");
      String carrera = "Ingenieria en Computación";
      System.out.println( " El tamaño de la cadena es = " + carrera.length() );

      System.out.println(" \"Determinar si una cadena es vacia por isEmpty:\" ");
      String q1 = "Hola";
      String w2 = ""; 
      System.out.println ( " s1 es vacia? = " + q1.isEmpty() );
      System.out.println ( " s2 es vacia? = " + w2.isEmpty() );

      System.out.println(" \"Acceder a los caracteres de una cadena:\"  ");
      String t = "Hola";
      for(int i=0; i<t.length(); i++ )
      {
        char c = t.charAt(i);
        System.out.println( "Los caracteres son = " + c );

      }

      System.out.println(" \"Comparar cadenas por equals:\" ");
      String x = "Hola";
      String y = "Hola";
      System.out.println("Las cadenas son iguales = " + x.equals(y) );

      System.out.println(" \"Subcadenas con substrings:\" ");
      String s = "Hola, como estas?";
      String s1 = s.substring(0,4);
      String s2 = s.substring(6,10);
      String s3 = s.substring(11); 
      System.out.println( "La subcadena s1 = " + s1 );
      System.out.println( "La subcadena s2 = " + s2 );
      System.out.println( "La subcadena s3 = " + s3 );

      System.out.println(" \"Posicion que ocupa un carcater dentro de una cadena con indexOf y lastIndexOf:\" ");
      String nombre = "Hola, como estas";
      System.out.println( nombre.indexOf("a") );
      System.out.println( nombre.lastIndexOf("a") );

      System.out.println ( " \"Uso de UpperCase y Lower case\" ");
      String h = "Hola, como estas";
      String o1 = h.toUpperCase();
      String o2 = h.toLowerCase();
      System.out.println(o1);
      System.out.println(o2);

      System.out.println(" \"Conversiones entre cadenas y numeros:\" ");

      System.out.println("1.- Enteros");
      String p1 = "1234";
      int i = Integer.parseInt(p1);
      String l1 = Integer.toString(i);
      System.out.println(i);
      System.out.println(l1);


      System.out.println("2.- flotantes");
      String p2 = "1234.56";
      double d = Double.parseDouble(p2);
      String l2 = Double.toString(d);
      System.out.println(d);
      System.out.println(l2);

      System.out.println(" \"Concatenar Cadenas\" ");
      String n = "Hola ";
      String m = "Daniel";
      String b = n+m;
      System.out.println(b);

      System.out.println(" \"Concatenar cadenas de caracteres\" ");
      StringBuilder sb = new StringBuilder();
      sb.append("Hola, ");
      sb.append("chau");
      System.out.println(sb);

      System.out.println(" \"Modificar los caracteres de una cadena\" ");
      StringBuilder sb2 = new StringBuilder("Hola");
      sb2.setCharAt(2, 'x');
      System.out.println(sb2);


      System.out.println(" \"Ejemplo de la pagina 27 de la clase StringBuilder\" ");
      StringBuilder hn = new StringBuilder("Hola niño ");
      hn.setCharAt(8, 'x');
      System.out.println(hn);









  }
}