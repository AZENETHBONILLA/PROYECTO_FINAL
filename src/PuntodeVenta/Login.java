/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PuntodeVenta;


public class Login extends javax.swing.JFrame {

     // HttpClient cliente= HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    
    /*public String Mostrar(String URL){
        this.get = new HttpGet(URL);
        try{
           this.response= this.httpClient.execute(this.get);
           this.resource= EntityUtils.toString(this.response.getEntity());
            
        } catch (Exception e){
            System.out.println("ERROR"+ e.getMessage());
        }
        return this.resource;
    }*/
    
    //Creando los usuarios 
    String nombre="VENDEDOR", password="1234";
    String usuario="COMPRADOR", password2="5678";
    String usuario2="ADMINISTRADOR", password3="9101";
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        USUARIO_BOX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        USUARIO1 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        PASSWORD_BOX = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(USUARIO_BOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/login-usuario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 250, 250));

        USUARIO.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        USUARIO.setText("CONTRASEÑA");
        getContentPane().add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        USUARIO1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        USUARIO1.setText("USUARIO");
        getContentPane().add(USUARIO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, 40));

        SALIR.setBackground(new java.awt.Color(255, 255, 0));
        SALIR.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 20, 100, 30));
        getContentPane().add(PASSWORD_BOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 150, 40));

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/paul-earle-wVjd0eWNqI8-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu ventana= new Menu();
        if(USUARIO_BOX.getText().equals(nombre)&& PASSWORD_BOX.getText().equals(password)){
         ventana.setVisible(true);
         this.setVisible(false);
         }
        
         if(USUARIO_BOX.getText().equals(usuario)&& PASSWORD_BOX.getText().equals(password2)){
         ventana.setVisible(true);
         this.setVisible(false);
         }
                 
         if(USUARIO_BOX.getText().equals(usuario2)&& PASSWORD_BOX.getText().equals(password3)){
         ventana.setVisible(true);
         this.setVisible(false);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PASSWORD_BOX;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JLabel USUARIO1;
    private javax.swing.JTextField USUARIO_BOX;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
