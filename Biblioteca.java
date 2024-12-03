public class Biblioteca{
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void eliminarLibro(String isbn){
        libros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    public Libro buscarLibro(String titulo){
        return libros.stream()
        .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
        .findFirst()
        .orElse(null);

    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void prestarLibro(String isbn, String idUsuario){
        Libro libro = libros.stream()
        .filter(l -> l.getIsbn().equals(isbn))
        .findFirst()
        .orElse(null);

        if (libro != null && libro.isDisponible()) {
            libro.prestar();
        }
    }

    public void devolverLibro(String isbn){
        Libro libro = libros.stream()
        .filter(l -> l.getIsbn().equals(isbn))
        .findFirst()
        .orElse(null);

        if (libro != null) {
            libro.devolver();
        }
    }
}