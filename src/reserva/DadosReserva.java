package reserva;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosReserva extends Dados implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        try {
            conectar();

            String sql = "INSERT INTO Reserva (cd_reserva, data, periodo, situacao, CPF_cliente, Nr_quarto, Cd_ocupacao)";
            sql += "VALUES (?,?,?,?,?,?,?)";

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
        conectar();

        String sql = "UPDATE Reserva SET data = ?, periodo = ?, situacao = ?, nr_quarto = ?  where cd_reserva = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, r.getData());
            cmd.setInt(2, r.getPeriodo());
            cmd.setInt(3, r.getSituacao());
            cmd.setInt(4, r.getNr_quarto());
            cmd.setInt(5, r.getCd_reserva());
            cmd.execute();
        } catch (SQLException erro) {
            throw new Exception("Erro: " + erro.getMessage());
        }
        desconectar();
    }

    @Override
    public void removerReserva(Reserva r) throws Exception {
        conectar();
        String sql = "DELETE FROM Reserva WHERE cd_reserva = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, r.getCd_reserva());
            cmd.execute();
        } catch (SQLException erro) {
            throw new Exception("Erro ao tentar remover. " + erro.getMessage());
        }
        desconectar();
    }

    @Override
    public ArrayList<Reserva> listarReserva() throws Exception {
        ArrayList<Reserva> retorno = new ArrayList<>();
        conectar();

        String sql = "SELECT cd_reserva, data, periodo, ";
        sql += "situacao, CPF_cliente, nr_quarto, cd_ocupacao ";
        sql += "FROM Reserva";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);

            ResultSet leitor = cmd.executeQuery();

            while (leitor.next()) {
                Reserva r = new Reserva();
                r.setCd_reserva(leitor.getInt("cd_reserva"));
                r.setData(leitor.getString("data"));
                r.setPeriodo(leitor.getInt("periodo"));
                r.setSituacao(leitor.getInt("situacao"));
                r.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
                r.setNr_quarto(leitor.getInt("nr_quarto"));
                r.setCd_ocupacao(leitor.getInt("cd_ocupacao"));

                retorno.add(r);
            }

        } catch (SQLException erro) {
            throw new Exception("Erro: " + erro.getMessage());
        }

        desconectar();
        return retorno;

    }

    @Override
    public Reserva pesquisarReserva(int cd_reserva) throws Exception {
        conectar();
        Reserva r = new Reserva();

        String sql;
        sql = "SELECT data, periodo, situacao, Nr_quarto, cpf_cliente, Cd_Ocupacao ";
        sql += "FROM Reserva WHERE cd_reserva = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, cd_reserva);
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                r.setCd_reserva(cd_reserva);
                r.setData(leitor.getString("data"));
                r.setPeriodo(leitor.getInt("periodo"));
                r.setSituacao(leitor.getInt("situacao"));
                r.setNr_quarto(leitor.getInt("Nr_quarto"));
                r.setCd_ocupacao(leitor.getInt("Cd_Ocupacao"));
                r.getCliente().setCpf_cliente(leitor.getString("cpf_cliente"));
            }
        } catch (Exception erro) {
            throw new Exception("Problemas ao pesquisar a reserva: " + erro.getMessage());
        }
        desconectar();

        return r;
    }

}
