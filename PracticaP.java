import java.util.Scanner;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class PracticaP {
  public static void main(String[] args) {
    /* 
    Scanner teclado = new Scanner (System.in);
    System.out.println("Programa para practicar ejercicios del libro  Capitulo 1 ");
    System.out.println("Introduce tu nombre: " );
    String nombre = teclado.nextLine();
    System.out.println("Bienvenido " + nombre );
    System.out.println("Introduce el texto que quieras");
    String texto = teclado.nextLine();
    System.out.println("---------------------------------------------------------------------------------------------------------");
   
    System.out.println("Wrappers");
    int i = 1234;
    System.out.println("El Int es = " + i);
    String a = Integer.toString(i);
    System.out.println("De tipo Int a String = " + a );
    String b = Integer.toBinaryString(i);
    System.out.println("De tipo Int a Binario = " + b );
    String c = Integer.toHexString(i);
    System.out.println("De tipo Int a Hexadecimal = " + c );
    String d = "1234";
    int j = Integer.parseInt(d);
    System.out.println("Convertimos una cadena de caracteres que representa un número en su equivalente en formato entero: " + j);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Valor entero expresado en sistema binario");
    int b1 = 0b00000101_00111001_01111111_10110001;
    System.out.println(b1);
    int b2 = 0b101_00111001_01111111_10110001;
    System.out.println(b2);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Valor entero expresado en sistema  hexadecimal");
    int c1 = 0b0101_00111001_01111111_10110001;
    int d1 = 0x5___3___9___7___F___B___1;
    int e = 0X05397FB1;
    System.out.println(c1);
    System.out.println(d1);
    System.out.println(e);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Valores enteros expresados en octal");
    int f = 0b101_001_110_010_111_111_110_110_001;
    int g = 05___1___6___2___7___7___6___6___1;
    int h = 000516277661;
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Ingrese su edad: ");
    int edad = teclado.nextInt();
    String mssg = (edad>=18) ?"Bienvenido":"Debe ser mayor de 18";
    System.out.println(mssg);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Pedir un numero de la semana y nos regresa el dia que es");
    int iDia = teclado.nextInt();
    String sDia = "";
    switch (iDia) {
      case 1:
          sDia = "Lunes";
          break;
      case 2:
          sDia = "Martes";
          break;
      case 3:
          sDia = "Miercoles";
          break;
      case 4:
          sDia = "Jueves";
          break;
      case 5:
          sDia = "Viernes";
          break;
      case 6:
          sDia = "Sabado";
          break;
      case 7:
          sDia = "Domingo";
          break;
      default:
          sDia = "Valor incorrecto";
    }

    System.out.println("Hoy es " + sDia);
    System.out.println("---------------------------------------------------------------------------------------------------------");
    
    System.out.println("Pedimos un dia y nos regresa el numero del dia que es");
    Scanner scanner = new Scanner (System.in);
    int iDia1 = 0;
    String sDia1 = scanner.nextLine();
    switch(sDia1)
    {
      case "Lunes":
          iDia1 = 1;
          break;
      case "Martes":
          iDia1 = 2;
          break;
      case "Miercoles":
          iDia1 = 3;
          break;
      case "Jueves":
          iDia1 = 4;
          break;
      case "Viernes":
          iDia1 = 5;
          break;
      case "Sabado":
          iDia1 = 6;
          break;
      case "Domingo":
          iDia1 = 7;
          break;
      default:
          System.out.println("El dia ingresado es incorrecto");
    }
    if( iDia1!=0)
    {
      String mssg1 = sDia1 + " es el dia " + iDia1 + " de la semana";
      System.out.println(mssg1);
    }
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para determinar la longitud de una cadena se usa .length() ");
    String s = "Hola a quien lea esto";
    int s1 = s.length();
    System.out.println(s1);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Con isEmpty() determinamos si una cadena es vacia ");
    String s11 = "Hola w";
    boolean b11 = s11.isEmpty();
    System.out.println(b11);
    String s2 = "";
    boolean b22 = s2.isEmpty(); 
    System.out.println(b22);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para acceder a los caracteres de una cadena");
    String t = "Hi, nice to meet you";
    for (int i4 = 0; i4 < t.length(); i4++) {
        char c4 = t.charAt(i4);
        System.out.println(c4);
    }
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para comparar dirreciones de memorias o si son iguales se usa == ");
    int l = 5;
    int p = 5;
    if(l==p){
        System.out.println("True");
    }
    System.out.println("Para comparar  dos cadenas de caracteres se usa .equals() ");
    String h1 = "Hola";
    String y = "Hola";
    if(h1.equals(y) ){
        System.out.println("True");           
    }
    System.out.println("---------------------------------------------------------------------------------------------------------");
    */
    System.out.println("Posicion de un caracter dentro de una cadena");
    String v = "Hola, como estas?";
    int v1 = v.indexOf('a');
    System.out.println(v1);
    int v2 = v.lastIndexOf('a');
    System.out.println(v2);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Determinar la posicion que ocupa una subcadena dentro de una cadena");
    String z = "Hola, como estas? Estas como querias?";
    int z1 = z.indexOf("como");
    int z2 = z.indexOf("?");
    int z3 = z.lastIndexOf("como");
    System.out.println(z1);
    System.out.println(z2);
    System.out.println(z3);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para poner toda una cadena de caracteres en mayuscula o minuscula se usa .toUpperCase() y .toLowerCase()");
    String may = z.toUpperCase();
    String min = z.toLowerCase();
    System.out.println(may);
    System.out.println(min);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para recibir subcadenas se usa .substring( inclusive , no inclusive ) ");
    String n1 = v.substring(0,5);
    String n2 = v.substring(6,10);
    System.out.println(n1);
    System.out.println(n2);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para concatenar cadenas  de caracteres se usa  StringBuilder var = new StringBuilder() y luego var.append ");
    StringBuilder var = new StringBuilder();
    var.append("Hola, ");
    var.append("chau");
    System.out.println(var);
    System.out.println("---------------------------------------------------------------------------------------------------------");

    System.out.println("Para modificar los caracteres de una cadena se usa el StringBuilder y el .setCharAt");
    var.setCharAt(2, 'x');
    System.out.println(var);
    //teclado.close();
    //scanner.close();
  }   
} 
