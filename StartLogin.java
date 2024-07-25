
import java.awt.event.KeyEvent;
//import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;


public class StartLogin extends javax.swing.JFrame {
    
    BDconnection objcon = new BDconnection();

    //public MenuPrincipal menu;
    MenuPrincipal menuPrincipal = new MenuPrincipal();

    public StartLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomelogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psw_pwlogin = new javax.swing.JPasswordField();
        btn_sair = new javax.swing.JButton();
        btn_loginuser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("Utilizador");

        txt_nomelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeloginActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        psw_pwlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psw_pwloginKeyTyped(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_loginuser.setText("Login");
        btn_loginuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginuserActionPerformed(evt);
            }
        });
        btn_loginuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_loginuserKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txt_nomelogin)
                        .addComponent(psw_pwlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_loginuser, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nomelogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psw_pwlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_loginuser)
                    .addComponent(btn_sair))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeloginActionPerformed

    private void btn_loginuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginuserActionPerformed

        //menuPrincipal.setVisible(true);
        //this.dispose();

        Create createlogin = new Create();
        createlogin.nome = txt_nomelogin.getText();
        createlogin.password = new String(psw_pwlogin.getPassword());

        // criar if de velidfação se os campos estão preechidos

        if(createlogin.CreateLogin()){
            JOptionPane.showMessageDialog(null,"Login efetuado com sucesso");
            menuPrincipal.userLogin=createlogin.nome;

            //menuPrincipal.appuserloginname = txt_nomelogin.getText();
            //menuPrincipal.userloginstatus = createlogin.CreateLogin();
            this.dispose();
            //StartLogin.add(menuPrincipal);
            menuPrincipal.setVisible(true);

            //colocar aqui o form a abrir depois de login com sucesso
        }else{
            JOptionPane.showMessageDialog(null,"Utilizador ou Password incorretos!");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_loginuserActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
    
        System.exit(0);
            

    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_loginuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginuserKeyTyped

        

    }//GEN-LAST:event_btn_loginuserKeyTyped

    private void psw_pwloginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psw_pwloginKeyTyped
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Create createlogin = new Create();
            createlogin.nome = txt_nomelogin.getText();
            createlogin.password = new String(psw_pwlogin.getPassword());

            // criar if de velidfação se os campos estão preechidos
            if (createlogin.CreateLogin()) {
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                menuPrincipal.userLogin = createlogin.nome;

                //menuPrincipal.appuserloginname = txt_nomelogin.getText();
                //menuPrincipal.userloginstatus = createlogin.CreateLogin();
                this.dispose();
                //StartLogin.add(menuPrincipal);
                menuPrincipal.setVisible(true);

                //colocar aqui o form a abrir depois de login com sucesso
            } else {
                JOptionPane.showMessageDialog(null, "Utilizador ou Password incorretos!");

            }
        }
        
    }//GEN-LAST:event_psw_pwloginKeyTyped

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
            java.util.logging.Logger.getLogger(StartLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_loginuser;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField psw_pwlogin;
    private javax.swing.JTextField txt_nomelogin;
    // End of variables declaration//GEN-END:variables
}
