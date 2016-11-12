/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import fachada.Fachada;
import fo.Fo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor_000
 */
public class JInternalFramePesqOcupacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFramePesqReserva
     */
     DefaultTableModel modelo = new DefaultTableModel();
     
    public JInternalFramePesqOcupacao() {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCdOcupacao = new javax.swing.JTextField();
        jTextFieldNr_Quarto = new javax.swing.JTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldDataSaida = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHoraEntrada = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHoraSaida = new javax.swing.JFormattedTextField();

        setClosable(true);
        setForeground(java.awt.Color.green);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisar Ocupação");

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

        jLabel6.setText("Cód. Ocupação:");

        jLabel7.setText("Data Entrada:");

        jLabel9.setText("Hora Saída:");

        jLabel10.setText("Quarto:");

        jLabel11.setText("Hora Entrada:");

        jTextFieldNr_Quarto.setEnabled(false);

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

        jLabel1.setText("Data Saída:");

        try {
            jFormattedTextFieldDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataSaida.setEnabled(false);
        jFormattedTextFieldDataSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataSaidaActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldHoraEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldHoraSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemover))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNr_Quarto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCdOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovaPesquisa)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonNovaPesquisa)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCdOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNr_Quarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jFormattedTextFieldHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonRemover))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        try {
            if (jTextFieldCdOcupacao.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Informe campo CÓDIGO.");
                jTextFieldCdOcupacao.requestFocus();
                return;
            }
            Fachada f = new Fachada();
            Fo fO = f.pesquisarFo(Integer.parseInt(jTextFieldCdOcupacao.getText()));

            if (fO.getCd_ocupacao() == 0) {
                JOptionPane.showMessageDialog(this, "Ocupação não encontrada.");
                jTextFieldCdOcupacao.setText("");
                jTextFieldCdOcupacao.requestFocus();
                return;
            }

            jFormattedTextFieldCpf.setText(fO.getCliente().getCpf_cliente());
            jFormattedTextFieldData.setText(fO.getData_entrada());
            jFormattedTextFieldDataSaida.setText(fO.getData_saida());
            jTextFieldNr_Quarto.setText(Integer.toString(fO.getQuarto().getNr_quarto()));
            jFormattedTextFieldHoraEntrada.setText(fO.getHora_entrada());
            jFormattedTextFieldHoraSaida.setText(fO.getHora_saida());
            jButtonPesquisar.setEnabled(false);
            jButtonAtualizar.setEnabled(false);
            jButtonEditar.setEnabled(true);
            jButtonRemover.setEnabled(false);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jButtonRemover.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jFormattedTextFieldData.setEnabled(true);
        jFormattedTextFieldDataSaida.setEnabled(true);
        jFormattedTextFieldHoraEntrada.setEnabled(true);
        jFormattedTextFieldHoraSaida.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(false);
        jTextFieldNr_Quarto.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        try {
            Fo fO = new Fo();
            
            fO.setCd_ocupacao(Integer.parseInt(jTextFieldCdOcupacao.getText()));

            Fachada f = new Fachada();
            f.removerFo(fO);

            JOptionPane.showMessageDialog(this, "Ocupação removida com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        jTextFieldCdOcupacao.setText("");
        jFormattedTextFieldHoraSaida.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldNr_Quarto.setText("");
        jFormattedTextFieldHoraEntrada.setText("");
        jTextFieldCdOcupacao.setEnabled(false);
        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldDataSaida.setEnabled(false);
        jTextFieldNr_Quarto.setEnabled(false);
        jFormattedTextFieldHoraEntrada.setEnabled(false);
        jFormattedTextFieldHoraSaida.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonRemover.setEnabled(false);
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jButtonNovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaPesquisaActionPerformed
        jFormattedTextFieldHoraEntrada.setText("");
        jTextFieldCdOcupacao.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldNr_Quarto.setText("");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jButtonPesquisar.setEnabled(true);
        jTextFieldCdOcupacao.setEnabled(true);
        jTextFieldCdOcupacao.requestFocus();
        jButtonEditar.setEnabled(false);
        jButtonRemover.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovaPesquisaActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        try {
            Fo fO = new Fo();

           fO.setCd_ocupacao(Integer.parseInt(jTextFieldCdOcupacao.getText()));
           fO.setData_entrada(jFormattedTextFieldData.getText());
           fO.setHora_entrada(jFormattedTextFieldHoraEntrada.getText());
           fO.setData_saida(jFormattedTextFieldDataSaida.getText());
           fO.setHora_saida(jFormattedTextFieldHoraSaida.getText());
           fO.getQuarto().setNr_quarto(Integer.parseInt(jTextFieldNr_Quarto.getText()));
                   
                   
            Fachada f = new Fachada();
            f.atualizarFo(fO);

            JOptionPane.showMessageDialog(this, "Ficha de ocupação atualizada com sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        jFormattedTextFieldHoraEntrada.setText("");
        jTextFieldCdOcupacao.setText("");
        jFormattedTextFieldHoraSaida.setText("");
        jTextFieldNr_Quarto.setText("");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldCpf.setText("");
        jButtonPesquisar.setEnabled(false);
        jTextFieldNr_Quarto.setEnabled(false);
        jFormattedTextFieldHoraEntrada.setEnabled(false);
        jFormattedTextFieldHoraSaida.setEnabled(false);
        jTextFieldCdOcupacao.setEnabled(false);
        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldDataSaida.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonRemover.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataActionPerformed

    private void jFormattedTextFieldDataSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovaPesquisa;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataSaida;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCdOcupacao;
    private javax.swing.JTextField jTextFieldNr_Quarto;
    // End of variables declaration//GEN-END:variables
}
