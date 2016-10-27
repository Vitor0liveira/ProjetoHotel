package reserva;

public class Reserva {

    private int cd_reserva;
    private String data;
    private int periodo;
    private int situacao;
    private String cpf_cliente;
    private int nr_quarto;
    private int cd_ocupacao;

    public int getCd_reserva() {
        return this.cd_reserva;
    }

    public void setCd_reserva(int cd_res) {
        cd_reserva = cd_res;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String dt) {
        data = dt;
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

    public String getCpf_cliente() {
        return this.cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cli) {
        cpf_cliente = cpf_cli;
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
