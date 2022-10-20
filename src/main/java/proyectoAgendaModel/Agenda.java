package proyectoAgendaModel;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto>listaContactos;
    private String nombreAgenda;

    private ArrayList<Reunion>listaReunionies;
    //private Contacto listaContactos[]=new Contacto[10];
    private ArrayList<Grupo>listaGrupos;


    // CRUD CONTACTO---------------------------------------------------------------------------------

    /**
     * metodo que crea un contacto en la lista total de contactos de la agenda
     * @param nuevoContacto
     * @return
     */
    public String crearContacto(Contacto nuevoContacto){
    String mensaje="";
    Contacto contactoExistente=null;
    try {
        contactoExistente=buscarContacto(nuevoContacto.getNombre(),nuevoContacto.getTelefono());
        if(contactoExistente==null){
            listaContactos.add(contactoExistente);
            mensaje="contacto creado";
        }
    } catch (contactoExeption e) {
        mensaje= e.getMessage();
    }

    return mensaje;
}

    /**
     * metodo que busca un contacto y devuelve el contacto si lo encuentra
     * @param nombre
     * @param telefono
     * @return
     * @throws contactoExeption
     */
    private Contacto buscarContacto(String nombre, String telefono)throws contactoExeption {
    Contacto contacto=null;
        for (Contacto contactoAux: listaContactos) {
            if(contactoAux.getNombre()==nombre&&contactoAux.getTelefono()==telefono){
                contacto=contactoAux;
                break;
            }

            if (contacto==null) {
                throw new contactoExeption("el contacto no existe");
            }
        }
    return contacto;
    }

    /**
     * metodo que obtiene un contacto para leerlo en toString
     * @param contacto
     * @return
     */
    public String obtenerContactoLeer(Contacto contacto) {
    String mensaje="";
        Contacto contactoHallado=null;
    try {
        contactoHallado=buscarContacto(contacto.getNombre(),contacto.getTelefono());
        mensaje=contactoHallado.toString();
    } catch (contactoExeption e) {
         mensaje=e.getMessage();
    }

    return  mensaje;
}

    /**
     * metodo que actualia un contacto
     * @param contacto
     * @return
     */
    public String actualizarContacto(Contacto contacto){
        String mensaje="";
    try {
        Contacto contactoHallado=buscarContacto(contacto.getNombre(),contacto.getTelefono());
        int posContacto=listaContactos.indexOf(contacto);
        listaContactos.set(posContacto,contactoHallado);
        mensaje= "contacto actualizado";
    } catch (contactoExeption e) {
        mensaje=e.getMessage();
    }

    return mensaje;
}
    public String eliminarContacto(Contacto contacto){
        String mensaje="";
        try {
            Contacto contactoHallado = buscarContacto(contacto.getNombre(),contacto.getTelefono());
            listaContactos.remove(contactoHallado);
            mensaje="contacto eliminado";
        } catch (contactoExeption e) {
            mensaje=e.getMessage();
        }

        return mensaje;
    }
    //-----------------------------------------CRUD GRUPO
    public String crearGrupo()
    // --------------------------------------- ejercicios----------------------------------------------------------

    /**
     * imprimir contactos de posiciones impares
     * @param listaContactos
     */
    public void mostrarContactsImpares(ArrayList<Contacto> listaContactos){

        for (int i = 0; i < listaGrupos.size(); i++) {
            int posAux= listaContactos.indexOf(listaGrupos.get(i));
            if(posAux%2!=0){
                String contactoImparAux=listaContactos.get(i).toString();
                System.out.println("Contact:"+contactoImparAux);
            }
        }
    }
    /**
     * obtener cual es la edad que mas se repide de los contactos
     */
public int obtenerEdadMasRepite(ArrayList<Contacto> contactos) {
    int edad=0;
    int [] edades=new int[contactos.size()];

    for (int i = 0; i < contactos.size(); i++) {
        edades[i] = contactos.get(i).getEdad();
    }
    for (int i = 0; i < edades.length; i++) {
        int mayor=edades[i];
        int menor=edades[i+1];
        if(mayor<menor){
            mayor=edades[i+1];
            menor=edades[i];
        }
    }
    return edad;
}
}
