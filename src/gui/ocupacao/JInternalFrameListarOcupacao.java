/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ocupacao;

import fachada.Fachada;
import fichaOcupacao.FichaOcupacao;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import naopermitealterardadosdajtable.TableModel;
import servicos.Servico;

/**
 *
 * @author Vitor Oliveira, Victor Lauria, Rodrigo Carvalho
 */
public class JInternalFrameListarOcupacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFramePesqCliente
     */
    //DefaultTableModel modelo = new DefaultTableModel();
    //DefaultTableModel modeloDetalhes = new DefaultTableModel();

    TableModel modelo = new TableModel("Cód. Ocupação", "Data Entrada", "Hora Entrada", "Data Saida",
            "Hora Saida", "Valor Diaria", "Quarto", "CPF Cliente", "Nome");
    
    TableModel modeloDetalhes = new TableModel("Cód. Serviço", "Descrição", "Valor");
    
    
    public JInternalFrameListarOcupacao() {
        initComponents();
        //Iniciando os nomes dos campos na table
        //modelo.setColumnIdentifiers(new String[]{"Cód. Ocupação", "Data Entrada", "Hora Entrada", "Data Saida",
            //"Hora Saida", "Valor Diaria", "Quarto", "CPF Cliente", "Nome"});
        jTableOcupacao.setModel(modelo);
        //modeloDetalhes.setColumnIdentifiers(new String[]{"Cód. Serviço", "Descrição", "Valor"});
        jTableOcupacaoDetalhe.setModel(modeloDetalhes);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCdOcupacao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNome3 = new javax.swing.JTextField();
        jButtonListar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableOcupacao = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableOcupacaoDetalhe = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Ocupação");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro da pesquisa: "));

        jLabel11.setText("Cód. Ocupação:");

        jLabel12.setText("Nome:");

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonListar))
                    .addComponent(jTextFieldCdOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCdOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ocupações: "));

        jTableOcupacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableOcupacao.getTableHeader().setReorderingAllowed(false);
        jTableOcupacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOcupacaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableOcupacao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes: "));

        jTableOcupacaoDetalhe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableOcupacaoDetalhe.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTableOcupacaoDetalhe);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        try {
            Fachada f = new Fachada();
            FichaOcupacao FO = new FichaOcupacao();
            if (jTextFieldCdOcupacao.getText().trim().equals("") == false) {
                FO.setCd_ocupacao(Integer.parseInt(jTextFieldCdOcupacao.getText()));
            }
            FO.getCliente().setNm_cliente("%" + jTextFieldNome3.getText().trim() + "%");
            ArrayList<FichaOcupacao> resp = f.listarFo(FO);

            modelo.setRowCount(0);

            if (resp.size() > 0) {
                for (FichaOcupacao fO : resp) {
                    modelo.addRow(new String[]{fO.getCd_ocupacao() + "", fO.getData_entrada() + "", fO.getHora_entrada() + "", fO.getData_saida() + "",
                        fO.getHora_saida() + "", fO.getValorDiaria() + "", fO.getQuarto().getNr_quarto() + "", fO.getCliente().getCpf_cliente() + "", fO.getCliente().getNm_cliente()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não existe resultados!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jTableOcupacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOcupacaoMouseClicked
        // TODO add your handling code here:
        int row = jTableOcupacao.getSelectedRow(); //Pegar a linha selecionada da tabela
        if (row > -1) { //Executa apenas se for maior que -1. -1: nenhuma selecionada, 0: 1ª linha...
            try {
                FichaOcupacao fO = new FichaOcupacao();
                //Colocar em código de ocupação o valor da linha selecionada e da coluna 0 (nesse caso, o código)
                fO.setCd_ocupacao(Integer.parseInt((String) jTableOcupacao.getValueAt(row, 0)));
                Fachada f = new Fachada();
                modeloDetalhes.setRowCount(0);
                fO = f.procurarServicos(fO);
                //Ele vai executar um comando dentro do for com cada serviço de fO
                for (Servico s : fO.getServico()) {
                    //Vai adicionar uma linha com o serviço, descrição e valor
                    modeloDetalhes.addRow(new Object[]{s.getCd_servico(), s.getDescricao(), s.getValor()});
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(this, erro.getMessage());
            }
        }
    }//GEN-LAST:event_jTableOcupacaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableOcupacao;
    private javax.swing.JTable jTableOcupacaoDetalhe;
    private javax.swing.JTextField jTextFieldCdOcupacao;
    private javax.swing.JTextField jTextFieldNome3;
    // End of variables declaration//GEN-END:variables
}
