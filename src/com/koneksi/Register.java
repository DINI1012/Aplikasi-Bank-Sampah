/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.koneksi;

/**
 *
 * @author DINI
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jpassword = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        LevelUser = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelLogin.setText("REGISTER");
        getContentPane().add(LabelLogin);
        LabelLogin.setBounds(250, 80, 70, 26);

        Username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username);
        Username.setBounds(100, 180, 56, 26);

        jpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jpassword.setText("Password");
        getContentPane().add(jpassword);
        jpassword.setBounds(100, 230, 56, 26);
        getContentPane().add(UserName);
        UserName.setBounds(230, 180, 240, 22);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(230, 230, 240, 22);

        Register.setText("Register");
        getContentPane().add(Register);
        Register.setBounds(240, 350, 72, 23);

        LevelUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LevelUser.setText("Level User");
        getContentPane().add(LevelUser);
        LevelUser.setBounds(100, 270, 60, 17);

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "- Admin ", "- Customer" }));
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });
        getContentPane().add(pilihan);
        pilihan.setBounds(230, 270, 240, 22);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 140, 33, 17);
        getContentPane().add(Nama);
        Nama.setBounds(230, 140, 240, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/3b4e6cb6425487bf7d7016dc1de85b6f.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 560, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LevelUser;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Register;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel Username;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jpassword;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables

}
