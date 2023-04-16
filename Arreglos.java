public class Arreglos
{
  public static void main (String[] args)
  {
    int [] edades = new int [500];
    edades [0] = 18;
    edades [499]= 21;

    for (int i=0; i<500; i++)
    {
      
       System.out.println(" Edad " + (i+1) + " = " + edades [i]); 

    }
  }
}