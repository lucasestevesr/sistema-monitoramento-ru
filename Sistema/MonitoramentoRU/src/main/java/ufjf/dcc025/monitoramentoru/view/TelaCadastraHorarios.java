/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.controller.HorariosController;
import static ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario.getUsuarioLogado;
import ufjf.dcc025.monitoramentoru.model.Horarios;
import ufjf.dcc025.monitoramentoru.model.Usuario;

/**
 *
 * @author arthu
 */
public class TelaCadastraHorarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastraHorarios
     */
    private Usuario usuario;

    public TelaCadastraHorarios() {
        initComponents();
//        this.usuario = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
//    Horarios grade = new Horarios();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox8h = new javax.swing.JCheckBox();
        jCheckBox9h = new javax.swing.JCheckBox();
        jCheckBox10h = new javax.swing.JCheckBox();
        jCheckBox11h = new javax.swing.JCheckBox();
        jCheckBox12h = new javax.swing.JCheckBox();
        jCheckBox13h = new javax.swing.JCheckBox();
        jCheckBox14h = new javax.swing.JCheckBox();
        jCheckBox15h = new javax.swing.JCheckBox();
        jCheckBox16h = new javax.swing.JCheckBox();
        jCheckBox17h = new javax.swing.JCheckBox();
        jCheckBox18h = new javax.swing.JCheckBox();
        jCheckBox19h = new javax.swing.JCheckBox();
        jCheckBox20h = new javax.swing.JCheckBox();
        jComboBoxDiaSemana = new javax.swing.JComboBox<>();
        jCheckBox7h = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox8h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox8h.setText("08:00");

        jCheckBox9h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox9h.setText("09:00");

        jCheckBox10h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox10h.setText("10:00");

        jCheckBox11h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox11h.setText("11:00");

        jCheckBox12h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox12h.setText("12:00");

        jCheckBox13h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox13h.setText("13:00");

        jCheckBox14h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox14h.setText("14:00");

        jCheckBox15h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox15h.setText("15:00");

        jCheckBox16h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox16h.setText("16:00");

        jCheckBox17h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox17h.setText("17:00");
        jCheckBox17h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17hActionPerformed(evt);
            }
        });

        jCheckBox18h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox18h.setText("18:00");

        jCheckBox19h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox19h.setText("19:00");

        jCheckBox20h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox20h.setText("20:00");

        jComboBoxDiaSemana.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jComboBoxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));

        jCheckBox7h.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jCheckBox7h.setText("07:00");
        jCheckBox7h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7hActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel1.setText("Dia da Semana:");

        jButtonCadastrar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel3.setText("Cadastro de Horários");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setText("Cadastre abaixo os horários em que estará presente na UFJF");

        jButtonConcluir.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButtonConcluir.setText("Concluir Registro");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jCheckBox7h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox9h)
                                        .addComponent(jCheckBox8h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox11h)
                                        .addComponent(jCheckBox10h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox12h))
                                    .addComponent(jCheckBox13h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonConcluir))
                            .addComponent(jCheckBox14h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox15h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox16h)
                            .addComponent(jCheckBox17h)
                            .addComponent(jCheckBox18h)
                            .addComponent(jCheckBox19h)
                            .addComponent(jCheckBox20h))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox14h)
                    .addComponent(jCheckBox7h))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jCheckBox16h))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox15h)
                            .addComponent(jCheckBox8h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox9h)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox17h)
                    .addComponent(jCheckBox10h))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18h)
                    .addComponent(jCheckBox11h))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19h)
                    .addComponent(jCheckBox12h))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20h)
                    .addComponent(jCheckBox13h))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox7hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7hActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        HorariosController horariosController = new HorariosController();
        horariosController.ConcluirCadastro(getUsuarioLogado().getHorariosUsuario());
        
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jCheckBox17hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17hActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastraHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TelaCadastraHorarios().setVisible(true);
//                Horarios grade = new Horarios();
//                tela.jButtonCadastrar.addActionListener((ActionEvent e) -> {
//                    tela.cadastrar(usuario.getHorariosUsuario());
//                });

//                tela.jButtonConcluir.addActionListener((ActionEvent e) -> {
//                    HorariosController horariosController = new HorariosController();
//                    horariosController.ConcluirCadastro(usuario.getHorariosUsuario());
//                });
            }
        });
    }

    private void cadastrar() {

//        HorariosController horariosController = new HorariosController();
        Horarios grade = new Horarios(false, false, false, false, false, false, false, false, false, false, false, false, false, false);

        String diaSemana = jComboBoxDiaSemana.getSelectedItem() + "";
        
        grade.setH7(jCheckBox7h.isSelected());
        grade.setH8(jCheckBox7h.isSelected());
        grade.setH9(jCheckBox7h.isSelected());
        grade.setH10(jCheckBox7h.isSelected());
        grade.setH11(jCheckBox7h.isSelected());
        grade.setH12(jCheckBox7h.isSelected());
        grade.setH13(jCheckBox7h.isSelected());
        grade.setH14(jCheckBox7h.isSelected());
        grade.setH15(jCheckBox7h.isSelected());
        grade.setH16(jCheckBox7h.isSelected());
        grade.setH17(jCheckBox7h.isSelected());
        grade.setH18(jCheckBox7h.isSelected());
        grade.setH19(jCheckBox7h.isSelected());
        grade.setH20(jCheckBox7h.isSelected());

        if ("Segunda-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setSegundafeira(grade);
        if ("Terça-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setTercafeira(grade);
        if ("Quarta-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setQuartafeira(grade);
        if ("Quinta-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setQuintafeira(grade);
        if ("Sexta-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setSextafeira(grade);
        if ("Sábado".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setSabado(grade);
        
        JOptionPane.showMessageDialog(null, "Horários de " + diaSemana + " registrados com sucesso!");
        
//        boolean h7 = jCheckBox7h.isSelected();
//        boolean h8 = jCheckBox8h.isSelected();
//        boolean h9 = jCheckBox9h.isSelected();
//        boolean h10 = jCheckBox10h.isSelected();
//        boolean h11 = jCheckBox11h.isSelected();
//        boolean h12 = jCheckBox12h.isSelected();
//        boolean h13 = jCheckBox13h.isSelected();
//        boolean h14 = jCheckBox14h.isSelected();
//        boolean h15 = jCheckBox15h.isSelected();
//        boolean h16 = jCheckBox16h.isSelected();
//        boolean h17 =  jCheckBox17h.isSelected();
//        boolean h18 = jCheckBox18h.isSelected();
//        boolean h19 = jCheckBox19h.isSelected();
//        boolean h20 = jCheckBox20h.isSelected();
        
        
        
//        horariosController.cadastrarHorarios(grade, diaSemana, id, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20);
//        horariosController.cadastrarHorarios(usuario, diaSemana, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20);

        jCheckBox7h.setSelected(false);
        jCheckBox8h.setSelected(false);
        jCheckBox9h.setSelected(false);
        jCheckBox10h.setSelected(false);
        jCheckBox11h.setSelected(false);
        jCheckBox12h.setSelected(false);
        jCheckBox13h.setSelected(false);
        jCheckBox14h.setSelected(false);
        jCheckBox15h.setSelected(false);
        jCheckBox16h.setSelected(false);
        jCheckBox17h.setSelected(false);
        jCheckBox18h.setSelected(false);
        jCheckBox19h.setSelected(false);
        jCheckBox20h.setSelected(false);
        
        
        
    }

    public JComboBox<String> getjComboBoxDiaSemana() {
        return jComboBoxDiaSemana;
    }

    public void setjComboBoxDiaSemana(JComboBox<String> jComboBoxDiaSemana) {
        this.jComboBoxDiaSemana = jComboBoxDiaSemana;
    }

    
    
    public JCheckBox getjCheckBox10h() {
        return jCheckBox10h;
    }

    public void setjCheckBox10h(JCheckBox jCheckBox10h) {
        this.jCheckBox10h = jCheckBox10h;
    }

    public JCheckBox getjCheckBox12h() {
        return jCheckBox12h;
    }

    public void setjCheckBox12h(JCheckBox jCheckBox12h) {
        this.jCheckBox12h = jCheckBox12h;
    }

    public JCheckBox getjCheckBox14h() {
        return jCheckBox14h;
    }

    public void setjCheckBox14h(JCheckBox jCheckBox14h) {
        this.jCheckBox14h = jCheckBox14h;
    }

    public JCheckBox getjCheckBox15h() {
        return jCheckBox15h;
    }

    public void setjCheckBox15h(JCheckBox jCheckBox15h) {
        this.jCheckBox15h = jCheckBox15h;
    }

    public JCheckBox getjCheckBox16h() {
        return jCheckBox16h;
    }

    public void setjCheckBox16h(JCheckBox jCheckBox16h) {
        this.jCheckBox16h = jCheckBox16h;
    }

    public JCheckBox getjCheckBox17h() {
        return jCheckBox17h;
    }

    public void setjCheckBox17h(JCheckBox jCheckBox17h) {
        this.jCheckBox17h = jCheckBox17h;
    }

    public JCheckBox getjCheckBox18h() {
        return jCheckBox18h;
    }

    public void setjCheckBox18h(JCheckBox jCheckBox18h) {
        this.jCheckBox18h = jCheckBox18h;
    }

    public JCheckBox getjCheckBox19h() {
        return jCheckBox19h;
    }

    public void setjCheckBox19h(JCheckBox jCheckBox19h) {
        this.jCheckBox19h = jCheckBox19h;
    }

    public JCheckBox getjCheckBox20h() {
        return jCheckBox20h;
    }

    public void setjCheckBox20h(JCheckBox jCheckBox20h) {
        this.jCheckBox20h = jCheckBox20h;
    }

    public JCheckBox getjCheckBox7h() {
        return jCheckBox7h;
    }

    public void setjCheckBox7h(JCheckBox jCheckBox7h) {
        this.jCheckBox7h = jCheckBox7h;
    }

    public JCheckBox getjCheckBox8h() {
        return jCheckBox8h;
    }

    public void setjCheckBox8h(JCheckBox jCheckBox8h) {
        this.jCheckBox8h = jCheckBox8h;
    }

    public JCheckBox getjCheckBox9h() {
        return jCheckBox9h;
    }

    public void setjCheckBox9h(JCheckBox jCheckBox9h) {
        this.jCheckBox9h = jCheckBox9h;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    protected javax.swing.JButton jButtonCadastrar;
    protected javax.swing.JButton jButtonConcluir;
    protected javax.swing.JCheckBox jCheckBox10h;
    protected javax.swing.JCheckBox jCheckBox11h;
    protected javax.swing.JCheckBox jCheckBox12h;
    protected javax.swing.JCheckBox jCheckBox13h;
    protected javax.swing.JCheckBox jCheckBox14h;
    protected javax.swing.JCheckBox jCheckBox15h;
    protected javax.swing.JCheckBox jCheckBox16h;
    protected javax.swing.JCheckBox jCheckBox17h;
    protected javax.swing.JCheckBox jCheckBox18h;
    protected javax.swing.JCheckBox jCheckBox19h;
    protected javax.swing.JCheckBox jCheckBox20h;
    protected javax.swing.JCheckBox jCheckBox7h;
    protected javax.swing.JCheckBox jCheckBox8h;
    protected javax.swing.JCheckBox jCheckBox9h;
    protected javax.swing.JComboBox<String> jComboBoxDiaSemana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
