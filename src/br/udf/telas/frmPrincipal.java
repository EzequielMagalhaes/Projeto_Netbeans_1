/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package br.udf.telas;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        inserirIcone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFundo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuAplicativo = new javax.swing.JMenu();
        itmSair = new javax.swing.JMenuItem();
        mnuCadastro = new javax.swing.JMenu();
        itmCadClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PROJETO NETBEANS");
        setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setResizable(false);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/udf/telas/images.png"))); // NOI18N

        mnuAplicativo.setMnemonic('f');
        mnuAplicativo.setText("Menu");

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setMnemonic('x');
        itmSair.setText("Sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        mnuAplicativo.add(itmSair);

        menuBar.add(mnuAplicativo);

        mnuCadastro.setText("Cadastros");

        itmCadClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadClientes.setText("Clientes");
        itmCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadClientesActionPerformed(evt);
            }
        });
        mnuCadastro.add(itmCadClientes);

        menuBar.add(mnuCadastro);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Deseja realmente sair?", "Aplicativo", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        this.dispose();
        }
    }//GEN-LAST:event_itmSairActionPerformed

    private void itmCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadClientesActionPerformed
        // TODO add your handling code here:
           if ((frmClientes == null) || (!frmClientes.isVisible()))
        {
            frmClientes = new frmClientes();
            frmClientes.setVisible(true);
        }

    }//GEN-LAST:event_itmCadClientesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmCadClientes;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAplicativo;
    private javax.swing.JMenu mnuCadastro;
    // End of variables declaration//GEN-END:variables

    private void inserirIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconCliente.png")));
    }
    //Declarando o objeto formClientes
    private frmClientes frmClientes;
}
