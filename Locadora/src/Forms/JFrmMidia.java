package Forms;

import Controlers.*;
import Model.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class JFrmMidia extends javax.swing.JFrame {
    ArrayList<MidiaBean> list_midia;
    ArrayList<FornecedorBean> list_fornecedor;
    ArrayList<AutorBean> list_autor;
    ArrayList<DiretorBean> list_diretor;
    
    Object titulo[] = {"Código", "Título", "Valor Compra", "Valor Locação", "Quantidade"};
    Object grade[][] = null;
   
    DefaultTableModel model = new DefaultTableModel(grade, titulo);
   
    public JFrmMidia() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPanel = new javax.swing.JTabbedPane();
        jpListagemMidias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMidia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnEdit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpCadastroMidias = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbxFornecedor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jcbxGrupo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbxGenero = new javax.swing.JComboBox();
        jcbxCensura = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbxAutor = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jcbxDiretor = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jcbxCategoria = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jftData_lancamento = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtSinopse = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jftValor_compra = new javax.swing.JFormattedTextField();
        jftValor_locacao = new javax.swing.JFormattedTextField();
        jbtnSave = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jsQuantidade = new javax.swing.JSpinner();
        jbtnExit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(754, 674));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtbMidia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Valor compra", "Valor locação", "Quantidade"
            }
        ));
        jtbMidia.setRequestFocusEnabled(false);
        jtbMidia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbMidiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbMidia);

        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/edit-26.png"))); // NOI18N
        jbtnEdit.setText("Edit");
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });

        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/delete-26.png"))); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/Add.png"))); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnDelete)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpListagemMidiasLayout = new javax.swing.GroupLayout(jpListagemMidias);
        jpListagemMidias.setLayout(jpListagemMidiasLayout);
        jpListagemMidiasLayout.setHorizontalGroup(
            jpListagemMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(jpListagemMidiasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpListagemMidiasLayout.setVerticalGroup(
            jpListagemMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListagemMidiasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTPanel.addTab("Listagem de Mídias", jpListagemMidias);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jtxtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("Fornecedor:");

        jLabel3.setText("Grupo:");

        jcbxGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DVD", "VHS", "Blu-ray" }));
        jcbxGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbxGrupo.setName(""); // NOI18N

        jLabel4.setText("Censura:");

        jLabel5.setText("Genero:");

        jcbxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animação", "Ação", "Comédia", "" }));

        jcbxCensura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Livre", "Adulto", "Senior" }));

        jLabel6.setText("Titulo:");

        jLabel7.setText("Autor:");

        jLabel8.setText("Diretor:");

        jLabel9.setText("Categoria:");

        jcbxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Catalogo", "Lançamento" }));

        jLabel10.setText("Lançamento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jcbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jcbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jcbxCensura, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel8)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbxDiretor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jftData_lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbxCensura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jcbxDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jcbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jftData_lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jcbxGrupo.getAccessibleContext().setAccessibleName("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sinopse"));

        jtxtSinopse.setColumns(20);
        jtxtSinopse.setRows(5);
        jScrollPane2.setViewportView(jtxtSinopse);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setText("Valor de compra:");

        jLabel12.setText("Valor de locação:");

        jbtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/save-26.png"))); // NOI18N
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/available_updates-26.png"))); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jLabel13.setText("Qtd:");

        jsQuantidade.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jpCadastroMidiasLayout = new javax.swing.GroupLayout(jpCadastroMidias);
        jpCadastroMidias.setLayout(jpCadastroMidiasLayout);
        jpCadastroMidiasLayout.setHorizontalGroup(
            jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jftValor_compra)
                            .addComponent(jftValor_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroMidiasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSave)))
                .addContainerGap())
        );
        jpCadastroMidiasLayout.setVerticalGroup(
            jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jftValor_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jftValor_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(299, 299, 299))
                    .addGroup(jpCadastroMidiasLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnUpdate)
                            .addComponent(jbtnSave))
                        .addContainerGap())))
        );

        jTPanel.addTab("Cadastro de Mídia", jpCadastroMidias);

        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/exit-26.png"))); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Cadastro de Mídia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTPanel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jTPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        MidiaBean midia = new MidiaBean();
        try{
            while(jtbMidia.getSelectedRow() >=0){
                if(jtbMidia.getSelectedRow() >=0){
                    JOptionPane.showMessageDialog(null, "Este registro já existe");
                    clear();
                    jtxtId.requestFocus();
                }
                else
                    midia.setId(Integer.valueOf(jtxtId.getText()));
                    StringTokenizer fornecedor_st = new StringTokenizer(jcbxFornecedor.getSelectedItem().toString(), " - ");
                    StringTokenizer autor_st = new StringTokenizer(jcbxAutor.getSelectedItem().toString(), " - ");
                    StringTokenizer diretor_st = new StringTokenizer(jcbxAutor.getSelectedItem().toString(), " - ");
                    int fornecedor_id = Integer.valueOf(fornecedor_st.nextToken());
                    int autor_id = Integer.valueOf(autor_st.nextToken());
                    int diretor_id = Integer.valueOf(diretor_st.nextToken());
                    midia.setFornecedor(Read.searchRegisterFornecedor(fornecedor_id));
                    midia.setAutor(Read.searchAutor(autor_id));
                    midia.setDiretor(Read.searchDiretor(diretor_id));
                    midia.setGrupo(jcbxGrupo.getSelectedItem().toString());
                    midia.setGenero(jcbxGenero.getSelectedItem().toString());
                    midia.setCensura(jcbxCensura.getSelectedItem().toString());
                    midia.setTitulo(jtxtTitulo.getText());
                    midia.setCategoria(jcbxCategoria.getSelectedItem().toString());
                    midia.setData_lancamento(jftData_lancamento.getText());
                    midia.setSinopse(jtxtSinopse.getText());
                    midia.setValor_custo(jftValor_compra.getText());
                    midia.setValor_locacao(jftValor_locacao.getText());
                    midia.setQuantidade(Integer.parseInt(jsQuantidade.getValue().toString()));
                    Object campo[] = {
                        midia.getId(),
                        midia.getTitulo(),
                        midia.getValor_custo(),
                        midia.getValor_locacao(),
                        midia.getQuantidade()};
                    model.addRow(campo);
                    list_midia.add(midia);
                    Save.createFileMidia(list_midia);
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        clear();
        jtxtId.requestFocus();
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        StringTokenizer fornecedor_st = new StringTokenizer(jcbxFornecedor.getSelectedItem().toString(), " - ");
        StringTokenizer autor_st = new StringTokenizer(jcbxAutor.getSelectedItem().toString(), " - ");
        StringTokenizer diretor_st = new StringTokenizer(jcbxAutor.getSelectedItem().toString(), " - ");
        int fornecedor_id = Integer.valueOf(fornecedor_st.nextToken());
        int autor_id = Integer.valueOf(autor_st.nextToken());
        int diretor_id = Integer.valueOf(diretor_st.nextToken());
        int id = Integer.valueOf(jtxtId.getText());
        
        for (MidiaBean midia : list_midia) {
            if(midia.getId() == id){
                midia.setFornecedor(Read.searchRegisterFornecedor(fornecedor_id));
                midia.setAutor(Read.searchAutor(autor_id));
                midia.setDiretor(Read.searchDiretor(diretor_id));
                midia.setGrupo(jcbxGrupo.getSelectedItem().toString());
                midia.setGenero(jcbxGenero.getSelectedItem().toString());
                midia.setCensura(jcbxCensura.getSelectedItem().toString());
                midia.setTitulo(jtxtTitulo.getText());
                midia.setCategoria(jcbxCategoria.getSelectedItem().toString());
                midia.setData_lancamento(jftData_lancamento.getText());
                midia.setSinopse(jtxtSinopse.getText());
                midia.setValor_custo(jftValor_compra.getText());
                midia.setValor_locacao(jftValor_locacao.getText());
                midia.setQuantidade(Integer.parseInt(jsQuantidade.getValue().toString()));
                Save.createFileMidia(list_midia);
                JOptionPane.showMessageDialog(this, "Registro Alterado com sucesso!");
                
                Object campo[] = {
                    midia.getId(),
                    midia.getTitulo(),
                    midia.getValor_custo(),
                    midia.getValor_locacao(),
                    midia.getQuantidade()};
                model.insertRow(jtbMidia.getSelectedRow(), campo);
                model.removeRow(jtbMidia.getSelectedRow()+1);
                clear();
                jTPanel.setSelectedComponent(jPanel1);
                jTPanel.setEnabledAt(1, false);
                jbtnUpdate.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        int id = Integer.valueOf(jtxtId.getText());
        for(int i=0; i < list_midia.size(); i++){
            if(jtbMidia.isRowSelected(i)){
                model.removeRow(i);
                Delete.removeRegistroMidia(jtxtId.getText());
                JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            }
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtbMidia.setModel(model);
        
        this.list_midia = Read.readerFileMidia();
        this.list_fornecedor = Read.readerFileFornecedor();
        this.list_autor = Read.readerFileAutor();
        this.list_diretor = Read.readerFileDiretor();

        for(MidiaBean midia: list_midia){
            Object campo[] = {
                midia.getId(), 
                midia.getTitulo(),
                midia.getValor_custo(), 
                midia.getValor_locacao(), 
                midia.getQuantidade()};
            model.addRow(campo);
        }

        for(int i=0; i < list_diretor.size(); i++){
            DiretorBean diretor = list_diretor.get(i);
            jcbxDiretor.addItem(diretor.getId()+ " - "+
                                diretor.getNome());
        }
        
        for(int i=0; i < list_autor.size(); i++){
            AutorBean autor =  list_autor.get(i);
            jcbxAutor.addItem(autor.getId()+ " - "+
                              autor.getNome());
        }
        
        for(int i=0; i < list_fornecedor.size(); i++){
            FornecedorBean fornecedor = list_fornecedor.get(i);
            jcbxFornecedor.addItem(fornecedor.getId() + " - " +
                                   fornecedor.getRazao_social());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jtbMidiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbMidiaMouseClicked
        clear();
        for(int i=0; i < list_midia.size(); i++){
            
            if(jtbMidia.getValueAt(i, 0).equals(list_midia.get(i).getId())){
                if(jtbMidia.isRowSelected(i)){
                    jtxtId.setText(String.valueOf(jtbMidia.getValueAt(i, 0)));
                    jcbxFornecedor.setSelectedItem(list_midia.get(i).getFornecedor());
                    jcbxGrupo.setSelectedItem(list_midia.get(i).getGrupo());
                    jcbxGenero.setSelectedItem(list_midia.get(i).getGenero());
                    jcbxCensura.setSelectedItem(list_midia.get(i).getCensura());
                    jtxtTitulo.setText(list_midia.get(i).getTitulo());
                    jcbxAutor.setSelectedItem(list_midia.get(i).getAutor());
                    jcbxDiretor.setSelectedItem(list_midia.get(i).getDiretor());
                    jcbxCategoria.setSelectedItem(list_midia.get(i).getCategoria());
                    jftData_lancamento.setText(list_midia.get(i).getData_lancamento());
                    jtxtSinopse.setText(list_midia.get(i).getSinopse());
                    jftValor_compra.setText(list_midia.get(i).getValor_custo());
                    jftValor_locacao.setText(list_midia.get(i).getValor_locacao());
                    jsQuantidade.setValue(list_midia.get(i).getQuantidade());
                }
            }
        }
    }//GEN-LAST:event_jtbMidiaMouseClicked

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(null, "Deseja sair",null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed
        if(jtbMidia.getSelectedRow() >= 0){
            jTPanel.setEnabledAt(1, true);
            jTPanel.setSelectedComponent(jPanel2);
            jbtnUpdate.setEnabled(true);
            jbtnSave.setEnabled(false);
        }
        else
         JOptionPane.showMessageDialog(null, "Selecione um cliente");   
    }//GEN-LAST:event_jbtnEditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTPanel.setEnabledAt(1, true);
        jTPanel.setSelectedComponent(jPanel2);
        jbtnUpdate.setEnabled(false);
        jbtnSave.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clear(){
        jtxtId.setText(null);
        jtxtTitulo.setText(null);
    
        jftData_lancamento.setText(null);
        jftValor_compra.setText(null);
        jftValor_locacao.setText(null);
        jtxtSinopse.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTPanel;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox jcbxAutor;
    private javax.swing.JComboBox jcbxCategoria;
    private javax.swing.JComboBox jcbxCensura;
    private javax.swing.JComboBox jcbxDiretor;
    private javax.swing.JComboBox jcbxFornecedor;
    private javax.swing.JComboBox jcbxGenero;
    private javax.swing.JComboBox jcbxGrupo;
    private javax.swing.JFormattedTextField jftData_lancamento;
    private javax.swing.JFormattedTextField jftValor_compra;
    private javax.swing.JFormattedTextField jftValor_locacao;
    private javax.swing.JPanel jpCadastroMidias;
    private javax.swing.JPanel jpListagemMidias;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JTable jtbMidia;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextArea jtxtSinopse;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
