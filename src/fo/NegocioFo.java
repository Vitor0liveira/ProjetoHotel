package fo;

public class NegocioFo implements InterfaceFo {

    public void validarcamposBasicos(Fo f) throws Exception {

        if (f.getCd_ocupacao() < 0) {
            throw new Exception("Por Farvor, Informe um CÓDIGO DE OCUPAÇÃO Válido.");
        }

        if (f.getCliente().getCpf_cliente() == null) {
            throw new Exception("Por Farvor, Informe o CPF do Cliente.");
        }

    }

    @Override
    public void pesquisarFo(Fo f) throws Exception {
        validarcamposBasicos(f);

        DadosFo dF = new DadosFo();
        dF.pesquisarFo(f);
    }

}
