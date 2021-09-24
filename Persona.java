
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tarea.Cursos;



/**
 *
 * @author Eleanor
 */
public class Persona {   
    public String nombre;
    public String apellido;
    public String dirección;
    public int id;
    Cursos lista_Cursos = new Cursos();
    List<Cursos> lista = new ArrayList();
    
    
    public Persona(String nombre, String apellido, String direccion, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = direccion;
        this.id = id;
        this.lista = null;
    }

    public Cursos getLista_Cursos() {
        return lista_Cursos;
    }

    public void setLista_Cursos(Cursos lista_Cursos) {
        this.lista_Cursos = lista_Cursos;
    }

    public List<Cursos> getLista() {
        return lista;
    }

    public void setLista(List<Cursos> lista) {
        this.lista = lista;
    }
    
    public Persona (){
    }
    
    public void mostrarDatos(){
        
        System.out.println(this.nombre +"\t\t\t"+ this.apellido + "\t\t\t" + this.id + "\t\t\t" + this.dirección + "\n\n");
        System.out.println("---------Mostrando notas del alumno--------------");
        
        System.out.println("Curso\t\t\tNombre\t\t\tEstado");
        Iterator<Cursos> iterador = lista.iterator();
        while (iterador.hasNext()) {
            iterador.next().mostrarNotas();
        }
    }
    

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}