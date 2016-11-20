package reserva;

import cliente.Cliente;
import conexao.Dados;
import gui.JFrameTelaMain;
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
            cmd.setInt(6, r.getQuarto().getNr_quarto());
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
            cmd.setInt(4, r.getQuarto().getNr_quarto());
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
    public ArrayList<Reserva> listarReserva(Reserva filtro) throws Exception {
        int posPar = 1;
        ArrayList<Reserva> retorno = new ArrayList<>();
        conectar();

        String sql = "SELECT R.cd_reserva, R.data, R.periodo, R.situacao,  ";
        sql += "R.Nr_quarto, R.Cd_Ocupacao, C.CPF_cliente, C.nm_cliente ";
        sql += "FROM reserva AS R INNER JOIN Cliente AS C ";
        sql += "ON R.cpf_cliente = C.CPF_cliente ";
        sql += "WHERE R.cd_reserva > 0 ";
        if (filtro.getCd_reserva() > 0) {
            sql += " AND R.cd_reserva = ? ";
        }
        if (filtro.getCliente().getNm_cliente() != null && filtro.getCliente().getNm_cliente().trim().equals("") == false) {
            sql += " AND C.nm_cliente LIKE ?";
        }
        if (filtro.getCliente().getCpf_cliente() != null && filtro.getCliente().getCpf_cliente().trim().equals("") == false) {
            sql += " AND C.cpf_cliente = ?";
        }
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getCd_reserva() > 0) {
                cmd.setInt(posPar, filtro.getCd_reserva());
                posPar++;
            }
            if (filtro.getCliente().getNm_cliente() != null && filtro.getCliente().getNm_cliente().trim().equals("") == false) {
                cmd.setString(posPar, filtro.getCliente().getNm_cliente());
                posPar++;
            }
            if (filtro.getCliente().getCpf_cliente() != null && filtro.getCliente().getCpf_cliente().trim().equals("") == false) {
                cmd.setString(posPar, filtro.getCliente().getCpf_cliente());
                posPar++;
            }
            ResultSet leitor = cmd.executeQuery();

            while (leitor.next()) {
                Reserva r = new Reserva();
                r.setCd_reserva(leitor.getInt("cd_reserva"));
                r.setData(leitor.getString("data"));
                r.setPeriodo(leitor.getInt("periodo"));
                r.setSituacao(leitor.getInt("situacao"));
                r.getQuarto().setNr_quarto(leitor.getInt("nr_quarto"));
                r.setCd_ocupacao(leitor.getInt("cd_ocupacao"));
                r.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
                r.getCliente().setNm_cliente(leitor.getString("nm_cliente"));

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
                r.getQuarto().setNr_quarto(leitor.getInt("Nr_quarto"));
                r.setCd_ocupacao(leitor.getInt("Cd_Ocupacao"));
                r.getCliente().setCpf_cliente(leitor.getString("cpf_cliente"));
            }
        } catch (Exception erro) {
            throw new Exception("Problemas ao pesquisar a reserva: " + erro.getMessage());
        }
        desconectar();
        return r;
    }

    @Override
    public Reserva procurarCliente(Reserva r) throws Exception {
        conectar();
        String sql = "SELECT C.CPF_cliente, C.nm_cliente, C.telefone, C.sexo FROM Reserva AS R ";
        sql += "INNER JOIN Cliente AS C ON C.CPF_cliente = R.CPF_cliente ";
        sql += "WHERE R.cd_reserva = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, r.getCd_reserva());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                r.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
                r.getCliente().setNm_cliente(leitor.getString("nm_cliente"));
                r.getCliente().setTelefone(leitor.getString("telefone"));
                r.getCliente().setSexo(leitor.getString("sexo"));
                
            }

        } catch (SQLException erro) {
            throw new Exception("Problemas ao procurar cliente: " + erro.getMessage());
        }
        desconectar();
        return r;
    }

}
