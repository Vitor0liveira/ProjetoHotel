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
    public Fo pesquisarFo(int cd_ocupacao) throws Exception {
        DadosFo dF = new DadosFo();
        Fo f = dF.pesquisarFo(cd_ocupacao);
        validarcamposBasicos(f);
        return f;
    }

    @Override
    public void cadastrarFo(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
        dF.cadastrarFo(f);
    }

    @Override
    public void removerFo(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
        dF.removerFo(f);
    }

    @Override
    public void atualizarFo(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
        dF.atualizarFo(f);
    }

}
