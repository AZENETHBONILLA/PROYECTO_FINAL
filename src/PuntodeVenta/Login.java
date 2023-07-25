 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PuntodeVenta;

import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import org.json.JSONObject;
import org.json.JSONException;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        USUARIO_BOX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        PASSWORD_BOX = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        USUARIO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        USUARIO_BOX.setBackground(new java.awt.Color(204, 204, 255));
        USUARIO_BOX.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        USUARIO_BOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIO_BOXActionPerformed(evt);
            }
        });
        getContentPane().add(USUARIO_BOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/login-usuario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 250, 250));

        SALIR.setBackground(new java.awt.Color(255, 255, 0));
        SALIR.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 100, 30));

        PASSWORD_BOX.setBackground(new java.awt.Color(204, 204, 255));
        PASSWORD_BOX.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        getContentPane().add(PASSWORD_BOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 250, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/585e4beacb11b227491c3399.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("ACCEDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 300, 30));

        USUARIO.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        USUARIO.setText("CONTRASEÑA");
        getContentPane().add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuntodeVenta/Grafic/paul-earle-wVjd0eWNqI8-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 420, 560));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HttpClient cliente = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    try {
                        JSONObject Usuarios = new JSONObject(status.getResult());
                        String Usuarioweb = Usuarios.getJSONObject("0").get("Usuario").toString();
                        String Passwordweb = Usuarios.getJSONObject("0").get("Password").toString();
                        Menu ventana= new Menu();
                        if (USUARIO_BOX.getText().toString().equals(Usuarioweb) && PASSWORD_BOX.getText().toString().equals(Passwordweb)) {       
                            ventana.setVisible(true);
                            dispose();
                        }
                    } catch (JSONException e) {

                    }
                }
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        String Usuario = USUARIO_BOX.getText().toString();
        String Password = PASSWORD_BOX.getText().toString();
        cliente.excecute("http://localhost/examen/login.php?Usuario=" + Usuario + "&Password=" + Password + "");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void USUARIO_BOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIO_BOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USUARIO_BOXActionPerformed

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
    private javax.swing.JPasswordField PASSWORD_BOX;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JTextField USUARIO_BOX;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
