/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.gestion1.modelo;

/**
 *
 * @author sahid
 */
public class GestorTareas {
    private Tarea[] tareas; 
    private int cantidad;  
    public GestorTareas() {
        tareas = new Tarea[100];
        cantidad = 0;
    }

    public Tarea[] getTareas() {
        return tareas;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    public void agregarTarea(Tarea tarea) {
        if (cantidad < tareas.length) {
            tareas[cantidad] = tarea;
            cantidad++;
        } else {
            System.out.println("No se pueden agregar más tareas.");
        }
    }
    
    public Tarea[] listarTareasPendientes() {
        int contadorPendientes = 0;
        for (int i = 0; i < cantidad; i++) {
            if (!tareas[i].isCompletada()) {
                contadorPendientes++;
            }
        }
      
        Tarea[] pendientes = new Tarea[contadorPendientes];
        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            if (!tareas[i].isCompletada()) {
                pendientes[contador] = tareas[i];
                contador++;
            }
        }
        return pendientes;
    }
    
   
    public Tarea[] listarTareasCompletadas() {
        int contadorCompletadas = 0;
        for (int i = 0; i < cantidad; i++) {
            if (tareas[i].isCompletada()) {
                contadorCompletadas++;
            }
        }
        
        Tarea[] completadas = new Tarea[contadorCompletadas];
        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            if (tareas[i].isCompletada()) {
                completadas[contador] = tareas[i];
                contador++;
            }
        }
        return completadas;
    }
    
    public boolean marcarComoCompletada(int id) {
        for (int i = 0; i < cantidad; i++) {
            if (tareas[i].getId() == id) {
                tareas[i].setCompletada(true);
                return true;
            }
        }
        return false;
    }
}
