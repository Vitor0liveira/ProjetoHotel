package fichaOcupacao;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import servicos.Servico;

public class DadosFo extends Dados implements InterfaceFo {

    @Override
    public FichaOcupacao pesquisarFo(FichaOcupacao f) throws Exception {
        conectar();
        String sql = "SELECT cd_ocupacao, dataEntrada, hrEntrada, dtSaida, ";
        sql += "hrSaida, nr_quarto, CPF_cliente FROM Fo ";
        sql += "WHERE cd_ocupacao = ? ";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, f.getCd_ocupacao());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                System.out.println(leitor.getInt("cd_ocupacao"));
                f.setCd_ocupacao(leitor.getInt("cd_ocupacao"));
                f.setData_entrada(leitor.getString("dataEntrada"));
                f.setHora_entrada(leitor.getString("hrEntrada"));
                f.setData_saida(leitor.getString("dtSaida"));
                f.setHora_saida(leitor.getString("hrSaida"));
                f.getQuarto().setNr_quarto(leitor.getInt("nr_quarto"));
                f.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
            }
        } catch (SQLException erro) {
            throw new Exception("Problemas ao pesquisar a ficha de ocupação: " + erro.getMessage());
        }
        desconectar();
        return f;
    }

    @Override
    public void cadastrarFo(FichaOcupacao f) throws Exception {
        conectar();

        String sql = "INSERT INTO Fo (cd_ocupacao, dataEntrada, hrEntrada, dtSaida, hrSaida, ";
        sql += "valorDiaria, nr_quarto, CPF_cliente) ";
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
    public void removerFo(FichaOcupacao f) throws Exception {
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
    public void atualizarFo(FichaOcupacao f) throws Exception {
        conectar();

        String sql = "UPDATE Fo SET dataEntrada = ?, hrEntrada = ?, dtSaida = ?, hrSaida = ?, ";
        sql += "nr_quarto = ? WHERE cd_ocupacao = ?";

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
    public ArrayList<FichaOcupacao> listarFo(FichaOcupacao filtro) throws Exception {
        int posPar = 1;
        ArrayList<FichaOcupacao> retorno = new ArrayList<>();
        conectar();

        String sql = "SELECT C.CPF_cliente, C.nm_cliente, F.cd_ocupacao, F.dataEntrada, F.hrEntrada, ";
        sql += "F.dtSaida, F.hrSaida, F.valorDiaria, F.nr_quarto ";
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
                FichaOcupacao fO = new FichaOcupacao();
                fO.setCd_ocupacao(leitor.getInt("cd_ocupacao"));
                fO.setData_entrada(leitor.getString("dataEntrada"));
                fO.setHora_entrada(leitor.getString("hrEntrada"));
                fO.setData_saida(leitor.getString("dtSaida"));
                fO.setHora_saida(leitor.getString("hrSaida"));
                fO.setValorDiaria(leitor.getFloat("valorDiaria"));
                fO.getQuarto().setNr_quarto(leitor.getInt("nr_quarto"));
                fO.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
                fO.getCliente().setNm_cliente(leitor.getString("nm_cliente"));

                retorno.add(fO);
            }
        } catch (SQLException erro) {
            throw new Exception("Erro ao listar ficha de ocupação: " + erro.getMessage());
        }
        desconectar();
        return retorno;
    }

    @Override
    public FichaOcupacao procurarServicos(FichaOcupacao f) throws Exception {
        conectar();
        String sql = "SELECT SER.Cd_Servico, SER.descricao, SER.valor FROM Fo AS FO ";
        sql += "INNER JOIN Servico AS SER ON FO.Cd_Ocupacao = SER.Cd_Ocupacao ";
        sql += "WHERE FO.Cd_Ocupacao = ?";

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
            throw new Exception("Problemas ao procurar serviços em Fo: " + erro.getMessage());
        }
        desconectar();
        return f;
    }

}
