/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reserva;

import fachada.Fachada;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import reserva.Reserva;

/**
 *
 * @author Vitor Oliveira, Victor Lauria, Rodrigo Carvalho
 */
public class JInternalFramePesqReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFramePesqReserva
     */
    DefaultTableModel modelo = new DefaultTableModel();

    public JInternalFramePesqReserva() {
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

        jPanel1 = new javax.swing.JPanel();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonNovaPesquisa = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCdReserva = new javax.swing.JTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jComboBoxNrQuarto = new javax.swing.JComboBox<>();
        jTextFieldOcupacao = new javax.swing.JTextField();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();
        jComboBoxSituacao = new javax.swing.JComboBox<>();

        setClosable(true);
        setForeground(java.awt.Color.green);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisar Reserva");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.setEnabled(false);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setEnabled(false);
        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF:");

        jButtonNovaPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom_in.png"))); // NOI18N
        jButtonNovaPesquisa.setText("Nova Pesquisa");
        jButtonNovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaPesquisaActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo:");

        jLabel7.setText("Data:");

        jLabel8.setText("Período:");

        jLabel9.setText("Siutação:");

        jLabel10.setText("Quarto:");

        jLabel11.setText("Ocupação:");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataActionPerformed(evt);
            }
        });

        jComboBoxNrQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        jComboBoxNrQuarto.setEnabled(false);
        jComboBoxNrQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNrQuartoActionPerformed(evt);
            }
        });

        jTextFieldOcupacao.setEnabled(false);

        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxPeriodo.setEnabled(false);
        jComboBoxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoActionPerformed(evt);
            }
        });

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "0 - Em aberto", "1 - Confirmada", "2 - Cancelada" }));
        jComboBoxSituacao.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemover)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNovaPesquisa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxNrQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonNovaPesquisa)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxNrQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonRemover))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setEnabledPesqReserva() {
        jButtonPesquisar.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonRemover.setEnabled(false);
    }

    public void setEnabledEditarReserva() {
        jButtonRemover.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jComboBoxNrQuarto.setEnabled(true);
        jComboBoxSituacao.setEnabled(true);
        jComboBoxPeriodo.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
    }

    public void setRemoverReserva() {
        jTextFieldCdReserva.setText("");
        jTextFieldOcupacao.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldData.setText("");
        jComboBoxPeriodo.setSelectedItem("Selecione");
        jComboBoxSituacao.setSelectedItem("Selecione");
        jComboBoxNrQuarto.setSelectedItem("Selecione");
        jTextFieldOcupacao.setText("");
        jTextFieldCdReserva.setEnabled(false);
        jFormattedTextFieldData.setEnabled(false);
        jComboBoxPeriodo.setEnabled(false);
        jComboBoxSituacao.setEnabled(false);
        jComboBoxNrQuarto.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonRemover.setEnabled(false);
    }

    public void setNewPesqReserva() {
        jComboBoxNrQuarto.setSelectedItem("Selecione");
        jTextFieldCdReserva.setText("");
        jTextFieldOcupacao.setText("");
        jComboBoxPeriodo.setSelectedItem("Selecione");
        jComboBoxSituacao.setSelectedItem("Selecione");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldCdReserva.requestFocus();
        jButtonPesquisar.setEnabled(true);
        jTextFieldCdReserva.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonRemover.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jFormattedTextFieldData.setEnabled(false);
        jComboBoxPeriodo.setEnabled(false);
        jComboBoxNrQuarto.setEnabled(false);
        jComboBoxSituacao.setEnabled(false);
    }

    public void setAtualizarReserva() {
        jComboBoxNrQuarto.setSelectedItem("Selecione");
        jTextFieldCdReserva.setText("");
        jTextFieldOcupacao.setText("");
        jComboBoxPeriodo.setSelectedItem("Selecione");
        jComboBoxSituacao.setSelectedItem("Selecione");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldCpf.setText("");
        jButtonPesquisar.setEnabled(false);
        jComboBoxPeriodo.setEnabled(false);
        jComboBoxSituacao.setEnabled(false);
        jComboBoxNrQuarto.setEnabled(false);
        jTextFieldCdReserva.setEnabled(false);
        jFormattedTextFieldData.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonRemover.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        try {
            if (jTextFieldCdReserva.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Informe campo CÓDIGO.");
                jTextFieldCdReserva.requestFocus();
                return;
            }
            Fachada f = new Fachada();
            Reserva r = f.pesquisarReserva(Integer.parseInt(jTextFieldCdReserva.getText()));

            if (r.getCd_reserva() == 0) {
                JOptionPane.showMessageDialog(this, "Reserva não encontrada.");
                jFormattedTextFieldCpf.setText("");
                jFormattedTextFieldCpf.requestFocus();
                return;
            }

            jComboBoxPeriodo.setSelectedItem(Integer.toString(r.getPeriodo()));
            jFormattedTextFieldData.setText(r.getData());
            jComboBoxSituacao.setSelectedIndex(r.getSituacao().getCd_situacao() + 1);
            jComboBoxNrQuarto.setSelectedItem(r.getQuarto().getNr_quarto() + "");
            jTextFieldOcupacao.setText(Integer.toString(r.getOcupacao().getCd_ocupacao()));
            jFormattedTextFieldCpf.setText(r.getCliente().getCpf_cliente());

            setEnabledPesqReserva();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        setEnabledEditarReserva();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        try {
            Reserva r = new Reserva();
            r.setCd_reserva(Integer.parseInt(jTextFieldCdReserva.getText()));

            Fachada f = new Fachada();
            f.removerReserva(r);

            JOptionPane.showMessageDialog(this, "Reserva removida com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage());
        }
        setRemoverReserva();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jButtonNovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaPesquisaActionPerformed
        setNewPesqReserva();
    }//GEN-LAST:event_jButtonNovaPesquisaActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        try {
            Reserva rR = new Reserva();

            rR.setCd_reserva(Integer.parseInt(jTextFieldCdReserva.getText()));
            rR.setPeriodo(jComboBoxPeriodo.getSelectedIndex());
            rR.getSituacao().setCd_situacao(jComboBoxSituacao.getSelectedIndex() - 1);
            rR.getQuarto().setNr_quarto(Integer.parseInt((String) jComboBoxNrQuarto.getSelectedItem()));
            rR.setData(jFormattedTextFieldData.getText());

            Fachada f = new Fachada();
            f.atualizarReserva(rR);

            JOptionPane.showMessageDialog(this, "Reserva atualizada com sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        setAtualizarReserva();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataActionPerformed

    private void jComboBoxNrQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNrQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNrQuartoActionPerformed

    private void jComboBoxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPeriodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovaPesquisa;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxNrQuarto;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCdReserva;
    private javax.swing.JTextField jTextFieldOcupacao;
    // End of variables declaration//GEN-END:variables
}
