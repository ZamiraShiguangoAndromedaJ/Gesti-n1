/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.gestion1.Controlador;

import espcoh.ec.edu.gestion1.Vista.Vista;
import espcoh.ec.edu.gestion1.modelo.GestorTareas;
import espcoh.ec.edu.gestion1.modelo.Tarea;

/**
 *
 * @author user
 */
public class Controlador {

    
 
    private Tarea tarea;
    private Vista vista;
    private GestorTareas gestorTareas;

   public Controlador(Vista vista) {
        this.vista = vista;
        this.tarea = new Tarea();


    

    }

    public void agregarTarea(String titulo, String descripcion) {
        int id = gestorTareas.getCantidad() + 1; 
       // Tarea tarea = new Tarea(id, titulo, descripcion);
        gestorTareas.agregarTarea(tarea);
    }

    public Tarea[] obtenerTareasPendientes() {
        return gestorTareas.listarTareasPendientes();
    }

    public Tarea[] obtenerTareasCompletadas() {
        return gestorTareas.listarTareasCompletadas();
    }

    public boolean completarTarea(int id) {
        return gestorTareas.marcarComoCompletada(id);
    }
   

}
