package cliente;


public class NegocioCliente implements InterfaceCliente {

    private void validarCamposBasicos(Cliente c) throws Exception {
        if (c.getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por favor, preencha o campo CPF.");
        }
        if (c.getNm_cliente().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo nome.");
        }
        if (c.getTelefone().equals("(  )      -    ")) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public boolean verificarExistencia(Cliente c) throws Exception {
        DadosCliente dC = new DadosCliente();
        return dC.verificarExistencia(c);
    }

}
