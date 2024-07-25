

import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;



public class MenuPrincipal extends javax.swing.JFrame {

    BDconnection bdconnection = new BDconnection();
    public Boolean statusLogin;
    public String userLogin;
    public Boolean showMenus;

        
    
    
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
        //jMn_despesas.setVisible(false);
        //jMn_gestao.setVisible(false);

        //lbl_appuserlogined.setText(String.valueOf(userLogin));
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("app_backgrundimage.jpg"));
        Image image = icon.getImage();
        desktop = new javax.swing.JDesktopPane(){

            @Override
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);

            }

        }

        ;
        lbl_nomeapp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMn_user = new javax.swing.JMenu();
        jMnI_registaruser = new javax.swing.JMenuItem();
        jMnI_loginuser = new javax.swing.JMenuItem();
        jMn_despesas = new javax.swing.JMenu();
        jMnI_consultardespesas = new javax.swing.JMenuItem();
        jMnI_registardespesas = new javax.swing.JMenuItem();
        jMn_gestao = new javax.swing.JMenu();
        jMnI_criarcategorias = new javax.swing.JMenuItem();
        jMnI_editarcategorias = new javax.swing.JMenuItem();
        jMnI_criartipopagamento = new javax.swing.JMenuItem();
        jMnI_criarCodtipopagamento = new javax.swing.JMenuItem();
        jMnI_criarEntidade = new javax.swing.JMenuItem();
        jMn_exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktop.setNextFocusableComponent(desktop);
        desktop.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                desktopComponentAdded(evt);
            }
        });
        desktop.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                desktopHierarchyChanged(evt);
            }
        });
        desktop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                desktopMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                desktopMouseMoved(evt);
            }
        });
        desktop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                desktopFocusGained(evt);
            }
        });
        desktop.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                desktopMouseWheelMoved(evt);
            }
        });
        desktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desktopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                desktopMouseReleased(evt);
            }
        });
        desktop.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                desktopComponentHidden(evt);
            }
        });
        desktop.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                desktopPropertyChange(evt);
            }
        });

        lbl_nomeapp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_nomeapp.setForeground(new java.awt.Color(102, 102, 102));
        lbl_nomeapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nomeapp.setText("Gestão de Despesas Diárias");

        desktop.setLayer(lbl_nomeapp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(lbl_nomeapp, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_nomeapp)
                .addContainerGap(519, Short.MAX_VALUE))
        );

        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseMoved(evt);
            }
        });

        jMn_user.setText("Utilizador");

        jMnI_registaruser.setText("Registar ");
        jMnI_registaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_registaruserActionPerformed(evt);
            }
        });
        jMn_user.add(jMnI_registaruser);

        jMnI_loginuser.setText("Logoff");
        jMnI_loginuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_loginuserActionPerformed(evt);
            }
        });
        jMn_user.add(jMnI_loginuser);

        jMenuBar1.add(jMn_user);

        jMn_despesas.setText("Despesas");

        jMnI_consultardespesas.setText("Consultar Despesas");
        jMnI_consultardespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_consultardespesasActionPerformed(evt);
            }
        });
        jMn_despesas.add(jMnI_consultardespesas);

        jMnI_registardespesas.setText("Registar Despesas");
        jMnI_registardespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_registardespesasActionPerformed(evt);
            }
        });
        jMn_despesas.add(jMnI_registardespesas);

        jMenuBar1.add(jMn_despesas);

        jMn_gestao.setText("Gestão");

        jMnI_criarcategorias.setText("Criar Categorias");
        jMnI_criarcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_criarcategoriasActionPerformed(evt);
            }
        });
        jMn_gestao.add(jMnI_criarcategorias);

        jMnI_editarcategorias.setText("Editar Categorias");
        jMnI_editarcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_editarcategoriasActionPerformed(evt);
            }
        });
        jMn_gestao.add(jMnI_editarcategorias);

        jMnI_criartipopagamento.setText("Criar Tipo de Pagamento");
        jMnI_criartipopagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_criartipopagamentoActionPerformed(evt);
            }
        });
        jMn_gestao.add(jMnI_criartipopagamento);

        jMnI_criarCodtipopagamento.setText("Criar Código Tipo Pagamento");
        jMnI_criarCodtipopagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_criarCodtipopagamentoActionPerformed(evt);
            }
        });
        jMn_gestao.add(jMnI_criarCodtipopagamento);

        jMnI_criarEntidade.setText("Criar Entidades");
        jMnI_criarEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnI_criarEntidadeActionPerformed(evt);
            }
        });
        jMn_gestao.add(jMnI_criarEntidade);

        jMenuBar1.add(jMn_gestao);

        jMn_exit.setText("Sair");
        jMn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMn_exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMn_exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
       
       
    private void jMnI_registaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_registaruserActionPerformed

        Registo newReg = new Registo();
        desktop.add(newReg);
        newReg.setVisible(true);
    }//GEN-LAST:event_jMnI_registaruserActionPerformed

    private void jMnI_consultardespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_consultardespesasActionPerformed

        ConsultarDespesas newConsDesp = new ConsultarDespesas();
        desktop.add(newConsDesp);
        newConsDesp.setVisible(true);
    }//GEN-LAST:event_jMnI_consultardespesasActionPerformed

    private void jMnI_registardespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_registardespesasActionPerformed

        RegistarDespesas newRegDesp = new RegistarDespesas();
        desktop.add(newRegDesp);
        newRegDesp.setVisible(true);
    }//GEN-LAST:event_jMnI_registardespesasActionPerformed

    private void jMnI_loginuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_loginuserActionPerformed
       
        UserLogin LoginWindow = new UserLogin();
        desktop.add(LoginWindow);
        LoginWindow.setVisible(true);
        
        new StartLogin().setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMnI_loginuserActionPerformed

    private void jMnI_editarcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_editarcategoriasActionPerformed
        // TODO add your handling code here:
        GerirCategorias newGerCat = new GerirCategorias();
        desktop.add(newGerCat);
        newGerCat.setVisible(true);
    }//GEN-LAST:event_jMnI_editarcategoriasActionPerformed

    private void jMnI_criarcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_criarcategoriasActionPerformed
        // TODO add your handling code here:
        RegistarCategoria newCat = new RegistarCategoria();
        desktop.add(newCat);
        newCat.setVisible(true);
    }//GEN-LAST:event_jMnI_criarcategoriasActionPerformed

    private void jMn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMn_exitMouseClicked

    private void desktopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desktopFocusGained



        
    }//GEN-LAST:event_desktopFocusGained

    private void desktopComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_desktopComponentAdded


    }//GEN-LAST:event_desktopComponentAdded

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
                

    }//GEN-LAST:event_formComponentAdded

    private void desktopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopMouseReleased



    }//GEN-LAST:event_desktopMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //UserLogin LoginWindow = new UserLogin();
        //desktop.add(LoginWindow);
        //LoginWindow.setVisible(true);
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
            
        
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void desktopPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_desktopPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_desktopPropertyChange

    private void desktopMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_desktopMouseWheelMoved



        // TODO add your handling code here:
    }//GEN-LAST:event_desktopMouseWheelMoved

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged



    }//GEN-LAST:event_formWindowStateChanged

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved


    
    }//GEN-LAST:event_formMouseWheelMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    //lb_user.setText(String.valueOf(userLogin));
    
    //txt_user.setText(String.valueOf(userLogin));
    }//GEN-LAST:event_formWindowActivated

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        //lb_user.setText(String.valueOf(userLogin));
    }//GEN-LAST:event_formWindowLostFocus

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
    //txt_user.setText(String.valueOf(userLogin));   
    JOptionPane.showInternalMessageDialog(null, "Olá");  
// TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jMenuBar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseMoved


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1MouseMoved

    private void desktopHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_desktopHierarchyChanged

        
        // TODO add your handling code here:
    }//GEN-LAST:event_desktopHierarchyChanged

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void desktopMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopMouseMoved
       // TODO add your handling code here:
    }//GEN-LAST:event_desktopMouseMoved

    private void desktopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopMouseDragged
       // TODO add your handling code here:
    }//GEN-LAST:event_desktopMouseDragged

    private void desktopComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_desktopComponentHidden
       // TODO add your handling code here:
    }//GEN-LAST:event_desktopComponentHidden

    private void desktopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopMousePressed
  JOptionPane.showInternalMessageDialog(null, "Olá");            // TODO add your handling code here:
    }//GEN-LAST:event_desktopMousePressed

    private void jMnI_criartipopagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_criartipopagamentoActionPerformed
        RegistarTipoPagamento tipopag = new RegistarTipoPagamento();
        desktop.add(tipopag);
        tipopag.setVisible(true);
    }//GEN-LAST:event_jMnI_criartipopagamentoActionPerformed

    private void jMnI_criarCodtipopagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_criarCodtipopagamentoActionPerformed
        RegistarCodTipoPagamento codtipopag = new RegistarCodTipoPagamento();
        desktop.add(codtipopag);
        codtipopag.setVisible(true);
    }//GEN-LAST:event_jMnI_criarCodtipopagamentoActionPerformed

    private void jMnI_criarEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnI_criarEntidadeActionPerformed
        RegistarEntidades entidades = new RegistarEntidades();
        desktop.add(entidades);
        entidades.setVisible(true);
    }//GEN-LAST:event_jMnI_criarEntidadeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnI_consultardespesas;
    private javax.swing.JMenuItem jMnI_criarCodtipopagamento;
    private javax.swing.JMenuItem jMnI_criarEntidade;
    private javax.swing.JMenuItem jMnI_criarcategorias;
    private javax.swing.JMenuItem jMnI_criartipopagamento;
    private javax.swing.JMenuItem jMnI_editarcategorias;
    private javax.swing.JMenuItem jMnI_loginuser;
    private javax.swing.JMenuItem jMnI_registardespesas;
    private javax.swing.JMenuItem jMnI_registaruser;
    private javax.swing.JMenu jMn_despesas;
    private javax.swing.JMenu jMn_exit;
    private javax.swing.JMenu jMn_gestao;
    private javax.swing.JMenu jMn_user;
    private javax.swing.JLabel lbl_nomeapp;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the appuserloginname
     */
    public String getAppuserloginname() {
        return userLogin;
    }

    /**
     * @param appuserloginname the appuserloginname to set
     */
    public void setAppuserloginname(String appuserloginname) {
        this.userLogin = appuserloginname;
    }


}

