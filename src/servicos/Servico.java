package servicos;

public class Servico {
    
    private int cd_servico;
    private String descricao;
    private float valor;

    public int getCd_servico() {
        return cd_servico;
    }

    public void setCd_servico(int cd_servico) {
        this.cd_servico = cd_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
