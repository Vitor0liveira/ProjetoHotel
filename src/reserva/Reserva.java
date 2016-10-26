package reserva;

public class Reserva {
    private int cd_reserva;
    private String data;
    private int periodo;
    private int situacao;

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
    
}
