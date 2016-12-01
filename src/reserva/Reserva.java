package reserva;

import cliente.Cliente;
import java.util.ArrayList;
import quarto.Quarto;
import servicos.Servico;
import situacao.Situacao;
import fichaOcupacao.FichaOcupacao;

public class Reserva {

    private int cd_reserva;
    private String data;
    private int periodo;
    private Situacao situacao;
    private Cliente cliente;
    private Quarto quarto;
    private ArrayList<Servico> servico;
    private FichaOcupacao fichaOcupacao ;

    public Reserva() {
        this.cliente = new Cliente();
        this.quarto = new Quarto();
        this.situacao = new Situacao();
        this.servico = new ArrayList<Servico>();
        this.fichaOcupacao = new FichaOcupacao();
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
        retorno += "Número do quarto: " + this.quarto + "\n";
        retorno += "Código ocupação: " + this.fichaOcupacao + "\n";

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

    public Situacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Situacao s) {
        situacao = s;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    public ArrayList<Servico> getServico() {
        return servico;
    }
    
    public void setServico(ArrayList<Servico> servico) {
        this.servico = servico;
    }

    public FichaOcupacao getOcupacao() {
        return this.fichaOcupacao;
    }

    public void setOcupacao(FichaOcupacao fichaO) {
        this.fichaOcupacao = fichaO;
    }

}
