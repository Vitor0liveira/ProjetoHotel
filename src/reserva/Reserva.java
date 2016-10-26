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
        return cd_reserva;
    }

    public void setCd_reserva(int cd_reserva) {
        this.cd_reserva = cd_reserva;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public int getNr_quarto() {
        return nr_quarto;
    }

    public void setNr_quarto(int nr_quarto) {
        this.nr_quarto = nr_quarto;
    }

    public int getCd_ocupacao() {
        return cd_ocupacao;
    }

    public void setCd_ocupacao(int cd_ocupacao) {
        this.cd_ocupacao = cd_ocupacao;
    }
    
}
