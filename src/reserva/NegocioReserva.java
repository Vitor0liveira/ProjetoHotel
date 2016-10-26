package reserva;

public class NegocioReserva implements InterfacerReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Fazer as validações
        if (r.getCd_reserva() == 0) {
            throw new Exception ("Informar um número de reserva válido.");
        }
    }

    @Override
    public void cancelarReserva(Reserva r) throws Exception {
    }

    @Override
    public void listarReserva(Reserva r) throws Exception {

    }
       
}
