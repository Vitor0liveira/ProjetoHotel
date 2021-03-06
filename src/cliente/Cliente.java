package cliente;

import java.util.ArrayList;

public final class Cliente  {

    private String cpf_cliente;
    private String nm_cliente;
    private String telefone;
    private String sexo;
    private ArrayList<Cliente> detalhesCliente;

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getNm_cliente() {
        return nm_cliente;
    }

    public void setNm_cliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        public ArrayList<Cliente> getCliente() {
        return detalhesCliente;
    }
    
    public void setCliente(ArrayList<Cliente> detalhesCliente) {
        this.detalhesCliente = detalhesCliente;
    }

}
