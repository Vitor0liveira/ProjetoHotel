package reserva;

import java.util.ArrayList;

public class NegocioReserva implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Validações de uma reserva

        /* if (r.getCd_ocupacao()
                <= 0) {
            throw new Exception("Informe o código de OCUPAÇÃO.");
        }*/
        DadosReserva dR = new DadosReserva();

        dR.fazerReserva(r);
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarReserva(Reserva r) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reserva> pesquisarReserva(Reserva filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
