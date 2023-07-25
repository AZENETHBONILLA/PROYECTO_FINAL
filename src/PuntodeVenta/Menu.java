/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PuntodeVenta;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ESCRITORIO = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        PUNTODEVENTA = new javax.swing.JMenu();
        VENDER = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        REGISTRAR = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ACTUALIZAR = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ESCRITORIO.setBackground(new java.awt.Color(204, 153, 255));
        ESCRITORIO.setForeground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout ESCRITORIOLayout = new javax.swing.GroupLayout(ESCRITORIO);
        ESCRITORIO.setLayout(ESCRITORIOLayout);
        ESCRITORIOLayout.setHorizontalGroup(
            ESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        ESCRITORIOLayout.setVerticalGroup(
            ESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 255));

        PUNTODEVENTA.setBackground(new java.awt.Color(51, 51, 255));
        PUNTODEVENTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/pos-icon-free-vector.png"))); // NOI18N
        PUNTODEVENTA.setText("PUNTO DE VENTA");
        PUNTODEVENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUNTODEVENTAActionPerformed(evt);
            }
        });

        VENDER.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        VENDER.setText("VENTA");
        VENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENDERActionPerformed(evt);
            }
        });
        PUNTODEVENTA.add(VENDER);

        jMenuBar1.add(PUNTODEVENTA);

        jMenu2.setBackground(new java.awt.Color(51, 51, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/6850846.png"))); // NOI18N
        jMenu2.setText("REGISTRAR");

        REGISTRAR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        REGISTRAR.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        REGISTRAR.setText("PRODUCTOS");
        REGISTRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRARMouseClicked(evt);
            }
        });
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        jMenu2.add(REGISTRAR);
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(51, 51, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/4140789.png"))); // NOI18N
        jMenu3.setText("ACTUALIZAR");

        ACTUALIZAR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ACTUALIZAR.setText("INVENTARIO");
        ACTUALIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACTUALIZARMouseClicked(evt);
            }
        });
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jMenu3.add(ACTUALIZAR);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ESCRITORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ESCRITORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        registrar_productos verventana = new registrar_productos();
        ESCRITORIO.add(verventana);
        verventana.show();
    
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void REGISTRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRARMouseClicked

    }//GEN-LAST:event_REGISTRARMouseClicked

    private void ACTUALIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseClicked

    }//GEN-LAST:event_ACTUALIZARMouseClicked

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        actualizar_inventario verventana = new actualizar_inventario();
        ESCRITORIO.add(verventana);
        verventana.show();
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void PUNTODEVENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUNTODEVENTAActionPerformed

    }//GEN-LAST:event_PUNTODEVENTAActionPerformed

    private void VENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENDERActionPerformed
        realizar_venta verventana = new realizar_venta();
        ESCRITORIO.add(verventana);
        verventana.show();
    }//GEN-LAST:event_VENDERActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ACTUALIZAR;
    private javax.swing.JDesktopPane ESCRITORIO;
    private javax.swing.JMenu PUNTODEVENTA;
    private javax.swing.JMenuItem REGISTRAR;
    private javax.swing.JMenuItem VENDER;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
