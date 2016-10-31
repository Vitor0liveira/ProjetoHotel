package cliente;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

        } catch (SQLException e) {
            throw new Exception("Problemas ao executar a inserção: " + e.getMessage());
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

        String sql = "DELETE FROM Cliente WHERE CPF_cliente = ? ;";
        try {

            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, c.getCpf_cliente());

            cmd.execute();
        } catch (SQLException e) {

            throw new Exception("Problemas ao remover o cliente: " + e.getMessage());
        }

        desconectar();
    }

    @Override
    public ArrayList<Cliente> pesquisarCliente(Cliente filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
