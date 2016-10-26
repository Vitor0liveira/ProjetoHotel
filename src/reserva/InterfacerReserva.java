package reserva;

public interface InterfacerReserva {
    //
    void fazerReserva(Reserva r) throws Exception;
    
    void cancelarReserva (Reserva r) throws Exception;
    
    void listarReserva (Reserva r) throws Exception;
    
}
