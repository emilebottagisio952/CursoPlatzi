public class Usuario {
    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;
    
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }
    
    // Getters y setters
    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public ArrayList<Libro> getLibrosPrestados() { return librosPrestados; }
} 