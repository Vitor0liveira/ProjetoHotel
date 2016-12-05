package fichaOcupacao;

import cliente.Cliente;
import java.util.ArrayList;
import quarto.Quarto;
import servicos.Servico;

public final class FichaOcupacao {

    private int cd_ocupacao;
    private String data_entrada;
    private String hora_entrada;
    private String data_saida;
    private String hora_saida;
    private float valorDiaria;
    private Quarto quarto;
    private Cliente cliente;
    private ArrayList<Servico> servico;

    // Foi necessário adicionar esse Construtor para poder ter uma ligação da "FO" com o "Cliente", "Quarto" e "Seriço".
    public  FichaOcupacao() {
        this.cliente = new Cliente();
        this.quarto = new Quarto();
        this.servico = new ArrayList<>();
    }
    
    public ArrayList<Servico> getServico() {
        return servico;
    }
    
    public void setServico(ArrayList<Servico> servico) {
        this.servico = servico;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCd_ocupacao() {
        return this.cd_ocupacao;
    }

    public void setCd_ocupacao(int cd_ocupa) {
        cd_ocupacao = cd_ocupa;
    }

    public String getData_entrada() {
        return this.data_entrada;
    }

    public void setData_entrada(String dt_entrada) {
        data_entrada = dt_entrada;
    }

    public String getHora_entrada() {
        return this.hora_entrada;
    }

    public void setHora_entrada(String hr_entrada) {
        hora_entrada = hr_entrada;
    }

    public String getData_saida() {
        return this.data_saida;
    }

    public void setData_saida(String dt_saida) {
        data_saida = dt_saida;
    }

    public String getHora_saida() {
        return this.hora_saida;
    }

    public void setHora_saida(String hr_saida) {
        hora_saida = hr_saida;
    }

    public float getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(float vlrDiaria) {
        valorDiaria = vlrDiaria;
    }
}
