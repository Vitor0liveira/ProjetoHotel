package reserva;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosReserva extends Dados implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        conectar();
        String sql = "INSERT INTO Reserva (cd_reserva, data, periodo, situacao, CPF_cliente, Nr_quarto, Cd_ocupacao)";
        sql += "VALUES (?,?,?,?,?,?,?)";
        try {
            //Executando a instrução SQL
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, r.getCd_reserva());
            cmd.setString(2, r.getData());
            cmd.setInt(3, r.getPeriodo());
            cmd.setInt(4, r.getSituacao());
            cmd.setString(5, r.getCliente().getCpf_cliente());
            cmd.setInt(6, r.getNr_quarto());
            cmd.setInt(7, r.getCd_ocupacao());
            cmd.execute();
        } catch (SQLException e) {
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        desconectar();

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
