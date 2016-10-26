package reserva;

import java.util.ArrayList;

public interface InterfaceReserva {
   
// método 'fazerReserva' cria uma reserva.
    public void fazerReserva(Reserva r) throws Exception;
    // método 'atualizarReserva' atualiza uma reserva já existente.
    public void atualizarReserva(Reserva r) throws Exception;
    // método apagarReserva apaga uma reserva já existente.
    public void apagarReserva(Reserva r) throws Exception;
    // ArrayList 'pesquisarReserva retorna as reservas pesquisadas.
    // Verifica se uma determinada reserva, está contida na tabela 'Reserva'.
    ArrayList<Reserva> pesquisarReserva(Reserva filtro) throws Exception;
    
}
