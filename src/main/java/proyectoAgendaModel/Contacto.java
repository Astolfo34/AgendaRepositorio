package proyectoAgendaModel;

import java.util.ArrayList;

public class Contacto {
    /**
     * ATRIBUTOS
     */
    private  String nombre;
    private String alias;
    private  String direccion;
    private  String email;
    private  String telefono;
    private int edad;

    /**
     * constructor
     * @param nombre
     * @param alias
     * @param direccion
     * @param email
     * @param telefono
     */
    public Contacto(String nombre,String alias,String direccion,String email,String telefono,int edad) {
        this.telefono=telefono;
        this.nombre=nombre;
        this.alias=alias;
        this.direccion=direccion;
        this.email=email;
        this.edad=edad;
    }

    /**
     * getters y setters
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
