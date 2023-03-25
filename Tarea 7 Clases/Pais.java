package ico.fes;

import java.util.ArrayList;

public class Pais {

    private String pais;
    private String continente;
    private String hemisferio;
    private String idioma;

    public Pais() {
    }

    public Pais(String pais, String continente, String hemisferio, String idioma) {
        this.pais = pais;
        this.continente = continente;
        this.hemisferio = hemisferio;
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        ArrayList<String> continentes = new ArrayList<>();
        continentes.add("AMERICA");
        continentes.add("AFRICA");
        continentes.add("ASIA");
        continentes.add("EUROPA");
        continentes.add("OCEANIA");
        if(continentes.contains(continente.toUpperCase() ) ){
            this.continente = continente;
        }else{
            System.out.println("Este continente no existe!!!!");
        }
    }

    public String getHemisferio() {
        return hemisferio;
    }

    public void setHemisferio(String hemisferio) {
        ArrayList<String> hemisferios = new ArrayList<>();
        hemisferios.add("OCCIDENTAL");
        hemisferios.add("ORIENTAL");
        if(hemisferios.contains(hemisferio.toUpperCase() ) ) {
            this.hemisferio = hemisferio;
        }else{
            System.out.println("Este Hemisferio no existe!!!!");
        }

    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        ArrayList<String> idiomas = new ArrayList<>();
        idiomas.add("Español");
        idiomas.add("Inglés");
        idiomas.add("Desconocido");
        if(idioma.contains(idioma.toUpperCase() ) ) {
            this.idioma = idioma;
        }else{
            System.out.println("Este idioma no existe");
        }
    }

    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                ", continente='" + continente + '\'' +
                ", hemisferio='" + hemisferio + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }

    public void bienvenida(){
        System.out.println("Bienvenidos a " + pais );
        System.out.println("-----------------");
    }

    public void despedida(){
        System.out.println("Vuelva pronto a " + pais );
        System.out.println("-----------------");
    }

    public void idioma(){
        System.out.println("En este pais el idioma que domina la region es: " + idioma );
    }
}
