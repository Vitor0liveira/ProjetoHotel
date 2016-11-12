package fo;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosFo extends Dados implements InterfaceFo {

    @Override
    public Fo pesquisarFo(int cd_ocupacao) throws Exception {

        conectar();

        Fo f = new Fo();

        try {
            // Para pesquisar a "FO" é necessário informar o cd_ocupacao, CPF_cliente e nr_quarto.
            String Sql = " SELECT cd_ocupacao, CPF_cliente, nr_quarto FROM FO ";
            Sql += " WHERE cd_ocupacao = ? AND CPF_cliente = ? AND nr_quarto = ? ";

            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setInt(1, f.getCd_ocupacao());
            Cmd.setString(2, f.getCliente().getCpf_cliente());
            Cmd.setInt(3, f.getQuarto().getNr_quarto());
            Cmd.execute();

        } catch (SQLException erro) {
            throw new Exception("Erro: " + erro.getMessage());
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
               sql = "quarto = ? WHERE cd_ocupacao = ?";
        
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

}
