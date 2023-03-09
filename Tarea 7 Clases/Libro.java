package ico.fes;

public class Libro {

    private String autor;
    private String tituloLibro;
    private String genero;
    private String paginas;
    private String editorial;
    private double precio;

    public Libro() {
    }
    public Libro(String autor, String tituloLibro, String genero, String paginas, String editorial, double precio) {
        this.autor = autor;
        this.tituloLibro = tituloLibro;
        this.genero = genero;
        this.paginas = paginas;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", tituloLibro='" + tituloLibro + '\'' +
                ", genero='" + genero + '\'' +
                ", paginas=" + paginas +
                ", editorial='" + editorial + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void leyendo(){
        System.out.println("Daniel esta leyendo el libro " + tituloLibro);
    }

    public void genero(){
        System.out.println("Daniel esta leyendo un libro del género " + genero);
    }

    public void paginas(){
        System.out.print("Daniel esta leyendo un libro que tiene " + paginas );
        System.out.print( " paginas " );
    }
}
