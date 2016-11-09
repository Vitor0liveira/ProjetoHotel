package reserva;

import java.util.ArrayList;

public interface InterfaceReserva {
// método 'fazerReserva' cria uma reserva.
    public void fazerReserva(Reserva r) throws Exception;
    // método 'atualizarReserva' atualiza uma reserva já existente.
    public void atualizarReserva(Reserva r) throws Exception;
    // método apagarReserva apaga uma reserva já existente.
    public void removerReserva(Reserva r) throws Exception;
    // ArrayList 'listar' lista as reservas existentes.
    ArrayList<Reserva> listarReserva() throws Exception;
    // pesquisarReserva verifica se uma determinada reserva, está contida na tabela 'Reserva'.
    Reserva pesquisarReserva(int cd_reserva) throws Exception;

}
