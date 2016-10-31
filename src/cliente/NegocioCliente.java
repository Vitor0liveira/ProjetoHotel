package cliente;

import java.util.ArrayList;

public class NegocioCliente implements InterfaceCliente {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
        if (c.getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por favor, preencha o campo CPF.");
        }
        if (c.getNm_cliente().trim().equals("")) {
            throw new Exception ("Por favor, preencha o campo nome.");
        }
        if (c.getSexo().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo sexo. ");
        }
        if (c.getTelefone().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo telefone.");
        }
       
        
        DadosCliente dC = new DadosCliente();
        dC.cadastrarCliente(c);
    }

    @Override
    public void atualizarCliente(Cliente c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarCliente(Cliente c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> pesquisarCliente(Cliente filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
