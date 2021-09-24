

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import tarea.Cursos;

public class Principal {

    public static Persona alumnos = new Persona();
    public static List<Persona> lista = new ArrayList();
    public static byte seleccion;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        eleccion();
    }

    public static void eleccion() {
        while (true) {
            System.out.println("\t\t\tSeleccione que quiere hacer \n\nIngresar nuevo alumno (1)\t\t\tDar listado de alumnos (2)\n\n"
                    + "Remover un alumno (3)" + "\t\t\tSalir y mostrar los alumnos agregados (4)");
            seleccion = sc.nextByte();
            switch (seleccion) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    listadoalumnos();
                    break;
                case 3:
                    retirar();
                    break;
                case 4:
                    fin();
                    break;
                default:
                    break;
            }
        }
    }

    public static void eleccion2() {
        System.out.println("\t\t\t\tSELECCIONE QUE QUIERE HACER\n\n"
                + "\t\tINGRESAR UN NUEVO ID PARA ELIMINAR (1) \t\tREGRESAR AL MENÚ PRINCIPAL (2)");
        seleccion = sc.nextByte();
        switch (seleccion) {
            case 1:
                retirar();
                break;
            case 2:
                eleccion();
                break;
            default:
                break;
        }
    }

    public static void ingresar() {
        Persona alumnos = new Persona();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        alumnos.setNombre(sc2.nextLine());
        
        System.out.println("Ingrese el apellido del alumno: ");
        alumnos.setApellido(sc2.nextLine());
        
        System.out.println("Ingrese la dirección del alumno: ");
        alumnos.setDirección(sc2.nextLine());
        
        System.out.println("Ingrese el ID del alumno: ");
        alumnos.setId(sc2.nextInt());
        
        
        // ingreso de lista de alumnos 
          List<Cursos> lista_Cursos = new ArrayList();
          System.out.println("Ingrese la cantidad de cursos a ingresar: ");
          int Ccursos=0;
          Ccursos= sc.nextInt();
          
          for (int i = 0; i < Ccursos; i++) {
              
              Cursos Curso = new Cursos();
              Scanner sc1 = new Scanner(System.in);
              System.out.println("Ingrese Nombre del curso: ");
              Curso.setNombre(sc1.nextLine());
              System.out.println("Ingrese la nota del curso: ");
              Curso.setNota(sc1.nextInt());
              if (Curso.getNota() >= 70) {
                  Curso.setEstado("Aprobado");
              }else{
                  Curso.setEstado("Reprobado");
              }  
              
              lista_Cursos.add(Curso);
        }
          
          //lista de cursos del alumno que esta en proceso.
          alumnos.lista = (List<Cursos>) lista_Cursos;
          
          
        if (existente(alumnos)) {
            System.out.println("El registro ya existe\n"
                    + "Intente agregar otro\n");
        } else {
            lista.add(alumnos);

        }
        eleccion();
        
          

          
        
    }

    public static boolean existente(Persona alumnos) {
        Iterator<Persona> iterador = lista.iterator();
        while (iterador.hasNext()) {
            if (alumnos.getId() == iterador.next().getId()) {
                System.out.println("----------Dato existente-----------");
                return true;
            }
        }
        return false;
    }

    public static void retirar() {
        int remover;
        Iterator<Persona> iterador = lista.iterator();
        
        System.out.println("\t\tSE DEBE DE INGRESAR EL ID DEL ALUMNO PARA ELIMINARLO\n\n"
                + "INGRESE EL ID DEL ALUMNO: ");
        remover = sc.nextInt();
        while (iterador.hasNext()) {
            if (remover == iterador.next().getId()) {
                iterador.remove();
            }
        }
        
        eleccion2();
    }

    public static void listadoalumnos() {
        System.out.println("NOMBRE\t\t\tAPELLIDO\t\t\t\tID\t\t\tDIRECCION");
        Iterator<Persona> iterador = lista.iterator();
        while (iterador.hasNext()) {
            iterador.next().mostrarDatos();
        }
        eleccion();
    }

    public static void fin() {
        System.out.println("NOMBRE\t\t\tAPELLIDO\t\t\t\tID\t\t\tDIRECCION");
        Iterator<Persona> iterador = lista.iterator();
        while (iterador.hasNext()) {
            iterador.next().mostrarDatos();
        }
        
        System.exit(0);
    }
}
