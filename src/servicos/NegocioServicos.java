package servicos;

public class NegocioServicos implements InterfaceServicos {

    public void validarCamposBasicos(Servico servico) throws Exception {
        if (servico.getCd_servico() <= 0) {
            throw new Exception("Por Favor, informar um CÓDIGO DE SERVIÇO válido.");
        }

        if (servico.getDescricao().length() > 20) {
            throw new Exception("Por Favor, DESCREVA o Serviço com menos de VINTE(20) Caracteres.");
        }

        if (servico.getDescricao().equals("")) {
            throw new Exception("Por Favor, DESCREVA um Serviço.");
        }

        if (servico.getDescricao() == null) {
            throw new Exception("Por Favor, DESCREVA um Serviço.");
        }
        
        if (servico.getValor() < 0) {
            throw new Exception("Por Favor, informe um valor válido para o Serviço.");
        }

    }

    @Override
    public void pesquisarServicos(Servico s) throws Exception {
        validarCamposBasicos(s);

        DadosServicos dS = new DadosServicos();
        dS.pesquisarServicos(s);

    }

}
