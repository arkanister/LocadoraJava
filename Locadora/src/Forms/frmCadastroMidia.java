package Forms;

import Controlers.*;
import Model.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FrmCadastroMidia extends javax.swing.JFrame {
    ArrayList<MidiaBean> list_midia;
    ArrayList<FornecedorBean> list_fornecedor;
    ArrayList<AutorBean> list_autor;
    ArrayList<DiretorBean> list_diretor;
    
    Object titulo[] = {"Código", "Título", "Valor Compra", "Valor Locação", "Quantidade"};
    Object grade[][] = null;
   
    DefaultTableModel model = new DefaultTableModel(grade, titulo);
   
    public FrmCadastroMidia() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jptAbas = new javax.swing.JTabbedPane();
        jpListagemMidias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMidia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnEdit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
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

        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Icons/delete-26.png"))); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jbtnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnDelete)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDelete)
                    .addComponent(jbtnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpListagemMidiasLayout = new javax.swing.GroupLayout(jpListagemMidias);
        jpListagemMidias.setLayout(jpListagemMidiasLayout);
        jpListagemMidiasLayout.setHorizontalGroup(
            jpListagemMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListagemMidiasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpListagemMidiasLayout.setVerticalGroup(
            jpListagemMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListagemMidiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jptAbas.addTab("Listagem de Mídias", jpListagemMidias);

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
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbxFornecedor, 0, 201, Short.MAX_VALUE)
                                .addComponent(jcbxGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbxCensura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(45, 45, 45)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jcbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel10)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcbxDiretor, 0, 178, Short.MAX_VALUE)
                                .addComponent(jftData_lancamento))))
                    .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
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
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbxCensura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jftData_lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jcbxDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnUpdate)
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
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(jpCadastroMidiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSave)
                            .addComponent(jbtnUpdate)))
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
                            .addComponent(jftValor_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        jptAbas.addTab("Cadastro de Mídia", jpCadastroMidias);

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
                    .addComponent(jptAbas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnExit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jptAbas)
                .addGap(18, 18, 18)
                .addComponent(jbtnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        MidiaBean midia = new MidiaBean();

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
        clear();
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
            Object campo[] = {midia.getId(), 
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
            java.util.logging.Logger.getLogger(FrmCadastroMidia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroMidia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroMidia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroMidia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try{
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
                }catch(Exception ex){}
                new FrmCadastroMidia().setVisible(true);
            }
        });
    }
    private void clear(){
        jtxtId.setText(null);
        jtxtTitulo.setText(null);
    
        jftData_lancamento.setText(null);
        jftValor_compra.setText(null);
        jftValor_locacao.setText(null);
        jtxtSinopse.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTabbedPane jptAbas;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JTable jtbMidia;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextArea jtxtSinopse;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
