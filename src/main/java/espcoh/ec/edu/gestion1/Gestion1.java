/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espcoh.ec.edu.gestion1;

import espcoh.ec.edu.gestion1.Controlador.Controlador;
import espcoh.ec.edu.gestion1.Vista.Vista;
import espcoh.ec.edu.gestion1.modelo.GestorTareas;

/**
 *
 * @author user
 */
public class Gestion1 {

    public static void main(String[] args) {
        Vista vista = new Vista();
        GestorTareas gestorTareas = new GestorTareas();
        Controlador controlador = new Controlador(vista, gestorTareas); // ✅ Ahora funciona
        vista.setVisible(true);
    }
}


  
        
        
        
        
    

