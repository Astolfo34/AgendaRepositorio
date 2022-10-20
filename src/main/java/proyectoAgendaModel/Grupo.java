package proyectoAgendaModel;

public class Grupo {
    /**
     * ATRIBUTOS
     */
    private String nombre;
    private EnumCategoria categoria;
    Contacto listaContactos[]= new Contacto[10];


    /**
     * getters y setters
     */
    public EnumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * constructor
     * @param categoria
     * @param nombre
     */
    public Grupo(EnumCategoria categoria, String nombre) {
        this.categoria = categoria;
        this.nombre=nombre;

    }
}
