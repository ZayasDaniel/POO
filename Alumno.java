public class Alumno{

   private String nombre;
   private int edad;
   private String carrera;
   private int semestre;

   public Alumno(){}

    public Alumno(String nom , int ed){
      this.nombre = nom;
      this.edad = ed;  
    }

    public void setNombre(String n ){
        this.nombre = n;
    }

    public String getNombre(){return this.nombre;}
    public void setEdad(int e){
        this.edad = e;
    }

    public int getEdad(){return this.edad;}
    public String toString(){
        String edo = " Nombre: " + nombre + "\n";
        edo = edo + " Edad: " + edad;
        return edo;
    }

    public int estudiar(String tema){
        System.out.print(this.nombre + " Estudia " );
        System.out.println(tema);
        return 1;
    }

    public int programar(){
        System.out.print(this.nombre + " esta programando " );
        return 2;
    }

}