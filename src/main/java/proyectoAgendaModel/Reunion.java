package proyectoAgendaModel;

import java.util.ArrayList;

public class Reunion {
    /**
     * ATRIBUTOS
     */
    private String descripcion;
    private String fecha;
    private String hora;
    private ArrayList<Contacto> listaParticipantes;

    /**
     * getters y setters
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Contacto> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Contacto> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * constructor
     * @param descripcion
     * @param fecha
     * @param hora
     * @param listaParticipantes
     */
    public Reunion(String descripcion,String fecha, String hora,ArrayList listaParticipantes) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaParticipantes = listaParticipantes;
    }
}
