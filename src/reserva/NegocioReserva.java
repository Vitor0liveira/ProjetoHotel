package reserva;

import java.util.ArrayList;

public class NegocioReserva implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Validações de uma reserva

        
        
        DadosReserva dR = new DadosReserva();

        dR.fazerReserva(r);
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
    }

    @Override
    public void apagarReserva(Reserva r) throws Exception {
    }

    @Override
    public ArrayList<Reserva> pesquisarReserva(Reserva filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
