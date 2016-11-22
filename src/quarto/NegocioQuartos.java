package quarto;

import java.util.ArrayList;

public class NegocioQuartos implements InterfaceQuartos {

    public void validarCamposBasicos(Quarto q) throws Exception {
        if (q.getNr_quarto() < 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO(0).");
        }

        if (q.getDs_quarto().length() > 20) {
            throw new Exception("Por Favor, descreva o quarto com menos de VINTE(20) caracteres.");
        }

        if ((q.getPreco() < 0) || (q.getPreco() < 20))  {
            throw new Exception("Por Favor, informe um VALOR válido.");
        }

        if (q.getTipo().length() > 5) {
            throw new Exception("Por Favor, informe o tipo do quarto com menos de CINCO(5) caracteres.");
        }

        if (q.getTipo().equals("")) {
            throw new Exception("Por Favor, informe o tipo do Quarto (Você deixou o Campo VAZIO).");
        }

        if (q.getTipo() == null) {
            throw new Exception("Por Favor, informe o TIPO do quarto.");
        }

        if (q.getAndar() < 0) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        }

    }
    @Override
    public ArrayList<Quarto> listarQuartos(Quarto filtro) throws Exception {
        DadosQuartos dQ = new DadosQuartos();
        return dQ.listarQuartos(filtro);
    }

}
