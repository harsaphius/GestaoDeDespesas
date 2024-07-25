
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class GerirCategorias extends javax.swing.JInternalFrame {
    
    BDconnection objcon = new BDconnection();
    FillComboBox fillcombo = new FillComboBox();
    
    public GerirCategorias() {
        initComponents();
        DefaultListModel CatgoriasListModel = new DefaultListModel();
        lst_categoriasAtivas.setModel(CatgoriasListModel);
        String [] listCat = fillcombo.getAllCategorias();
        
        for (int i = 0; i < listCat.length ; i++)
            CatgoriasListModel.addElement(listCat [i]);
        
   
        //lst_categoriasAtivas.setModel(new javax.swing.DefaultListModel(fillcombo.Categorias()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_categoriasAtivas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txt_editCategoria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ativo = new javax.swing.JRadioButton();
        inativo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_categoriasAtivas1 = new javax.swing.JList<>();
        btn_Remover = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Remover1 = new javax.swing.JButton();
        btn_Editar1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Gerir Categorias");

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        lst_categoriasAtivas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_categoriasAtivas);

        jLabel2.setText("Categoria");

        txt_editCategoria.setToolTipText("");
        txt_editCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_editCategoriaActionPerformed(evt);
            }
        });

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ativo);
        ativo.setText("Activar");

        buttonGroup1.add(inativo);
        inativo.setText("Inativar");

        jLabel3.setText("Lista de Categorias Activas");

        jLabel4.setText("Lista de Categorias Inativas");

        lst_categoriasAtivas1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst_categoriasAtivas1);

        btn_Remover.setText("Remover");
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar Categoria");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Remover1.setText("Remover");
        btn_Remover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Remover1ActionPerformed(evt);
            }
        });

        btn_Editar1.setText("Editar Categoria");
        btn_Editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Editar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_editCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Remover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Editar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(btn_sair, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Remover1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Editar1)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_editCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativo)
                    .addComponent(inativo)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Remover1)
                        .addComponent(btn_Editar1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Remover)
                        .addComponent(btn_Editar)))
                .addGap(32, 32, 32)
                .addComponent(btn_sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void txt_editCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_editCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_editCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Create updateCat = new Create();
        boolean isativo;
        
        if(ativo.isSelected())
             isativo = true;
        else
            isativo=false;
        
        String CatSelected = lst_categoriasAtivas.getSelectedValue();
        int CatId = updateCat.getCategoriaId(CatSelected);
        updateCat.UpdateCategoria(CatId,CatSelected,isativo);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed

    }//GEN-LAST:event_btn_RemoverActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

    txt_editCategoria.setText(lst_categoriasAtivas.getSelectedValue());
    ativo.setSelected(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_Remover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Remover1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Remover1ActionPerformed

    private void btn_Editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Editar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Editar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ativo;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Editar1;
    private javax.swing.JButton btn_Remover;
    private javax.swing.JButton btn_Remover1;
    private javax.swing.JButton btn_sair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton inativo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lst_categoriasAtivas;
    private javax.swing.JList<String> lst_categoriasAtivas1;
    private javax.swing.JTextField txt_editCategoria;
    // End of variables declaration//GEN-END:variables
}
