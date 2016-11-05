package reserva;

import cliente.Cliente;

public class Reserva {

    private int cd_reserva;
    private String data;
    private int periodo;
    private int situacao;
    private Cliente cliente;
    private int nr_quarto;
    private int cd_ocupacao;

    public Reserva() {
        this.cliente = new Cliente();
    }

    @Override
    public String toString() {
        String retorno = "";
        retorno += "Dados de Reserva" + "\n";
        retorno += "Código reserva: " + this.cd_reserva + "\n";
        retorno += "Data: " + this.data + "\n";
        retorno += "Período: " + this.periodo + "\n";
        retorno += "Situação: " + this.situacao + "\n";
        retorno += "Cliente CPF: " + this.cliente + "\n";
        retorno += "Número do quarto: " + this.nr_quarto + "\n";
        retorno += "Código ocupação: " + this.cd_ocupacao;

        return retorno;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCd_reserva() {
        return this.cd_reserva;
    }

    public void setCd_reserva(int cd_res) {
        cd_reserva = cd_res;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(int prd) {
        periodo = prd;
    }

    public int getSituacao() {
        return this.situacao;
    }

    public void setSituacao(int stcao) {
        situacao = stcao;
    }

    public int getNr_quarto() {
        return this.nr_quarto;
    }

    public void setNr_quarto(int nr_qrt) {
        nr_quarto = nr_qrt;
    }

    public int getCd_ocupacao() {
        return this.cd_ocupacao;
    }

    public void setCd_ocupacao(int cd_ocpcao) {
        cd_ocupacao = cd_ocpcao;
    }

}
