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
    
    private Vista vista;
    private GestorTareas gestor;
    private Tarea tarea;

   public Controlador(Vista vista) {
        this.vista = vista;
        this.gestor = new GestorTareas();
        this.tarea = new Tarea();
    }
    
    
    
    
}
