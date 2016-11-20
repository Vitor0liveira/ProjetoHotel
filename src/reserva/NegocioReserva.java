package reserva;

import fachada.Fachada;
import fo.Fo;
import java.util.ArrayList;

public class NegocioReserva implements InterfaceReserva {

    //Criado o método "validarCamposBasicos" para usalo nos outros métodos como o validador.
    public void validarCamposBasicos(Reserva r) throws Exception {
        if (r.getCliente().getCpf_cliente().trim().length() < 14) {
            throw new Exception("Por Favor, informe um CPF válido.");
        }

        if (r.getPeriodo() <= 0) {
            throw new Exception("Por Favor, informe um período válido.");
        }

        if (r.getData().equals("  /  /   ")) {
            throw new Exception("Por Favor, informe a data.");
        }

        if (r.getCd_reserva() <= 0) {
            throw new Exception("Por Favor, informe um código de reserva válido.");
        }

        /*if (r.getCd_ocupacao() == r.getCd_ocupacao()) {
            throw new Exception("Código de ocupação já existente.");
        }*/
 /*if (r.getQuarto().getNr_quarto() == r.getQuarto().getNr_quarto()) {
            throw new Exception("Informe um quarto válido.");
        }*/
        if (r.getQuarto().getNr_quarto() <= 0) {
            throw new Exception("Informe um quarto válido.");
        }
        
        Fachada f = new Fachada();
        Fo fO = new Fo(); //Cria fO
        fO.setCd_ocupacao(r.getCd_ocupacao()); //Coloca o código para o código
        fO = f.pesquisarFo(fO); //Retorna o fO pesquisado
        if (fO.getCliente().getCpf_cliente() == null) { //Se não existir o cliente, executa o escopo abaixo
            throw new Exception("Ocupação não encontrada.");
        }
    }

    public void validarAtualizarReserva(Reserva r) throws Exception {
        if (r.getData().equals("  /  /    ")) {
            throw new Exception("Informe uma data válida.");
        }

        if (r.getQuarto().getNr_quarto() <= 0) {
            throw new Exception("Informe um quarto válido.");
        }

        /* if (r.getQuarto().getNr_quarto() == r.getQuarto().getNr_quarto()) {
            throw new Exception("Informe um quarto válido.");
        }*/
 /*if (r.getSituacao() < 0) {
            throw new Exception("Informe uma situação válida.");
        }*/
        if (r.getPeriodo() < 0) {
            throw new Exception("Informe um período válido.");
        }
    }

    public void validarRemoverReserva(Reserva r) throws Exception {
        if (r.getCd_reserva() <= 0) {
            throw new Exception("Reserva não encontrada.");
        }
    }

    public void validarPesquisarReserva(int cd_reserva) throws Exception {
        if (cd_reserva <= 0) {
            throw new Exception("Reserva não encontrada.");
        }
    }

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        validarCamposBasicos(r);
        DadosReserva dR = new DadosReserva();
        dR.fazerReserva(r);
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
        validarAtualizarReserva(r);
        DadosReserva dR = new DadosReserva();
        dR.atualizarReserva(r);
    }

    @Override
    public void removerReserva(Reserva r) throws Exception {
        validarRemoverReserva(r);
        DadosReserva dR = new DadosReserva();
        dR.removerReserva(r);
    }

    @Override
    public ArrayList<Reserva> listarReserva(Reserva filtro) throws Exception {
        DadosReserva dR = new DadosReserva();
        return dR.listarReserva(filtro);
    }

    @Override
    public Reserva pesquisarReserva(int cd_reserva) throws Exception {
        validarPesquisarReserva(cd_reserva);
        DadosReserva dR = new DadosReserva();
        Reserva r = dR.pesquisarReserva(cd_reserva);
        return r;
    }

    @Override
    public Reserva procurarCliente(Reserva r) throws Exception {
        DadosReserva dR = new DadosReserva();
        return dR.procurarCliente(r);
    }

}
