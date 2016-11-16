package fo;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import servicos.Servico;

public class DadosFo extends Dados implements InterfaceFo {

    @Override
    public Fo pesquisarFo(Fo f) throws Exception {
        conectar();
        String sql = "SELECT cd_ocupacao, data_entrada, hora_entrada, data_saida, ";
        sql += "hora_saida, quarto, CPF_cliente FROM Fo ";
        sql += "WHERE cd_ocupacao = ? ";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, f.getCd_ocupacao());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                f.setCd_ocupacao(leitor.getInt("cd_ocupacao"));
                f.setData_entrada(leitor.getString("data_entrada"));
                f.setHora_entrada(leitor.getString("hora_entrada"));
                f.setData_saida(leitor.getString("data_saida"));
                f.setHora_saida(leitor.getString("hora_saida"));
                f.getQuarto().setNr_quarto(leitor.getInt("quarto"));
                f.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
            }
        } catch (SQLException erro) {
            throw new Exception("Problemas ao pesquisar a ficha de ocupação: " + erro.getMessage());
        }
        desconectar();
        return f;
    }

    @Override
    public void cadastrarFo(Fo f) throws Exception {
        conectar();

        String sql = "INSERT INTO Fo (cd_ocupacao, data_entrada, hora_entrada, data_saida, hora_saida, ";
        sql += "valorDiaria, quarto, CPF_cliente) ";
        sql += "VALUES (?,?,?,?,?,?,?,?) ";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, f.getCd_ocupacao());
            cmd.setString(2, f.getData_entrada());
            cmd.setString(3, f.getHora_entrada());
            cmd.setString(4, f.getData_saida());
            cmd.setString(5, f.getHora_saida());
            cmd.setFloat(6, f.getValorDiaria());
            cmd.setInt(7, f.getQuarto().getNr_quarto());
            cmd.setString(8, f.getCliente().getCpf_cliente());

            cmd.execute();
        } catch (SQLException erro) {
            throw new Exception("Erro ao inserir dados em cadastrar Fo: " + erro.getMessage());
        }
        desconectar();
    }

    @Override
    public void removerFo(Fo f) throws Exception {
        conectar();
        String sql = "DELETE FROM Fo WHERE cd_ocupacao = ? ";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, f.getCd_ocupacao());
            cmd.execute();
        } catch (SQLException erro) {
            throw new Exception("Informe um código de ocupação existente para remover: " + erro.getMessage());
        }
    }

    @Override
    public void atualizarFo(Fo f) throws Exception {
        conectar();

        String sql = "UPDATE Fo SET data_entrada = ?, hora_entrada = ?, data_saida = ?, hora_saida = ?, ";
        sql += "quarto = ? WHERE cd_ocupacao = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, f.getData_entrada());
            cmd.setString(2, f.getHora_entrada());
            cmd.setString(3, f.getData_saida());
            cmd.setString(4, f.getHora_saida());
            cmd.setInt(5, f.getQuarto().getNr_quarto());
            cmd.setInt(6, f.getCd_ocupacao());

            cmd.execute();

        } catch (SQLException erro) {
            throw new Exception("Erro ao atualizar a FO: " + erro.getMessage());
        }
    }

    @Override
    public ArrayList<Fo> listarFo(Fo filtro) throws Exception {
        int posPar = 1;
        ArrayList<Fo> retorno = new ArrayList<>();
        conectar();

        String sql = "SELECT C.CPF_cliente, C.nm_cliente, F.cd_ocupacao, F.data_entrada, F.hora_entrada, ";
        sql += "F.data_saida, F.hora_saida, F.valorDiaria, F.quarto ";
        sql += "FROM Cliente AS C INNER JOIN Fo AS F ";
        sql += "ON C.CPF_cliente = F.CPF_cliente ";
        sql += "WHERE cd_ocupacao > 0 ";
        if (filtro.getCd_ocupacao() > 0) {
            sql += " AND cd_ocupacao = ? ";
        }
        if (filtro.getCliente().getNm_cliente() != null && filtro.getCliente().getNm_cliente().trim().equals("") == false) {
            sql += " AND nm_cliente LIKE ? ";
        }
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getCd_ocupacao() > 0) {
                cmd.setInt(posPar, filtro.getCd_ocupacao());
                posPar++;
            }
            if (filtro.getCliente().getNm_cliente() != null && filtro.getCliente().getNm_cliente().trim().equals("") == false) {
                cmd.setString(posPar, filtro.getCliente().getNm_cliente());
                posPar++;
            }
            ResultSet leitor = cmd.executeQuery();

            while (leitor.next()) {
                Fo fO = new Fo();
                fO.setCd_ocupacao(leitor.getInt("cd_ocupacao"));
                fO.setData_entrada(leitor.getString("data_entrada"));
                fO.setHora_entrada(leitor.getString("hora_entrada"));
                fO.setData_saida(leitor.getString("data_saida"));
                fO.setHora_saida(leitor.getString("hora_saida"));
                fO.setValorDiaria(leitor.getFloat("valorDiaria"));
                fO.getQuarto().setNr_quarto(leitor.getInt("quarto"));
                fO.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
                fO.getCliente().setNm_cliente(leitor.getString("nm_cliente"));

                retorno.add(fO);
            }
        } catch (SQLException erro) {
            throw new Exception("Erro ao listar: " + erro.getMessage());
        }
        desconectar();
        return retorno;
    }

    @Override
    public Fo procurarServicos(Fo f) throws Exception {
        conectar();
        String sql = "SELECT SER.Cd_Servico, SER.descricao, SER.valor FROM Fo AS FO ";
        sql += "INNER JOIN Servico AS SER ON FO.Cd_Ocupacao = SER.Cd_Ocupacao ";
        sql += "WHERE FO.Cd_Ocupacao = ? ";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, f.getCd_ocupacao());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                Servico s = new Servico();
                s.setCd_servico(leitor.getInt("Cd_Servico"));
                s.setDescricao(leitor.getString("descricao"));
                s.setValor(leitor.getFloat("valor"));
                f.getServico().add(s);
            }
        } catch (SQLException erro) {
            throw new Exception("Problemas ao pesquisar a ficha de ocupação: " + erro.getMessage());
        }
        desconectar();
        return f;
    }

}
