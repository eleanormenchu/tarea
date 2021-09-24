
package tarea;


public class Cursos {
    public String nombre; 
    public int nota;
    public String estado;

    public Cursos() {
        this.nombre = "";
        this.nota = 0;
        this.estado = "";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void mostrarNotas(){
        System.out.println(this.nombre +"\t\t\t"+ this.nota + "\t\t\t" + this.estado + "\n\n");
        
    }
    
}
