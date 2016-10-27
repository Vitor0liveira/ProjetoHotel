package reserva;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosReserva extends Dados implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Abrindo conexão
        conectar();
        //Instrução SQL correspondente a inserção de Reserva
        String sql = "INSERT INTO Reserva (cd_reserva, data, periodo, situacao, CPF_cliente, nr_quarto, cd_ocupacao)";
        //Recebendo os valores correspondentes 
        sql += "VALUES (?,?,?,?,?,?,?)";
        try {
            //Executando a instrução SQL
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt   (1, r.getCd_reserva());
            cmd.setString(2, r.getData());
            cmd.setInt   (3, r.getPeriodo());
            cmd.setInt   (4, r.getSituacao());
            cmd.setString(5, r.getCpf_cliente());
            cmd.setInt   (6, r.getNr_quarto());
            cmd.setInt   (7, r.getCd_ocupacao());
            cmd.execute();
        } catch (SQLException e) {
            //Caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
            //Fechando conexão com o banco de dados
            desconectar();
    }

        @Override
        public void atualizarReserva
        (Reserva r) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void apagarReserva
        (Reserva r) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public ArrayList<Reserva> pesquisarReserva
        (Reserva filtro) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
