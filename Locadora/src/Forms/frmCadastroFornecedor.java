package Forms;

import Controlers.*;
import Model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FrmCadastroFornecedor extends javax.swing.JFrame {

    ArrayList<FornecedorBean> list_fornecedores;
    
    Object titulo[] = {"Código", "Cnpj", "Razão Social", "Email"};
    Object grade[][] = null;
   
    DefaultTableModel model = new DefaultTableModel(grade, titulo);
    
   public FrmCadastroFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrbGroup_Situacao = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFornecedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jbtnEdit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtRazao_social = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtCnpj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtInscricao_estadual = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxtLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtNumero_logradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbxMunicipio = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jcbxUf = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jtxtCep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcbxPais = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNumero_residencial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtNumero_celular = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jbtnUpdate = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jrbAtivo = new javax.swing.JRadioButton();
        jrbInativo = new javax.swing.JRadioButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtbFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cnpj", "Razão Social", "Contato", "Situação"
            }
        ));
        jtbFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbFornecedor);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/delete-26.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/edit-26.png"))); // NOI18N
        jbtnEdit.setText("Edit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(jbtnEdit))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista de fornecedores", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Basicos"));

        jLabel1.setText("Código:");

        jLabel2.setText("Razão social:");

        jLabel3.setText("Cnpj:");

        jLabel4.setText("Inscrição estadual:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtRazao_social))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtInscricao_estadual, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtRazao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtxtInscricao_estadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel5.setText("Logradouro:");

        jLabel7.setText("Nº:");

        jLabel6.setText("Bairro:");

        jLabel8.setText("Município:");

        jcbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Londrina", "Ibiporã" }));

        jLabel9.setText("Uf:");

        jcbxUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PR" }));

        jLabel13.setText("Cep:");

        jLabel14.setText("País:");

        jcbxPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brasil" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jcbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtLogradouro)
                            .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtNumero_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jcbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNumero_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jcbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jcbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jLabel10.setText("Telefone:");

        jLabel11.setText("Celular:");

        jLabel12.setText("Email:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtNumero_residencial, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jtxtNumero_celular))
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtNumero_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumero_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/available_updates-26.png"))); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/save-26.png"))); // NOI18N
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnUpdate)
                .addGap(18, 18, 18)
                .addComponent(jbtnSave)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSave)
                    .addComponent(jbtnUpdate))
                .addContainerGap())
        );

        jrbGroup_Situacao.add(jrbAtivo);
        jrbAtivo.setSelected(true);
        jrbAtivo.setText("Ativo");

        jrbGroup_Situacao.add(jrbInativo);
        jrbInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jrbAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbInativo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAtivo)
                    .addComponent(jrbInativo))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro de fornecedor", jPanel2);

        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/exit-26.png"))); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnExit)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        FornecedorBean fornecedor = new FornecedorBean();
        try{    
            fornecedor.setId(Integer.valueOf(jtxtId.getText()));
            fornecedor.setCnpj(jtxtCnpj.getText());
            fornecedor.setInscricao_estadual(jtxtInscricao_estadual.getText());
            fornecedor.setRazao_social(jtxtRazao_social.getText());
            fornecedor.setCep(jtxtCep.getText());
            fornecedor.setLogradouro(jtxtLogradouro.getText());
            fornecedor.setNumero_logradouro(jtxtNumero_logradouro.getText());
            fornecedor.setBairro(jtxtBairro.getText());
            fornecedor.setMunicipio(jcbxMunicipio.getSelectedItem().toString());
            fornecedor.setUf(jcbxUf.getSelectedItem().toString());
            fornecedor.setPais(jcbxPais.getSelectedItem().toString());
            fornecedor.setNumero_residencial(jtxtNumero_residencial.getText());
            fornecedor.setNumero_celular(jtxtNumero_celular.getText());
            fornecedor.setEmail(jtxtEmail.getText());
            if(jrbAtivo.isSelected()==true)
                fornecedor.setSituacao("Ativo");
            if(jrbInativo.isSelected()==true)
                fornecedor.setSituacao("Inativo");
            
            Object campo[] = {  jtxtId.getText(),
                            jtxtCnpj.getText(),
                            jtxtRazao_social.getText(),
                            jtxtEmail.getText()
                            };
            model.addRow(campo);
            list_fornecedores.add(fornecedor);
            Save.createFileFornecedor(list_fornecedores);
            System.out.println("Salvo com sucesso");
            clear();
        }catch(Exception ex){
            System.out.println("Erro ao gravar");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.valueOf(jtxtId.getText());
        for (FornecedorBean fornecedor : list_fornecedores) {
            if(fornecedor.getId() == id){
                model.removeRow(jtbFornecedor.getSelectedRow());
                Delete.removeRegistroFornecedor(id);
                JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        int id = Integer.valueOf(jtxtId.getText());
        
        for (FornecedorBean fornecedor : list_fornecedores) { 
            if(fornecedor.getId() == id) {
                fornecedor.setId(id);
                fornecedor.setCnpj(jtxtCnpj.getText());
                fornecedor.setInscricao_estadual(jtxtInscricao_estadual.getText());
                fornecedor.setRazao_social(jtxtRazao_social.getText());
                fornecedor.setCep(jtxtCep.getText());
                fornecedor.setLogradouro(jtxtLogradouro.getText());
                fornecedor.setNumero_logradouro(jtxtNumero_logradouro.getText());
                fornecedor.setBairro(jtxtBairro.getText());
                fornecedor.setMunicipio(jcbxMunicipio.getSelectedItem().toString());
                fornecedor.setUf(jcbxUf.getSelectedItem().toString());
                fornecedor.setPais(jcbxPais.getSelectedItem().toString());
                fornecedor.setNumero_residencial(jtxtNumero_residencial.getText());
                fornecedor.setNumero_celular(jtxtNumero_celular.getText());
                fornecedor.setEmail(jtxtEmail.getText());
                if(jrbAtivo.isSelected() == true){
                    fornecedor.setSituacao("Ativo");}
                if(jrbInativo.isSelected()==true){
                    fornecedor.setSituacao("Inativo");}
                Update.updateFornecedor(fornecedor);
                
               
                Object campo[] = {  
                    fornecedor.getId(),
                    fornecedor.getCnpj(),
                    fornecedor.getRazao_social(),
                    fornecedor.getEmail()
                };
                model.insertRow(jtbFornecedor.getSelectedRow(), campo);
                model.removeRow(jtbFornecedor.getSelectedRow()+1);
                JOptionPane.showMessageDialog(this, "Registro Alterado com sucesso!"); 
                clear();
            }
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jtbFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbFornecedorMouseClicked
        String situacao = "";
        
        for(int i=0; i < list_fornecedores.size(); i++){
            
            if(jrbAtivo.isSelected()){
                situacao = "Ativo";}
            else if (jrbInativo.isSelected()){
                situacao = "Inativo";}
            if(jtbFornecedor.getValueAt(i, 0).equals(list_fornecedores.get(i).getId())){
                if(jtbFornecedor.isRowSelected(i)){
                    jtxtId.setText(String.valueOf(jtbFornecedor.getValueAt(i, 0)));
                    jtxtCnpj.setText(list_fornecedores.get(i).getCnpj());
                    jtxtInscricao_estadual.setText(list_fornecedores.get(i).getInscricao_estadual());
                    jtxtRazao_social.setText(list_fornecedores.get(i).getRazao_social());
                    jtxtCep.setText(list_fornecedores.get(i).getCep());
                    jtxtLogradouro.setText(list_fornecedores.get(i).getLogradouro());
                    jtxtNumero_logradouro.setText(list_fornecedores.get(i).getNumero_logradouro());
                    jtxtBairro.setText(list_fornecedores.get(i).getBairro());
                    jcbxMunicipio.setSelectedItem(list_fornecedores.get(i).getMunicipio());
                    jcbxUf.setSelectedItem(list_fornecedores.get(i).getUf());
                    jcbxPais.setSelectedItem(list_fornecedores.get(i).getPais());
                    jtxtNumero_residencial.setText(list_fornecedores.get(i).getNumero_residencial());
                    jtxtNumero_celular.setText(list_fornecedores.get(i).getNumero_celular());
                    jtxtEmail.setText(list_fornecedores.get(i).getEmail());
                    if(list_fornecedores.get(i).getSituacao().equals("Ativo")){
                        jrbAtivo.setSelected(true);
                    }
                    else {
                        jrbInativo.setSelected(true);
                    }
                    System.out.println(jtbFornecedor.getValueAt(i, 0));
                }
            }
        }
    }//GEN-LAST:event_jtbFornecedorMouseClicked

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtbFornecedor.setModel(model);
        this.list_fornecedores = Read.readerFileFornecedor();
        for(FornecedorBean fornecedor: list_fornecedores){
            Object campos[] = {fornecedor.getId(),
                                fornecedor.getCnpj(),
                                fornecedor.getRazao_social(),
                                fornecedor.getEmail()
                                };
            model.addRow(campos);
        }
    }//GEN-LAST:event_formWindowOpened
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try{
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
                }catch(Exception ex){}
                new FrmCadastroFornecedor().setVisible(true);
            }
        });
    }
    
    private void clear(){
        jtxtId.setText(null);
        jtxtCnpj.setText(null);
        jtxtInscricao_estadual.setText(null);
        jtxtRazao_social.setText(null);
        jtxtCep.setText(null);
        jtxtLogradouro.setText(null);
        jtxtNumero_logradouro.setText(null);
        jtxtBairro.setText(null);
        jtxtNumero_residencial.setText(null);
        jtxtNumero_celular.setText(null);
        jtxtEmail.setText(null);
        jtxtId.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox jcbxMunicipio;
    private javax.swing.JComboBox jcbxPais;
    private javax.swing.JComboBox jcbxUf;
    private javax.swing.JRadioButton jrbAtivo;
    private javax.swing.ButtonGroup jrbGroup_Situacao;
    private javax.swing.JRadioButton jrbInativo;
    private javax.swing.JTable jtbFornecedor;
    private javax.swing.JTextField jtxtBairro;
    private javax.swing.JTextField jtxtCep;
    private javax.swing.JTextField jtxtCnpj;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtInscricao_estadual;
    private javax.swing.JTextField jtxtLogradouro;
    private javax.swing.JTextField jtxtNumero_celular;
    private javax.swing.JTextField jtxtNumero_logradouro;
    private javax.swing.JTextField jtxtNumero_residencial;
    private javax.swing.JTextField jtxtRazao_social;
    // End of variables declaration//GEN-END:variables
}
