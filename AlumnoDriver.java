public class AlumnoDriver{
    public static void main(String[] args){
        Alumno al1 = new Alumno();
        System.out.println(al1.toString());
        al1.estudiar(" Cálculo ");
        al1.setNombre(" Daniel ");
        al1.estudiar(" Calculo ");
        System.out.println(" -----al2----- ");
        Alumno al2 = new Alumno(" Dan ", 19);
        al2.estudiar(" Calculo");
    }
}