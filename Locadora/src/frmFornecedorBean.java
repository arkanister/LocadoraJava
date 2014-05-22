import com.sun.org.apache.xerces.internal.impl.dtd.models.DFAContentModel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmFornecedorBean extends javax.swing.JFrame {
    ArrayList<FornecedorBean> carregando_lista;
    int current = 0;
    
    //Inicializando a lista de fornecedores.
    public frmFornecedorBean() {
        initComponents();
        this.carregando_lista = Leitor.loaderFile();
       
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtIe = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalvar.setText("Save");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIe, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        FornecedorBean fornecedor = new FornecedorBean();
        
        fornecedor.setId(Integer.parseInt(txtId.getText()));
        fornecedor.setCnpj(txtCnpj.getText());
        fornecedor.setIe(txtIe.getText());
        fornecedor.setRazao_social(txtRazaoSocial.getText());

        carregando_lista.add(fornecedor);

        Salvar.saveFile(carregando_lista);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String cnpj = txtCnpj.getText();
        String ie = txtIe.getText();
        String razao_social = txtRazaoSocial.getText();
        
        FornecedorBean fornecedor = Leitor.searchRegister(id);
        
        if (String.valueOf(fornecedor.getId()) != null) {
            txtId.setText(String.valueOf(fornecedor.getId()));
            
            txtCnpj.setText(fornecedor.getCnpj());
            txtIe.setText(fornecedor.getIe());
            txtRazaoSocial.setText(fornecedor.getRazao_social());
            
        }
        
        else
            JOptionPane.showMessageDialog(null, "O registro não pode ser encontrado");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        FornecedorBean fornecedor = new FornecedorBean();
        boolean remover = Delete.removeRegistro(txtId.getText());
        
        Object msg = JOptionPane.showConfirmDialog(null, "TESTE", "MENSAGEM", JOptionPane.OK_OPTION);
        if(msg == JOptionPane.OK_OPTION){
            remover = true;
            clear();
        }
        else
            JOptionPane.showMessageDialog(null, "Nem tem este bagaça");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        FornecedorBean fornecedor = new FornecedorBean();
        

        fornecedor = new FornecedorBean();
        
        fornecedor.setId(Integer.parseInt(txtId.getText()));
        fornecedor.setCnpj(txtCnpj.getText());
        fornecedor.setIe(txtIe.getText());
        fornecedor.setRazao_social(txtRazaoSocial.getText());
        for(int i=0; i < carregando_lista.size();i++) 
            if(fornecedor.getId()==carregando_lista.get(i).getId()){
            Editar.editRegister(fornecedor);
            clear();
            JOptionPane.showMessageDialog(this, "Registro Alterado com sucesso!");

            } 
            else {
            JOptionPane.showOptionDialog(this, "Campos Errados no cadastro", "Erro no Cadastro",
                JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
        }
    }//GEN-LAST:event_btnEditActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFornecedorBean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFornecedorBean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFornecedorBean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFornecedorBean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmFornecedorBean().setVisible(true);
            }
        });
        
        
        
        
        
    }
    private void clear(){
        txtId.setText(null);
        txtCnpj.setText(null);
        txtIe.setText(null);
        txtRazaoSocial.setText(null);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIe;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
