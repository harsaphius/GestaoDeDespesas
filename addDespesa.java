
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class addDespesa extends javax.swing.JFrame {

    BDconnection objcon = new BDconnection();
    FillComboBox fillcombo = new FillComboBox();
    MenuPrincipal menu = new MenuPrincipal();
    
    public addDespesa() {
        initComponents();
        cb_CategoriasDespesas.setModel(new javax.swing.DefaultComboBoxModel<>(fillcombo.getAllCategorias()));
        cb_paymentType.setModel(new javax.swing.DefaultComboBoxModel<>(fillcombo.getAllTipoPag()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_valor = new javax.swing.JTextField();
        btn_sair = new javax.swing.JButton();
        cb_CategoriasDespesas = new javax.swing.JComboBox<>();
        btn_local = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NIF = new javax.swing.JTextField();
        txt_descricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_concelho = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codtippagamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nFatRef = new javax.swing.JTextField();
        btn_InserirDespesa = new javax.swing.JButton();
        cb_paymentType = new javax.swing.JComboBox<>();
        txt_data = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ckb_pago = new javax.swing.JCheckBox();
        txt_nporta1 = new javax.swing.JTextField();
        btn_addCategory = new javax.swing.JButton();
        txt_morada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_valor.setToolTipText("Valor da despesa");

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        cb_CategoriasDespesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma categoria" }));
        cb_CategoriasDespesas.setToolTipText("Categoria atribuida á despesa ex: Casa, Carro, IMI..");
        cb_CategoriasDespesas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cb_CategoriasDespesasFocusGained(evt);
            }
        });
        cb_CategoriasDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_CategoriasDespesasMouseClicked(evt);
            }
        });
        cb_CategoriasDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CategoriasDespesasActionPerformed(evt);
            }
        });

        btn_local.setText("Ver Local");
        btn_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localActionPerformed(evt);
            }
        });

        jLabel6.setText("Descrição");

        jLabel4.setText("NIF");

        jLabel2.setText("Categoria Despesas");

        txt_descricao.setToolTipText("Descrição da despesa");

        jLabel8.setText("Euros");

        jLabel9.setText("Concelho");

        txt_concelho.setToolTipText("Concelho ou Localidade do local da despesa se aplicável");
        txt_concelho.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_concelhoCaretUpdate(evt);
            }
        });
        txt_concelho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_concelhoFocusLost(evt);
            }
        });

        jLabel10.setText("Porta");

        jLabel3.setText("Data");

        txt_codtippagamento.setToolTipText("Código do tipo de pagamento se aplicável");
        txt_codtippagamento.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_codtippagamentoCaretUpdate(evt);
            }
        });
        txt_codtippagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_codtippagamentoFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Registar Despesa");

        jLabel11.setText("Nº Fat/Ref");

        jLabel7.setText("Morada");

        txt_nFatRef.setToolTipText("Referência da Fátura/Despesa");

        btn_InserirDespesa.setText("Inserir Despesa");
        btn_InserirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirDespesaActionPerformed(evt);
            }
        });

        cb_paymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma categoria" }));
        cb_paymentType.setToolTipText("Tipo de pagamento utuilizado na despesa");
        cb_paymentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_paymentTypeActionPerformed(evt);
            }
        });

        txt_data.setText("AAAA-MM-DD");
        txt_data.setToolTipText("Data da Fátura/Despesa AAAA-MM-DD");

        jLabel12.setText("Tipo Pagamento");

        jLabel5.setText("Valor");

        jLabel14.setText("Cód.");

        ckb_pago.setText("Pago");

        txt_nporta1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_nporta1CaretUpdate(evt);
            }
        });
        txt_nporta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nporta1FocusLost(evt);
            }
        });

        btn_addCategory.setText("Adicionar Categoria");
        btn_addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCategoryActionPerformed(evt);
            }
        });

        txt_morada.setToolTipText("Morada do local da despesa se aplicável");
        txt_morada.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_moradaCaretUpdate(evt);
            }
        });
        txt_morada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_moradaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_CategoriasDespesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_addCategory))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_nFatRef, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_data, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_valor)
                                    .addComponent(txt_NIF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(ckb_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_codtippagamento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_paymentType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(txt_descricao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_morada, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(txt_concelho))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nporta1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_sair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_InserirDespesa)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_CategoriasDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addCategory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nFatRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cb_paymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_pago)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txt_codtippagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_morada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_nporta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_concelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_local))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_InserirDespesa)
                    .addComponent(btn_sair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void cb_CategoriasDespesasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb_CategoriasDespesasFocusGained
        cb_CategoriasDespesas.setModel(new javax.swing.DefaultComboBoxModel<>(fillcombo.getAllCategorias()));
    }//GEN-LAST:event_cb_CategoriasDespesasFocusGained

    private void cb_CategoriasDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_CategoriasDespesasMouseClicked

    }//GEN-LAST:event_cb_CategoriasDespesasMouseClicked

    private void cb_CategoriasDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CategoriasDespesasActionPerformed

        //cb_CategoriasDespesas.setModel(new javax.swing.DefaultComboBoxModel<>(fillcombo.getAllCategorias()));
        cb_CategoriasDespesas.setModel(new DefaultComboBoxModel(fillcombo.getAllCategorias()));

    }//GEN-LAST:event_cb_CategoriasDespesasActionPerformed

    private void btn_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localActionPerformed
        //Localizacao localizacao = new Localizacao();
        //localizacao.setVisible(true);

        if(txt_concelho.getText().length()==0 && txt_morada.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Para ter acesso à localização peencha os campos morada e concelho");

        }else{

            btn_local.setEnabled(true);

            try {
                String local = txt_morada.getText().replaceAll(" ", "");
                String nporta = txt_codtippagamento.getText();
                String concelho = txt_concelho.getText();
                String googlemaps = "https://maps.google.com/maps?q=";
                String URL = googlemaps + local + "+"+nporta + "," + concelho+"%20zoom";

                //File file = new java.io.File("src/MapsIframe.html").getAbsoluteFile();

                java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
                //java.awt.Desktop.getDesktop().open(file);

            }catch (IOException e) {JOptionPane.showInternalMessageDialog(null, e.getMessage());}
        }
    }//GEN-LAST:event_btn_localActionPerformed

    private void txt_concelhoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_concelhoCaretUpdate
        txt_concelho.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(txt_concelho.getText().length()>0 && txt_morada.getText().length()>0)
                btn_local.setEnabled(true);
                else
                btn_local.setEnabled(false);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(txt_concelho.getText().length()>0 && txt_morada.getText().length()>0)
                btn_local.setEnabled(true);
                else
                btn_local.setEnabled(false);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(txt_concelho.getText().length()>0 && txt_morada.getText().length()>0)
                btn_local.setEnabled(true);
                else
                btn_local.setEnabled(false);
            }

        });
    }//GEN-LAST:event_txt_concelhoCaretUpdate

    private void txt_concelhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_concelhoFocusLost

    }//GEN-LAST:event_txt_concelhoFocusLost

    private void txt_codtippagamentoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_codtippagamentoCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codtippagamentoCaretUpdate

    private void txt_codtippagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_codtippagamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codtippagamentoFocusLost

    private void btn_InserirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirDespesaActionPerformed

        Create createdesp = new Create();
        boolean ispago;

        if(ckb_pago.isSelected())
        ispago = true;
        else
        ispago=false;

        if(txt_NIF.getText().length()>1 && txt_valor.getText().length()>1 && cb_CategoriasDespesas.getSelectedIndex()>=0 && txt_data.getText().length()>1){
            createdesp.data = txt_data.getText();
            createdesp.nif = Integer.parseInt((txt_NIF.getText()));
            createdesp.valor = Float.parseFloat(txt_valor.getText());
            createdesp.descricao = txt_descricao.getText();
            createdesp.morada = txt_morada.getText();
            createdesp.categoriaId = cb_CategoriasDespesas.getSelectedIndex()+1;
            createdesp.useradd_id = 1;
            createdesp.dataadd = LocalDate.now().toString();
            createdesp.estadodesp = true;
            createdesp.pago = ispago;
            createdesp.nporta = txt_codtippagamento.getText();
            createdesp.concelho = txt_concelho.getText();
            createdesp.nfatura = txt_nFatRef.getText();
            createdesp.tipopagamentoId = cb_paymentType.getSelectedIndex()+1;
            createdesp.codigo = txt_codtippagamento.getText();

        }else
        JOptionPane.showMessageDialog(null, "Insira os dados da despesa a registar");

        if(createdesp.CreateNewDespesa()==true)
        {
            this.dispose();
        }

    }//GEN-LAST:event_btn_InserirDespesaActionPerformed

    private void cb_paymentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paymentTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_paymentTypeActionPerformed

    private void txt_nporta1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_nporta1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nporta1CaretUpdate

    private void txt_nporta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nporta1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nporta1FocusLost

    private void btn_addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCategoryActionPerformed

        new AddCategoria().setVisible(true);

    }//GEN-LAST:event_btn_addCategoryActionPerformed

    private void txt_moradaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_moradaCaretUpdate
        txt_morada.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(txt_concelho.getText().length()>0 && txt_morada.getText().length()>0)
                btn_local.setEnabled(true);
                else
                btn_local.setEnabled(false);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(txt_concelho.getText().length()>0 && txt_morada.getText().length()>0)
                btn_local.setEnabled(true);
                else
                btn_local.setEnabled(false);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(txt_concelho.getText().length()>0 && txt_morada.getText().length()>0)
                btn_local.setEnabled(true);
                else
                btn_local.setEnabled(false);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txt_moradaCaretUpdate

    private void txt_moradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_moradaFocusLost

    }//GEN-LAST:event_txt_moradaFocusLost

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
            java.util.logging.Logger.getLogger(addDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InserirDespesa;
    private javax.swing.JButton btn_addCategory;
    private javax.swing.JButton btn_local;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox<String> cb_CategoriasDespesas;
    private javax.swing.JComboBox<String> cb_paymentType;
    private javax.swing.JCheckBox ckb_pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_NIF;
    private javax.swing.JTextField txt_codtippagamento;
    private javax.swing.JTextField txt_concelho;
    private javax.swing.JFormattedTextField txt_data;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_morada;
    private javax.swing.JTextField txt_nFatRef;
    private javax.swing.JTextField txt_nporta1;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
