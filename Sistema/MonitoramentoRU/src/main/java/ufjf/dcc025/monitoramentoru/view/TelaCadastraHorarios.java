/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

import java.awt.event.ActionEvent;
import ufjf.dcc025.monitoramentoru.controller.HorariosController;
import ufjf.dcc025.monitoramentoru.model.Horarios;

/**
 *
 * @author arthu
 */
public class TelaCadastraHorarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastraHorarios
     */
    public TelaCadastraHorarios() {
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
        jTextFieldIdentificador = new javax.swing.JTextField();
        jCheckBox7h = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox8h.setText("08:00");

        jCheckBox9h.setText("09:00");

        jCheckBox10h.setText("10:00");

        jCheckBox11h.setText("11:00");

        jCheckBox12h.setText("12:00");

        jCheckBox13h.setText("13:00");

        jCheckBox14h.setText("14:00");

        jCheckBox15h.setText("15:00");

        jCheckBox16h.setText("16:00");

        jCheckBox17h.setText("17:00");

        jCheckBox18h.setText("18:00");

        jCheckBox19h.setText("19:00");

        jCheckBox20h.setText("20:00");

        jComboBoxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));

        jCheckBox7h.setText("07:00");
        jCheckBox7h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7hActionPerformed(evt);
            }
        });

        jLabel1.setText("Dia da Semana");

        jLabel2.setText("Identificador");

        jButtonCadastrar.setText("Cadastrar");

        jButton2.setText("Cancelar");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel3.setText("Cadastro de Horários");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setText("Cadastre abaixo os horários em que estará presente na UFJF");

        jButtonConcluir.setText("Concluir Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox13h, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jCheckBox12h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox11h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox10h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox9h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox8h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox7h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox20h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox19h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox18h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox17h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox16h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox15h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox14h, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonConcluir)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox15h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox16h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox17h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox18h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox19h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox20h))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox7h)
                            .addComponent(jCheckBox14h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox8h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox9h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox10h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox11h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox12h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox13h)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButton2)
                    .addComponent(jButtonConcluir))
                .addGap(76, 76, 76))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox7hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7hActionPerformed

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
                TelaCadastraHorarios tela = new TelaCadastraHorarios();
                tela.setVisible(true);
                Horarios grade = new Horarios();
                
                tela.jButtonCadastrar.addActionListener((ActionEvent e) -> {
                    tela.cadastrar(grade);
                });
                
                tela.jButtonConcluir.addActionListener((ActionEvent e) -> {
                    HorariosController horariosController = new HorariosController();
                    horariosController.ConcluirCadastro(grade);
                });
                
            }
        });
    }

    private void cadastrar(Horarios grade) {

        HorariosController horariosController = new HorariosController();
//        Horarios grade = new Horarios();
        
        String id = jTextFieldIdentificador.getText();
        String diaSemana = jComboBoxDiaSemana.getSelectedItem() + "";
        
        boolean h7 = jCheckBox7h.isSelected();
        boolean h8 = jCheckBox8h.isSelected();
        boolean h9 = jCheckBox9h.isSelected();
        boolean h10 = jCheckBox10h.isSelected();
        boolean h11 = jCheckBox11h.isSelected();
        boolean h12 = jCheckBox12h.isSelected();
        boolean h13 = jCheckBox13h.isSelected();
        boolean h14 = jCheckBox14h.isSelected();
        boolean h15 = jCheckBox15h.isSelected();
        boolean h16 = jCheckBox16h.isSelected();
        boolean h17 = jCheckBox17h.isSelected();
        boolean h18 = jCheckBox18h.isSelected();
        boolean h19 = jCheckBox19h.isSelected();
        boolean h20 = jCheckBox20h.isSelected();

        horariosController.cadastrarHorarios(grade, diaSemana, id, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20);
        
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    protected javax.swing.JTextField jTextFieldIdentificador;
    // End of variables declaration//GEN-END:variables
}
