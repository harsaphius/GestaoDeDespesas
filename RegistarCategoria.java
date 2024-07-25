
import javax.swing.JOptionPane;


public class RegistarCategoria extends javax.swing.JInternalFrame {


    public RegistarCategoria() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_InserirCategoria = new javax.swing.JTextField();
        btn_AddCategoria = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Registar Categoria");

        jLabel2.setText("Categoria");

        txt_InserirCategoria.setToolTipText("Indique o nome da categoria a inserir");

        btn_AddCategoria.setText("Gravar");
        btn_AddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddCategoriaActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_InserirCategoria)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 117, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_sair)
                                .addGap(18, 18, 18)
                                .addComponent(btn_AddCategoria)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(109, 109, 109))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_InserirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddCategoria)
                    .addComponent(btn_sair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddCategoriaActionPerformed
    
        Create createcategoria = new Create();
        NoRepeat norepeat = new NoRepeat();
        
        if(txt_InserirCategoria.getText().length()>0){
            createcategoria.categoria = txt_InserirCategoria.getText();
            createcategoria.estadocat = true;
            
        }else
            JOptionPane.showMessageDialog(null, "Insira uma categoria");
        
        
        norepeat.categoria = txt_InserirCategoria.getText();
        if(norepeat.verifyRepetedCategorias()){
            JOptionPane.showMessageDialog(null,"A Categoria já existe!");
            txt_InserirCategoria.setText(null);
        }else{
            
            if(createcategoria.CreateNewCategoria()==true)
            {
                txt_InserirCategoria.setText(null);
            //this.dispose();
            }
        }
    }//GEN-LAST:event_btn_AddCategoriaActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
    this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_btn_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddCategoria;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_InserirCategoria;
    // End of variables declaration//GEN-END:variables
}
