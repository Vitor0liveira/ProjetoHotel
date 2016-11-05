package servicos;

public class NegocioServicos implements InterfaceServicos {

    public void validarCamposBasicos(Servico s) throws Exception {
        if (s.getCd_servico() < 0) {
            throw new Exception("Por Favor, Informar um CÓDIGO DE SERVIÇO válido.");
        }

        if (s.getDescricao().length() > 20) {
            throw new Exception("Por Favor, DESCREVA o Serviço com menos de VINTE(20) Caracteres.");
        }

        if (s.getDescricao().equals("")) {
            throw new Exception("Por Favor, DESCREVA um Serviço.");
        }

        if (s.getDescricao() == null) {
            throw new Exception("Por Favor, DESCREVA um Serviço.");
        }

        if (s.getValor() < 10) {
            throw new Exception("Por Favor, Informe um valor Acima de DEZ(R$10) Reais para o Serviço.");
        }

    }

    @Override
    public void pesquisarServicos(Servico s) throws Exception {
        validarCamposBasicos(s);

        DadosServicos dS = new DadosServicos();
        dS.pesquisarServicos(s);

    }

}
