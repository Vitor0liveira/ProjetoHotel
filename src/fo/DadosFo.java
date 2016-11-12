package fo;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosFo extends Dados implements InterfaceFo {

    @Override
    public Fo pesquisarFo(int cd_ocupacao) throws Exception {
        conectar();
        Fo f = new Fo();
        
            String sql = " SELECT data_entrada, hora_entrada, data_saida, hora_saida varlorDiaria, quarto, CPF_cliente FROM Fo ";
            sql += " WHERE cd_ocupacao = ?";

            try {
                PreparedStatement cmd = conn.prepareStatement(sql);
                cmd.setInt(1, cd_ocupacao);
                ResultSet leitor = cmd.executeQuery();
                while (leitor.next()) {
                  f.setCd_ocupacao(cd_ocupacao);
                  f.setData_entrada(leitor.getString("data_entrada"));
                  f.setHora_entrada(leitor.getString("hora_entrada"));
                  f.setData_saida(leitor.getString("data_saida"));
                  f.setHora_saida(leitor.getString("hora_saida"));
                  f.setValorDiaria(leitor.getFloat("valorDiaria"));
                  f.getQuarto().setNr_quarto(leitor.getInt("quarto"));
                  f.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
                }
            } catch (Exception erro) {
                  throw new Exception ("Problemas ao pesquisar a ocupação: " + erro.getMessage());
            }
        return f;    
    }

    @Override
    public void cadastrarFo(Fo f) throws Exception {
        conectar();

        String sql = "INSERT INTO Fo (cd_ocupacao, data_entrada, hora_entrada, data_saida, hora_saida, valorDiaria, quarto, CPF_cliente); ";
        sql += " VALUES (?,?,?,?,?,?,?,?)";

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
        
        try{
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, f.getData_entrada());
            cmd.setString(2, f.getHora_entrada());
            cmd.setString(3, f.getData_saida());
            cmd.setString(4, f.getHora_saida());
            cmd.setInt(5, f.getQuarto().getNr_quarto());
            cmd.setInt(6, f.getCd_ocupacao());
            
            cmd.execute();
            
        }catch(SQLException erro){
            throw new Exception ("Erro ao atualizar a FO: " + erro.getMessage());
        }
    }

    @Override
    public ArrayList<Fo> listarFo() throws Exception {
        ArrayList<Fo> retorno = new ArrayList<>();
        conectar();
        
        String sql = "SELECT cd_ocupacao, data_entrada, hora_entrada, ";
        sql += "data_saida, hora_saida, valorDiaria, quarto, CPF_cliente ";
        sql += "FROM Fo";
        
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            ResultSet leitor = cmd.executeQuery();
            
            while(leitor.next()) {
                Fo fO = new Fo();
                fO.setCd_ocupacao(leitor.getInt("cd_ocupacao"));
                fO.setData_entrada(leitor.getString("data_entrada"));
                fO.setHora_entrada(leitor.getString("hora_entrada"));
                fO.setData_saida(leitor.getString("data_saida"));
                fO.setHora_saida(leitor.getString("hora_saida"));
                fO.setValorDiaria(leitor.getFloat("valorDiaria"));
                fO.getQuarto().setNr_quarto(leitor.getInt("quarto"));
                fO.getCliente().setCpf_cliente(leitor.getString("CPF_cliente"));
            }
        } catch (Exception erro) {
                throw new Exception ("Erro: " + erro.getMessage());
        }
        
        return retorno;
    }

}
