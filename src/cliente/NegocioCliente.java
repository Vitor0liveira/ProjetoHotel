package cliente;

import java.util.ArrayList;

public class NegocioCliente implements InterfaceCliente {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
        if (c.getCpf_cliente().trim().length() < 14) { 
            throw new Exception("Informe um CPF válido.");
        }
        if(c.getCpf_cliente().equals("")){
            throw new Exception("Campo CPF vazio.");
        }
         if (c.getTelefone().trim().length() < 15) { 
            throw new Exception("Informe um TELEFONE válido.");
        }
        if(c.getTelefone().equals("")){
            throw new Exception("Campo TELEFONE vazio.");
        }
        if(c.getNm_cliente().equals("")){
            throw new Exception("Campo NOME vazio.");
        }
        if(c.getSexo().equals("")){
            throw new Exception("Campo SEXO vazio.");
        }
        DadosCliente d = new DadosCliente();
        d.cadastrarCliente(c);
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
