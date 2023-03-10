import java.util.Scanner;

public class Calcu{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Introduce el primer número:");
    double num1 = scanner.nextDouble();
    
    System.out.println("Introduce el segundo número:");
    double num2 = scanner.nextDouble();
    
    System.out.println("Introduce la operación (+,-,*,/):");
    char operation = scanner.next().charAt(0);
    
    double result;
    
    switch (operation){
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("Operación no válida");
        return;
    }
    
    System.out.println("El resultado es: " + result);
  }
}
