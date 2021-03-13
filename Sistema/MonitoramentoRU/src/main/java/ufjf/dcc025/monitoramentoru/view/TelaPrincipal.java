/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuItemMonitorarLotacao = new javax.swing.JMenuItem();
        jMenuItemCardapio = new javax.swing.JMenuItem();
        jMenuItemEncomenda = new javax.swing.JMenuItem();
        jMenuItemRegistraHorario = new javax.swing.JMenuItem();
        jMenuItemAgendarHorario = new javax.swing.JMenuItem();
        jMenuItemEticket = new javax.swing.JMenuItem();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuItemEditarPerfil = new javax.swing.JMenuItem();
        jMenuContato = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Monitoramento do RU");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/#UtilizeoRU.png"))); // NOI18N

        jMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-de-menu-de-tres-linhas-horizontais.png"))); // NOI18N
        jMenuPrincipal.setText("Menu Principal");
        jMenuPrincipal.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N

        jMenuItemMonitorarLotacao.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemMonitorarLotacao.setText("Monitorar Lotação");
        jMenuPrincipal.add(jMenuItemMonitorarLotacao);

        jMenuItemCardapio.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemCardapio.setText("Cardápio");
        jMenuPrincipal.add(jMenuItemCardapio);

        jMenuItemEncomenda.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemEncomenda.setText("Encomenda de Refeição");
        jMenuItemEncomenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEncomendaActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemEncomenda);

        jMenuItemRegistraHorario.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemRegistraHorario.setText("Registrar Horários");
        jMenuPrincipal.add(jMenuItemRegistraHorario);

        jMenuItemAgendarHorario.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemAgendarHorario.setText("Agendar Horário");
        jMenuPrincipal.add(jMenuItemAgendarHorario);

        jMenuItemEticket.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemEticket.setText("e-Ticket");
        jMenuItemEticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEticketActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemEticket);

        jMenuBarTelaPrincipal.add(jMenuPrincipal);

        jMenuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario-de-perfil.png"))); // NOI18N
        jMenuPerfil.setText("Perfil");
        jMenuPerfil.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N

        jMenuItemEditarPerfil.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jMenuItemEditarPerfil.setText("Editar Perfil");
        jMenuPerfil.add(jMenuItemEditarPerfil);

        jMenuBarTelaPrincipal.add(jMenuPerfil);

        jMenuContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/letter.png"))); // NOI18N
        jMenuContato.setText("Contato");
        jMenuContato.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jMenuBarTelaPrincipal.add(jMenuContato);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-ligar-desligar.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEncomendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEncomendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEncomendaActionPerformed

    private void jMenuItemEticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEticketActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuContato;
    private javax.swing.JMenuItem jMenuItemAgendarHorario;
    private javax.swing.JMenuItem jMenuItemCardapio;
    private javax.swing.JMenuItem jMenuItemEditarPerfil;
    private javax.swing.JMenuItem jMenuItemEncomenda;
    private javax.swing.JMenuItem jMenuItemEticket;
    private javax.swing.JMenuItem jMenuItemMonitorarLotacao;
    private javax.swing.JMenuItem jMenuItemRegistraHorario;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
