package gui.reserva;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cliente.Cliente;
import fachada.Fachada;
import gui.JFrameTelaMain;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import quarto.Quarto;
import reserva.Reserva;
import situacao.Situacao;

/**
 *
 * @author Vitor Oliveira, Victor Lauria, Rodrigo Carvalho
 */
public class JInternalFrameCadastrarReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameCadastrarReserva
     */
    JFrameTelaMain main;
    ArrayList<Quarto> quartos = new ArrayList<>();
    DefaultComboBoxModel modeloQ = new DefaultComboBoxModel();

    ArrayList<Cliente> clientes = new ArrayList<>();
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    
    ArrayList<Situacao> situacoes = new ArrayList<>();
    DefaultComboBoxModel modeloS = new DefaultComboBoxModel();
    
    public JInternalFrameCadastrarReserva(JFrameTelaMain main) {
        this.main = main;
        initComponents();
        carregarClientes();
        carregarQuartos();
        carregarSituacao();
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
        jButtonReservar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCdReserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxNrQuarto = new javax.swing.JComboBox<>();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCdOcupacao = new javax.swing.JTextField();
        jComboBoxCpfCli = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Reserva");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jButtonReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tick.png"))); // NOI18N
        jButtonReservar.setText("Reservar");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cód. Reserva:");

        jLabel2.setText("CPF:");

        jLabel5.setText("Data:");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Periodo:");

        jLabel3.setText("Situação:");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "0 - Em aberto", "1 - Confirmada", "2 - Cancelada" }));

        jLabel4.setText("Quarto:");

        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1 dia(s)", "2 dia(s)", "3 dia(s)", "4 dia(s)", "5 dia(s)", "6 dia(s)", "7 dia(s)", "8 dia(s)", "9 dia(s)", "10 dia(s)", "11 dia(s)", "12 dia(s)", "13 dia(s) ", "14 dia(s)", "15 dia(s)", "16 dia(s)", "17 dia(s) ", "18 dia(s)", "19 dia(s)", "20 dia(s)", "21 dia(s) ", "22 dia(s)", "23 dia(s)", "24 dia(s)", "25 dia(s)", "26 dia(s) ", "27 dia(s)", "28 dia(s)", "29 dia(s)", "30 dia(s)", "31 dia(s)" }));
        jComboBoxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoActionPerformed(evt);
            }
        });

        jLabel6.setText("Cód. Ocupação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxNrQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCdOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPeriodo, 0, 130, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCpfCli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonReservar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCdOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxNrQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonReservar)
                .addGap(26, 26, 26))
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
    public void setandoReservar() {
        //Setando os campos
        jTextFieldCdReserva.setText("");
        jTextFieldCdOcupacao.setText("");
        jFormattedTextFieldData.setText("");
        jComboBoxCpfCli.setSelectedIndex(0);
        jComboBoxNrQuarto.setSelectedIndex(0);
        jComboBoxPeriodo.setSelectedItem("Selecione");
        jComboBoxSituacao.setSelectedItem("Selecione");
        jTextFieldCdReserva.requestFocus();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        // TODO add your handling code here:
        try {
            if (jComboBoxNrQuarto.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um quarto.");
                jComboBoxNrQuarto.requestFocus();
                return;
            }
            if (jComboBoxCpfCli.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um CPF.");
                jComboBoxCpfCli.requestFocus();
                return;
            }
            if (jTextFieldCdReserva.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Informe um número de reserva.");
                jTextFieldCdReserva.requestFocus();
                return;
            }
            if (jTextFieldCdOcupacao.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Informe um número de ocupação.");
                jTextFieldCdOcupacao.requestFocus();
                return;
            }

            Reserva r = new Reserva();
            //Alimentando o objeto
            r.setCd_reserva(Integer.parseInt(jTextFieldCdReserva.getText()));
            r.getOcupacao().setCd_ocupacao(Integer.parseInt(jTextFieldCdOcupacao.getText()));
            r.setData(jFormattedTextFieldData.getText());
            r.setPeriodo(jComboBoxPeriodo.getSelectedIndex());
            r.getSituacao().setCd_situacao(jComboBoxSituacao.getSelectedIndex() - 1);
            r.setCliente(clientes.get(jComboBoxCpfCli.getSelectedIndex()));
            Quarto q = quartos.get(jComboBoxNrQuarto.getSelectedIndex());
            r.setQuarto(q);
            r.setSituacao(situacoes.get(jComboBoxSituacao.getSelectedIndex()));
            //Enviando o objeto
            Fachada f = new Fachada();

            f.fazerReserva(r);
            JOptionPane.showMessageDialog(this, "Reserva efetuada com sucesso.");
            setandoReservar();

        } catch (Exception erro) {
            if (erro.getMessage().equals("Ocupação não encontrada.")) {
                int escolha = JOptionPane.showConfirmDialog(null, "Ocupação não encontrada. Deseja cadastrar?", "Atenção!", JOptionPane.YES_NO_OPTION); //Cria uma pergunta
                //0 = Sim; 1 = Não;
                if (escolha == JOptionPane.YES_OPTION) { //Se for sim, mostra a tela de cadastro de ocupação, pois a reserva precisa de uma ocupação existente
                    main.cadastrarOcupacao();
                } else {
                    try {
                        Reserva r = new Reserva();

                        r.setCd_reserva(Integer.parseInt(jTextFieldCdReserva.getText()));
                        r.getOcupacao().setCd_ocupacao(Integer.parseInt(jTextFieldCdOcupacao.getText()));
                        r.setData(jFormattedTextFieldData.getText());
                        r.setPeriodo(jComboBoxPeriodo.getSelectedIndex());
                        r.getSituacao().setCd_situacao(jComboBoxSituacao.getSelectedIndex() - 1);
                        r.setCliente(clientes.get(jComboBoxCpfCli.getSelectedIndex()));
                        Quarto q = quartos.get(jComboBoxNrQuarto.getSelectedIndex());
                        r.setQuarto(q);
                        
                        Fachada f = new Fachada();
                        f.fazerReserva(r);
                        JOptionPane.showMessageDialog(this, "Reserva efetuada com sucesso.");
                        setandoReservar();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Erro ao cadastrar reserva." + ex.getMessage());
                    }
                }
            } else {
               JOptionPane.showMessageDialog(this, erro.getMessage());
            }
    }//GEN-LAST:event_jButtonReservarActionPerformed
    }
    private void jComboBoxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPeriodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JComboBox<String> jComboBoxCpfCli;
    private javax.swing.JComboBox<String> jComboBoxNrQuarto;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCdOcupacao;
    private javax.swing.JTextField jTextFieldCdReserva;
    // End of variables declaration//GEN-END:variables

    private void carregarClientes() {
        Fachada f = new Fachada();
        try {
            clientes = f.listarCliente(new Cliente());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(main, erro.getMessage());
        }
        for (Cliente c : clientes) {
            modelo.addElement(c.getCpf_cliente() + ": " + c.getNm_cliente());
        }
        jComboBoxCpfCli.setModel(modelo);
    }

    public void carregarQuartos() {
        Fachada f = new Fachada();
        try {
            quartos = f.listarQuartos(new Quarto());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(main, erro.getMessage());
        }
        for (Quarto q : quartos) {
            modeloQ.addElement(q.getNr_quarto() + ": " + q.getDs_quarto() + ": " + 
                    q.getTipo() + ": R$ " + q.getPreco());
        }
        jComboBoxNrQuarto.setModel(modeloQ);

    }
    
    public void carregarSituacao() {
        Fachada f = new Fachada();
        try {
            situacoes = f.listarSituacao(new Situacao());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(main, erro.getMessage());
        }
        for (Situacao s : situacoes) {
            modeloS.addElement(s.getCd_situacao() + " - " + s.getDs_situacao());
        }
        jComboBoxSituacao.setModel(modeloS);

    }
}
