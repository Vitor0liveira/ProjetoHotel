package cliente;

import java.util.ArrayList;

public class NegocioCliente implements InterfaceCliente {

    private void validarCamposBasicos(Cliente c) throws Exception {
        if (c.getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por favor, preencha o campo CPF.");
        }
        if (c.getNm_cliente().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo nome.");
        }
        if (c.getTelefone().trim().length() < 16) {
            throw new Exception("Por favor, preencha o campo telefone.");
        }
    }

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
        validarCamposBasicos(c);

        DadosCliente dC = new DadosCliente();
        dC.cadastrarCliente(c);
    }

    @Override
    public void atualizarCliente(Cliente c) throws Exception {
        validarCamposBasicos(c);

        DadosCliente dC = new DadosCliente();
        dC.atualizarCliente(c);
    }

    @Override
    public void apagarCliente(Cliente c) throws Exception {
        DadosCliente dC = new DadosCliente();
        dC.apagarCliente(c);
    }

    @Override
    public ArrayList<Cliente> listarCliente() throws Exception {
        DadosCliente dC = new DadosCliente();
        return dC.listarCliente();
    }

    @Override
    public Cliente pesquisarCliente(String cpf) throws Exception {
        DadosCliente dC = new DadosCliente();
        Cliente c = dC.pesquisarCliente(cpf);

        if (c.getCpf_cliente() == null) {
            throw new Exception("Cliente não encontrado.");
        }
        return c;
    }
}
