
package view;

import controller.PacienteDAODeletar;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PacienteDelete;


public class MDIAplication_FormDeletar_04 extends javax.swing.JFrame {


    public MDIAplication_FormDeletar_04() {
        initComponents();
//passo 5
        configurarFormulario();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultado = new javax.swing.JTable();
        btnListarTodos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Evolua - DELETAR");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(270, 20, 320, 50);

        jTableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableResultado);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 780, 150);

        btnListarTodos.setBackground(new java.awt.Color(153, 255, 153));
        btnListarTodos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListarTodos.setText("Listar Todos");
        btnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodosActionPerformed(evt);
            }
        });
        desktopPane.add(btnListarTodos);
        btnListarTodos.setBounds(660, 250, 160, 40);

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 51, 51));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        desktopPane.add(btnSair);
        btnSair.setBounds(690, 440, 140, 50);

        btnAtivar.setBackground(new java.awt.Color(51, 51, 255));
        btnAtivar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAtivar.setText("Ativar Botão");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });
        desktopPane.add(btnAtivar);
        btnAtivar.setBounds(40, 310, 130, 50);

        btnDesativar.setBackground(new java.awt.Color(255, 255, 51));
        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDesativar.setText("Desativar Botão");
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        desktopPane.add(btnDesativar);
        btnDesativar.setBounds(40, 370, 130, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID número   => ");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(420, 260, 120, 30);

        txtPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        desktopPane.add(txtPaciente);
        txtPaciente.setBounds(540, 260, 50, 30);

        btnDeletar.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        desktopPane.add(btnDeletar);
        btnDeletar.setBounds(450, 300, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
//passo 5 MONTAR VISUALIZAÇÃO -  AÇÃO BOTAO LISTAR
    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        preencherTabela(new PacienteDAODeletar().listar());
    }//GEN-LAST:event_btnListarTodosActionPerformed

    
    
    
//passo 5 MONTAR VISUALIZAÇÃO -  AÇÃO BOTAO SAIR
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    

//passo 5 MONTAR VISUALIZAÇÃO -  AÇÃO BOTAO ATIVAR
    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        estadoControle(false);
    }//GEN-LAST:event_btnAtivarActionPerformed
//passo 5 MONTAR VISUALIZAÇÃO -  AÇÃO BOTAO DESATIVAR
    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
         //estadoControle(true);
        configurarFormulario();
    }//GEN-LAST:event_btnDesativarActionPerformed

/*    
passo 6 - EVENTO ONCLIQUE DA TABELA    
criar evento  manual   
CLICAR EM TABELA, EVENTO, MOUSE , CLICK
*/       
    private void jTableResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableResultadoMouseClicked
        int linha = jTableResultado.getSelectedRow();
        if(linha >= 0){
            //txtPaciente.setText(jTableResultado.getValueAt(linha, 0).toString());
/*            
//IMPORTANTE
//Para mostrar todos os dados, basta criar os txt e nomear as variaveis - estes nomes que coloquei são sugestoes de nomes de variaveis
            txtNOMEPACIENTE.setText(jTableResultado.getValueAt(linha, 1).toString());
            txtPESOPACIENTE.setText(jTableResultado.getValueAt(linha, 2).toString());
            txtALTURAPACIENTE.setText(jTableResultado.getValueAt(linha, 3).toString());

*/
        }
    }//GEN-LAST:event_jTableResultadoMouseClicked

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
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIAplication_FormDeletar_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MDIAplication_FormDeletar_04().setVisible(true);
            }
        });
    }

//VARIAVEIS DECLARADAS
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultado;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables

    
//Passo 1
     private void configurarFormulario(){
        this.setTitle("Java Intermediário - Escola Evolua Sumaré");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
       // txtPaciente.setEnabled(false); //Caso queira deixar false o botao, 
        estadoControle(true);   // add após criar estado controle     
        //preencherTabela(new PacienteDAODeletar().listar()); //para iniciar mostrando os dados da tabela
        configurarTabela();  //para iniciar sem mostrar dados da tabela
    }
     
     
//passo 2
         private void estadoControle(boolean e){
         btnAtivar.setEnabled(e);
         btnDesativar.setVisible(!e);

         btnListarTodos.setEnabled(!e);
         btnDeletar.setEnabled(!e);
    }
         
    
//Passo 3
     private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){ 
   
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
            
                m.addColumn("Id do Paciente");
                m.addColumn("Nome do Paciente");
                m.addColumn("Peso do Paciente");
                m.addColumn("Altura do Paciente"); 
                
                jTableResultado.setModel(m);
    }
    
//passo 4
         private void preencherTabela(List<PacienteDelete> lista){
        if(lista.size()>0){
            configurarTabela();
            DefaultTableModel m = (DefaultTableModel)jTableResultado.getModel();
            
            //for(PacienteSelect p : lista){
            lista.forEach((p) -> {
                m.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getPeso(), 
                    p.getAltura()
                }
                );
            });
            jTableResultado.setModel(m);
        }
    }
    
    
}
