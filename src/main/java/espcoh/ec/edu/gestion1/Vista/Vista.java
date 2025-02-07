/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package espcoh.ec.edu.gestion1.Vista;

import espcoh.ec.edu.gestion1.Controlador.Controlador;
import espcoh.ec.edu.gestion1.modelo.GestorTareas;



public class Vista extends javax.swing.JFrame {

      private GestorTareas gestor;
      private Controlador controlador;

    
    public Vista() {
        initComponents();
        gestor = new GestorTareas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblTitulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtMenu = new javax.swing.JMenu();
        mnAgregarT = new javax.swing.JMenuItem();
        mnListaTP = new javax.swing.JMenuItem();
        mnListaTC = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("GESTION DE TAREAS");

        escritorio.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(236, 236, 236))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lblTitulo)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        txtMenu.setText("Menu");

        mnAgregarT.setText("Agregar Tareas");
        mnAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarTActionPerformed(evt);
            }
        });
        txtMenu.add(mnAgregarT);

        mnListaTP.setText("Lista de Tareas Pendientes");
        mnListaTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaTPActionPerformed(evt);
            }
        });
        txtMenu.add(mnListaTP);

        mnListaTC.setText("Lista de Tareas Completadas");
        mnListaTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaTCActionPerformed(evt);
            }
        });
        txtMenu.add(mnListaTC);

        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        txtMenu.add(mnSalir);

        jMenuBar1.add(txtMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarTActionPerformed
        AgregarTarea ventana = new AgregarTarea(gestor);
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mnAgregarTActionPerformed

    private void mnListaTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaTPActionPerformed
        TareasPendientes verventana = new TareasPendientes(gestor);
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_mnListaTPActionPerformed

    private void mnListaTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaTCActionPerformed
        TareasCompletadas verventana = new TareasCompletadas(gestor);
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_mnListaTCActionPerformed

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_mnSalirActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnAgregarT;
    private javax.swing.JMenuItem mnListaTC;
    private javax.swing.JMenuItem mnListaTP;
    private javax.swing.JMenuItem mnSalir;
    private javax.swing.JMenu txtMenu;
    // End of variables declaration//GEN-END:variables
}
