package cliente;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DadosCliente extends Dados implements InterfaceCliente {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {

        conectar();

        String sql = "INSERT INTO Cliente (CPF_cliente, nm_cliente, telefone, sexo) ";
        sql += "VALUES (?,?,?,?);";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, c.getCpf_cliente());
            cmd.setString(2, c.getNm_cliente());
            cmd.setString(3, c.getTelefone());
            cmd.setString(4, c.getSexo());
            cmd.execute();

        } catch (SQLException erro) {
            throw new Exception("Problemas ao executar a inserção: " + erro.getMessage());
        }

        desconectar();
    }

    @Override
    public void atualizarCliente(Cliente c) throws Exception {

        Statement conex = conectar();
        String sql = "UPDATE Cliente SET nm_cliente, telefone = ? WHERE CPF_cliente = ? ;";

        try {

            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, c.getNm_cliente());
            cmd.setString(2, c.getTelefone());
            cmd.execute();

        } catch (SQLException e) {

            throw new Exception("Problemas ao executar a atualização: " + e.getMessage());
        }

        desconectar();
    }

    @Override
    public void apagarCliente(Cliente c) throws Exception {

        conectar();

        String Sql = "DELETE FROM Cliente WHERE CPF_cliente = ?; ";
        
        try {
            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setString(1, c.getCpf_cliente());
            Cmd.execute();

        } catch (SQLException e) {
            throw new Exception("Erro ao Apagar o Cliente: " + e.getMessage());
        }
        desconectar();
    }

    @Override
    public boolean verificarExistencia(Cliente c) throws Exception{
        boolean retorno = false;
        conectar();
        String sql = "SELECT CPF_cliente";
        sql += "FROM Cliente WHERE CPF_cliente = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, c.getCpf_cliente());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                retorno = true;
                break;
            }
        } catch (SQLException erro) {
            throw new Exception ("Erro: " + erro.getMessage());
        }

        desconectar();
        return retorno;
    }
}
