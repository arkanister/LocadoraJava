package Locadora01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmCadastroCliente extends javax.swing.JFrame {
    ArrayList<ClienteBean> carregando_lista;
    
    public frmCadastroCliente() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.carregando_lista = Leitor.loaderFileCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnEditar = new javax.swing.JButton();
        jbtnRemover = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtnNovo = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();
        jbtnEditar1 = new javax.swing.JButton();
        jbtnRemover1 = new javax.swing.JButton();
        jcbxSituacao = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jtxtCpf = new javax.swing.JTextField();
        jtxtRg = new javax.swing.JTextField();
        jtxtNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jdtxtAniversario = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jtxtCep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtLogradouro = new javax.swing.JTextField();
        jtxtNumeroLogradouro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbxUf = new javax.swing.JComboBox();
        jcbxMunicipio = new javax.swing.JComboBox();
        jcbxPais = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jtxtNumeroTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtNumeroCelular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jbtnSearch = new javax.swing.JButton();

        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnRemover.setBackground(new java.awt.Color(255, 102, 102));
        jbtnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora01/Icons/delete/delete-32.png"))); // NOI18N
        jbtnRemover.setToolTipText("Remover");
        jbtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoverActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(650, 700));
        setMinimumSize(new java.awt.Dimension(650, 700));
        setPreferredSize(new java.awt.Dimension(650, 700));

        jbtnNovo.setBackground(new java.awt.Color(153, 255, 153));
        jbtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora01/Icons/save/save-32.png"))); // NOI18N
        jbtnNovo.setToolTipText("Adicionar");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jbtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora01/Icons/exit/exit-32.png"))); // NOI18N
        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        jbtnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora01/Icons/edit/edit-32.png"))); // NOI18N
        jbtnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditar1ActionPerformed(evt);
            }
        });

        jbtnRemover1.setBackground(new java.awt.Color(255, 102, 102));
        jbtnRemover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora01/Icons/delete/delete-32.png"))); // NOI18N
        jbtnRemover1.setToolTipText("Remover");
        jbtnRemover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemover1ActionPerformed(evt);
            }
        });

        jcbxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditar1)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRemover1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jcbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(jbtnRemover1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEditar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));
        jPanel1.setToolTipText("");
        jPanel1.setInheritsPopupMenu(true);

        jLabel10.setText("Cpf:");

        jLabel11.setText("Rg:");

        jLabel13.setText("Nome:");

        jLabel15.setText("Aniversário:");

        try {
            jdtxtAniversario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jdtxtAniversario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtNome)
                    .addComponent(jdtxtAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jdtxtAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("CEP:");

        jLabel2.setText("Logradouro:");

        jLabel3.setText("Nº:");

        jLabel4.setText("Bairro:");

        jLabel5.setText("Município:");

        jLabel6.setText("UF:");

        jLabel7.setText("País:");

        jcbxUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PR" }));

        jcbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Londrina", "Cambé", "Ibiporã" }));

        jcbxPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brasil" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtNumeroLogradouro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtxtNumeroLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jcbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jcbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtNumeroTelefone.setToolTipText("Digite o número de seu telefone");

        jLabel8.setText("Número:");

        jLabel14.setText("Email:");

        jtxtNumeroCelular.setToolTipText("Digite o número de seu telefone");

        jLabel16.setText("Celular:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Código:");

        jbtnSearch.setBackground(new java.awt.Color(120, 168, 219));
        jbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora01/Icons/search/search-26.png"))); // NOI18N
        jbtnSearch.setBorder(null);
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        ClienteBean cliente = new ClienteBean();
        
        cliente.setId(Integer.parseInt(jtxtId.getText()));
        cliente.setCpf(jtxtCpf.getText());
        cliente.setRg(jtxtRg.getText());
        cliente.setNome(jtxtNome.getText());
        cliente.setData_aniversario(jdtxtAniversario.getText());
        //Endereco.
        cliente.setCep(jtxtCep.getText());
        cliente.setLogradouro(jtxtLogradouro.getText());
        cliente.setNumero_logradouro(Integer.parseInt(jtxtNumeroLogradouro.getText()));
        cliente.setBairro(jtxtBairro.getText());
        cliente.setMunicipio(jcbxMunicipio.getSelectedItem().toString());
        cliente.setUf(jcbxUf.getSelectedItem().toString());
        cliente.setPais(jcbxPais.getSelectedItem().toString());
        //Contato.
        cliente.setNumero_telefone(jtxtNumeroTelefone.getText());
        cliente.setNumero_celular(jtxtNumeroCelular.getText());
        cliente.setEmail(jtxtEmail.getText());
        cliente.setSituacao(jcbxSituacao.getSelectedItem().toString());
        //Situacao Ativo ou Inativo
       
        carregando_lista.add(cliente);

        Salvar.saveFileCliente(carregando_lista);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        clear();
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        ClienteBean cliente = new ClienteBean();


        cliente.setId(Integer.parseInt(jtxtId.getText()));
        cliente.setCpf(jtxtCpf.getText());
        cliente.setRg(jtxtRg.getText());
        cliente.setNome(jtxtNome.getText());
        //Endereco.
        cliente.setCep(jtxtCep.getText());
        cliente.setLogradouro(jtxtLogradouro.getText());
        cliente.setNumero_logradouro(Integer.parseInt(jtxtNumeroLogradouro.getText()));
        cliente.setBairro(jtxtBairro.getText());
        cliente.setMunicipio(jcbxMunicipio.getSelectedItem().toString());
        cliente.setUf(jcbxUf.getSelectedItem().toString());
        cliente.setPais(jcbxPais.getSelectedItem().toString());
        //Contato.
        cliente.setNumero_telefone(jtxtCep.getText());
        cliente.setNumero_celular(jtxtCep.getText());
        cliente.setEmail(jtxtCep.getText());
        //Situacao Ativo ou Inativo
        cliente.setSituacao(jcbxSituacao.getSelectedItem().toString());

        for (int i = 0; i < carregando_lista.size(); i++) {
            if (cliente.getId() == carregando_lista.get(i).getId()) {
                Editar.editRegisterCliente(cliente);
                clear();
                JOptionPane.showMessageDialog(this, "Registro Alterado com sucesso!");

            } else {
                JOptionPane.showOptionDialog(this, "Campos Errados no cadastro", "Erro no Cadastro",
                        JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
            }
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoverActionPerformed
        ClienteBean cliente = new ClienteBean();
        boolean remover = Remover.removeRegistroCliente(jtxtId.getText());

        Integer msg = JOptionPane.showConfirmDialog(null, "TESTE", "MENSAGEM", JOptionPane.OK_OPTION);
        if (msg == JOptionPane.OK_OPTION) {
            remover = true;
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Nem tem este bagaça");
        }
    }//GEN-LAST:event_jbtnRemoverActionPerformed

    private void jbtnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditar1ActionPerformed
        ClienteBean cliente = new ClienteBean();


        cliente.setId(Integer.parseInt(jtxtId.getText()));
        cliente.setCpf(jtxtCpf.getText());
        cliente.setRg(jtxtRg.getText());
        cliente.setNome(jtxtNome.getText());
        //Endereco.
        
        cliente.setCep(jtxtCep.getText());
        cliente.setLogradouro(jtxtLogradouro.getText());
        cliente.setNumero_logradouro(Integer.parseInt(jtxtNumeroLogradouro.getText()));
        cliente.setBairro(jtxtBairro.getText());
        cliente.setMunicipio(jcbxMunicipio.getSelectedItem().toString());
        cliente.setUf(jcbxUf.getSelectedItem().toString());
        cliente.setPais(jcbxPais.getSelectedItem().toString());
        //Contato.
        cliente.setNumero_telefone(jtxtNumeroTelefone.getText());
        cliente.setNumero_celular(jtxtNumeroCelular.getText());
        cliente.setEmail(jtxtEmail.getText());
        //Situacao Ativo ou Inativo
        cliente.setSituacao(jcbxSituacao.getSelectedItem().toString());

        for (int i = 0; i < carregando_lista.size(); i++) {
            if (cliente.getId() == carregando_lista.get(i).getId()) {
                Editar.editRegisterCliente(cliente);
                clear();
                JOptionPane.showMessageDialog(this, "Registro Alterado com sucesso!");

            } else {
                JOptionPane.showOptionDialog(this, "Campos Errados no cadastro", "Erro no Cadastro",
                        JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
            }
        }
    }//GEN-LAST:event_jbtnEditar1ActionPerformed

    private void jbtnRemover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemover1ActionPerformed
        ClienteBean cliente = new ClienteBean();
        boolean remover = Remover.removeRegistroCliente(jtxtId.getText());

        Integer msg = JOptionPane.showConfirmDialog(null, "TESTE", "MENSAGEM", JOptionPane.OK_OPTION);
        if (msg == JOptionPane.OK_OPTION) {
            remover = true;
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Nem tem este bagaça");
        }
    }//GEN-LAST:event_jbtnRemover1ActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        search();
    }//GEN-LAST:event_jbtnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmCadastroCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEditar1;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnRemover;
    private javax.swing.JButton jbtnRemover1;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JComboBox jcbxMunicipio;
    private javax.swing.JComboBox jcbxPais;
    private javax.swing.JComboBox jcbxSituacao;
    private javax.swing.JComboBox jcbxUf;
    private javax.swing.JFormattedTextField jdtxtAniversario;
    private javax.swing.JTextField jtxtBairro;
    private javax.swing.JTextField jtxtCep;
    private javax.swing.JTextField jtxtCpf;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtLogradouro;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtNumeroCelular;
    private javax.swing.JTextField jtxtNumeroLogradouro;
    private javax.swing.JTextField jtxtNumeroTelefone;
    private javax.swing.JTextField jtxtRg;
    // End of variables declaration//GEN-END:variables
 private void clear(){
        jtxtId.setText(null);
        jtxtCpf.setText(null);
        jtxtRg.setText(null);
        jtxtNome.setText(null);
        jdtxtAniversario.setText(null);
        
        jtxtCep.setText(null);
        jtxtLogradouro.setText(null);
        jtxtNumeroLogradouro.setText(null);
        jtxtBairro.setText(null);
        jtxtNumeroTelefone.setText(null);
        jtxtNumeroCelular.setText(null);
        jtxtEmail.setText(null);
    }
 
 private void search(){
        String id = jtxtId.getText();
       
        ClienteBean cliente = Leitor.searchFileCliente(id);
        
        if (String.valueOf(cliente.getId()) != null) {
            jtxtId.setText(String.valueOf(cliente.getId()));
            jtxtCpf.setText(cliente.getCpf());
            jtxtRg.setText(cliente.getRg());
            jtxtNome.setText(cliente.getNome());
            jdtxtAniversario.setText(cliente.getData_aniversario());
        //Endereco.
            jtxtCep.setText(cliente.getCep());
            jtxtLogradouro.setText(cliente.getLogradouro());
            jtxtNumeroLogradouro.setText(String.valueOf(cliente.getNumero_logradouro()));
            jtxtBairro.setText(cliente.getBairro());
            jcbxMunicipio.setSelectedItem(cliente.getMunicipio());
            jcbxUf.setSelectedItem(cliente.getUf());
            jcbxPais.setSelectedItem(cliente.getPais());
        //Contato.
            jtxtNumeroTelefone.setText(cliente.getNumero_telefone());
            jtxtNumeroCelular.setText(cliente.getNumero_celular());
            jtxtEmail.setText(cliente.getEmail());
       
        //Situacao Ativo ou Inativo
            jcbxSituacao.setSelectedItem(cliente.getSituacao());
    }
        
        else
            JOptionPane.showMessageDialog(null, "O registro não pode ser encontrado");
    }

}
