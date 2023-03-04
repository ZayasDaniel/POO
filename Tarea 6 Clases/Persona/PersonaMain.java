public class PersonaMain {

    public static void main(String[] args) {

        Persona per = new Persona(18, "Daniel", 1.65, 47, "M");
        System.out.println(per);
        per.setPeso(87);
        System.out.println("Daniel pesa " + per.getPeso() );

        per.baniar();
        per.tomar();
        per.baniar();
    }
}
