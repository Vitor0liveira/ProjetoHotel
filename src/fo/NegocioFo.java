package fo;

import java.util.ArrayList;

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
    public Fo pesquisarFo(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
       return dF.pesquisarFo(f);
       
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

    @Override
    public ArrayList<Fo> listarFo(Fo filtro) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.listarFo(filtro);
    }

}
