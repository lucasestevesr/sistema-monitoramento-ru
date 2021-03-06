/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.controller.RefeicaoController;
import ufjf.dcc025.monitoramentoru.controller.UsuarioController;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;


/**
 *
 * @author tawan
 */
public class TelaAgendarRefeicao extends javax.swing.JFrame {

    /**
     * Creates new form TelaAgendarRefeicao
     */
    public TelaAgendarRefeicao() {
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
        jComboBoxReserva = new javax.swing.JComboBox<>();
        jLabelTipoReserva = new javax.swing.JLabel();
        jLabelDiaSemana = new javax.swing.JLabel();
        jComboBoxDiaSemana = new javax.swing.JComboBox<>();
        jLabelTurno = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jLabelHorario = new javax.swing.JLabel();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel1.setText("Reservar Refeição");

        jComboBoxReserva.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jComboBoxReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha","Agendamento", "Encomenda" }));
        jComboBoxReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxReservaActionPerformed(evt);
            }
        });

        jLabelTipoReserva.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTipoReserva.setText("Tipo de Reserva:");

        jLabelDiaSemana.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelDiaSemana.setText("Dia da Semana:");

        jComboBoxDiaSemana.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jComboBoxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escolha", "Segunda Feira", "Terça Feira", "Quarta Feira", "Quinta Feira", "Sexta Feira" }));
        jComboBoxDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaSemanaActionPerformed(evt);
            }
        });

        jLabelTurno.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTurno.setText("Turno da Refeição:");

        jComboBoxTurno.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Café da Manhã", "Almoço", "Janta"}));
        jComboBoxTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTurnoItemStateChanged(evt);
            }
        });

        jLabelHorario.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelHorario.setText("Horário:");

        jComboBoxHorario.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha" }));
        jComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButtonSalvar.setLabel("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton1.setLabel("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDiaSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBoxDiaSemana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxReserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDiaSemana)
                    .addComponent(jLabelDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTurnoItemStateChanged
        
        if(null != jComboBoxTurno.getSelectedItem().toString())switch (jComboBoxTurno.getSelectedItem().toString()) {
            case "Café da Manhã":
                jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escolha", "6:00 às 6:30", "6:30 às 7:00", "7:30 às 8:00" }));
                break;
            case "Almoço":
                jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escolha", "11:00 às 11:30", "11:30 às 12:00", "12:00 às 12:30", "12:30 às 13:00", "13:00 às 13:30", "13:30 às 14:00" }));
                break;
            case "Janta":
                jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escolha", "17:00 às 17:30", "17:30 às 18:00", "18:00 às 18:30", "18:30 às 19:00", "19:00 às 19:30", "19:30 às 20:00" }));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBoxTurnoItemStateChanged

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
//        TelaPrincipal telaprincipal = new TelaPrincipal();
        boolean registro = BancoDeDadosUsuario.salvarRefeicoes(jComboBoxReserva.getSelectedItem().toString(),
                jComboBoxDiaSemana.getSelectedItem().toString(), jComboBoxTurno.getSelectedItem().toString(),
                jComboBoxHorario.getSelectedItem().toString());
        if (registro) {
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Os campos não foram preenchidos corretamente.");
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaSemanaActionPerformed

    private void jComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorarioActionPerformed

    private void jComboBoxReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {;
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
            java.util.logging.Logger.getLogger(TelaAgendarRefeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgendarRefeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgendarRefeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgendarRefeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgendarRefeicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxDiaSemana;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JComboBox<String> jComboBoxReserva;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDiaSemana;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelTipoReserva;
    private javax.swing.JLabel jLabelTurno;
    // End of variables declaration//GEN-END:variables
}