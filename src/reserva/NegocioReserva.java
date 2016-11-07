package reserva;

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

        if (r.getData().equals("")) {
            throw new Exception("Por Favor, informe a data.");
        }

        if (r.getCd_reserva() <= 0) {
            throw new Exception("Por Favor, informe um código de reserva válido.");
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
        validarCamposBasicos(r);
        
        DadosReserva dR = new DadosReserva();
        dR.atualizarReserva(r);
    }

    @Override
    public void removerReserva(Reserva r) throws Exception {
        DadosReserva dR = new DadosReserva();
        dR.removerReserva(r);
    }

    @Override
    public ArrayList<Reserva> listar(Reserva filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reserva pesquisarReserva(int cd_reserva) throws Exception {
        DadosReserva dR = new DadosReserva();
        Reserva r = dR.pesquisarReserva(cd_reserva);
        return r;
    }

}
