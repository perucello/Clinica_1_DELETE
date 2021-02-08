
package view;

import controller.PacienteDAODeletar;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PacienteDelete;


public class MDIAplication_FormDeletar_01 extends javax.swing.JFrame {


    public MDIAplication_FormDeletar_01() {
        initComponents();
//passo 3
        configurarFormulario();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtPaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Evolua - Deletar");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(110, 20, 220, 50);

        btnSair.setForeground(new java.awt.Color(255, 51, 51));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        desktopPane.add(btnSair);
        btnSair.setBounds(330, 130, 69, 21);

        btnDeletar.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        desktopPane.add(btnDeletar);
        btnDeletar.setBounds(100, 130, 140, 30);

        txtPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        desktopPane.add(txtPaciente);
        txtPaciente.setBounds(190, 90, 50, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID número   => ");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(70, 90, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
//passo 4 MONTAR VISUALIZAÇÃO -  AÇÃO BOTAO SAIR
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    
//passo 4 MONTAR VISUALIZAÇÃO -  AÇÃO BOTAO DELETAR
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        PacienteDelete p = new PacienteDelete();
        p.setId(Integer.parseInt(txtPaciente.getText()));
        PacienteDAODeletar d = new PacienteDAODeletar();
        d.deletar(p);
        estadoControle(true);
    }//GEN-LAST:event_btnDeletarActionPerformed


//METODO MAIN   
    
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
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIAplication_FormDeletar_01().setVisible(true);
            }
        });
    }

//VARIAVEIS DECLARADAS
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables

    
//Passo 1
     private void configurarFormulario(){
        this.setTitle("Java Intermediário - Escola Evolua Sumaré");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
       //txtPaciente.setEnabled(false); //Caso queira deixar false o botao, 
        estadoControle(true);   // add após criar estado controle   
    }
          
//passo 2
         private void estadoControle(boolean e){
         btnDeletar.setEnabled(e);
         txtPaciente.setText("");
    }    
         
         
         

}
