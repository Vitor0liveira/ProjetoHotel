package cliente;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        } catch (SQLException erro) {
            throw new Exception("Problemas ao executar a inserção: " + erro.getMessage());
        }

        desconectar();
    }

    @Override
    public void atualizarCliente(Cliente c) throws Exception {

        conectar();
        String sql = "UPDATE Cliente SET nm_cliente = ?, telefone = ? WHERE CPF_cliente = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, c.getNm_cliente());
            cmd.setString(2, c.getTelefone());
            cmd.setString(3, c.getCpf_cliente());
            cmd.execute();
        } catch (SQLException erro) {

            throw new Exception("Problemas ao executar a atualização: " + erro.getMessage());
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
            throw new Exception("Problemas ao apagar o Cliente: " + e.getMessage());
        }
        desconectar();
    }

    @Override
    public ArrayList<Cliente> listarCliente(Cliente filtro) throws Exception {
        int posPar = 1;
        ArrayList<Cliente> retorno = new ArrayList<>();
        //abrindo a conexÃ£o
        conectar();

        String sql = " SELECT CPF_cliente, nm_cliente, ";
        sql += " telefone, sexo ";
        sql += "  FROM Cliente WHERE CPF_cliente IS NOT NULL ";
        if (filtro.getCpf_cliente() != null && filtro.getCpf_cliente().equals("") == false) {
            sql += "AND CPF_cliente = ? ";
        }
        if (filtro.getNm_cliente() != null && filtro.getNm_cliente().trim().equals("") == false) {
            sql += "AND nm_cliente LIKE ? ";
        }

        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getCpf_cliente() != null && filtro.getCpf_cliente().equals("") == false) {
                cmd.setString(posPar, filtro.getCpf_cliente());
                posPar++;
            }
            if (filtro.getNm_cliente() != null && filtro.getNm_cliente().trim().equals("") == false) {
                cmd.setString(posPar, filtro.getNm_cliente());
                posPar++;
            }
            //
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                Cliente c = new Cliente();
                c.setCpf_cliente(leitor.getString("CPF_cliente"));
                c.setNm_cliente(leitor.getString("nm_cliente"));
                c.setTelefone(leitor.getString("telefone"));
                c.setSexo(leitor.getString("sexo"));
                retorno.add(c);
            }
        } catch (SQLException erro) {
            //caso haja algum erro neste mÃ©todo serÃ¡ levantada esta execeÃ§Ã£o
            throw new Exception("Erro: " + erro.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        return retorno;
    }

    @Override
    public Cliente pesquisarCliente(String cpf) throws Exception {
        conectar();

        Cliente cli = new Cliente();

        String sql;
        sql = "SELECT nm_cliente, telefone, sexo FROM Cliente WHERE CPF_cliente = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, cpf);
            ResultSet leitor = cmd.executeQuery();
            if (leitor.next()) {
                cli.setCpf_cliente(cpf);
                cli.setNm_cliente(leitor.getString("nm_cliente"));
                cli.setTelefone(leitor.getString("telefone"));
                cli.setSexo(leitor.getString("sexo"));
            }
        } catch (SQLException erro) {
            throw new Exception("Problemas ao pesquisar cliente: " + erro.getMessage());
        }
        desconectar();

        return cli;
    }

}
