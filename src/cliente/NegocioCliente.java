package cliente;

public class NegocioCliente implements InterfaceCliente {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {

        if (c.getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por favor, preencha o campo CPF.");

        }
        if (c.getNm_cliente().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo nome.");
        }
        if (c.getTelefone().equals("(  )      -    ")) {
            throw new Exception("Por favor, preencha o campo telefone.");
        }

        DadosCliente dC = new DadosCliente();
        dC.cadastrarCliente(c);
    }

}
