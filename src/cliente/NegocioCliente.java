package cliente;

import java.util.ArrayList;

public class NegocioCliente implements InterfaceCliente {

    private void validarCamposBasicos(Cliente c) throws Exception {
        if (c.getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por favor, preencha o campo CPF.");
        }

        if (c.getCpf_cliente().equals("   .   .   -  ")) {
            throw new Exception("Por favor, preencha o campo CPF.");
        }
        
        if (c.getNm_cliente().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo nome.");
        }
        
        if (c.getTelefone().trim().length() < 16) {
            throw new Exception("Por favor, preencha o campo telefone.");
        }  
    } 
    
    public void validarAtualizarCliente (Cliente c) throws Exception {
        if (c.getNm_cliente().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo nome.");
        }

        if (c.getTelefone().trim().length() < 16) {
            throw new Exception("Por favor, preencha o campo telefone.");
        }          
    }
    
    public void validarRemoverCliente (Cliente c) throws Exception {
        if (c.getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por favor, preencha o campo CPF.");
        }

        if (c.getCpf_cliente().equals("   .   .   -  ")) {
            throw new Exception("Cliente não encontrado.");
        }

        if (c.getCpf_cliente() == null) {
            throw new Exception("Cliente não encontrado.");
        } 
    }
    
    public void validarPesquisarCliente (String cpf) throws Exception {
        Cliente c = new Cliente();
        if (c.getCpf_cliente() == null) {
            throw new Exception("Cliente não encontrado.");
        }

        if (c.getCpf_cliente().equals("   .   .   -  ")) {
            throw new Exception("Cliente não encontrado.");
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
        validarAtualizarCliente(c);
        DadosCliente dC = new DadosCliente();
        dC.atualizarCliente(c);
    }

    @Override
    public void removerCliente(Cliente c) throws Exception {
        validarRemoverCliente(c);
        DadosCliente dC = new DadosCliente();
        dC.removerCliente(c);
    }

    @Override
    public ArrayList<Cliente> listarCliente(Cliente filtro) throws Exception {
        DadosCliente dC = new DadosCliente();
        return dC.listarCliente(filtro);
    }

    @Override
    public Cliente pesquisarCliente(String cpf) throws Exception {
        System.out.println("a");
        DadosCliente dC = new DadosCliente();
        return dC.pesquisarCliente(cpf);
    }

    @Override
    public Cliente detalhesCliente(Cliente c) throws Exception {
        DadosCliente dC = new DadosCliente();
        return dC.detalhesCliente(c);
    }
}
