// Clase Libro
public class Libro {
    private String titulo;
    private String autor;
    private int a;

    // Constructor
    public Libro(String titulo, String autor, int a) {
        this.titulo = titulo;
        this.autor = autor;
        this.a = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + a + ")";
    }
}
