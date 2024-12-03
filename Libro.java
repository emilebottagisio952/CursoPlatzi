public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
    
    // Getters y setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public boolean isDisponible() { return disponible; }
    
    // Métodos para préstamo
    public void prestar() { this.disponible = false; }
    public void devolver() { this.disponible = true; }
} 