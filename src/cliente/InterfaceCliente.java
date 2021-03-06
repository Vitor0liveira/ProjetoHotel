package cliente;

import java.util.ArrayList;

public interface InterfaceCliente {

    // método 'cadastrarCliente' cadastra um cliente na tabela 'Cliente'.
    void cadastrarCliente(Cliente c) throws Exception;
    // método 'atulizarCliente' atualiza um cliente previamente cadastrado.
    void atualizarCliente(Cliente c) throws Exception;
    // método 'apagarCliente' apaga um cliente previamente cadastrado.
    void removerCliente(Cliente c) throws Exception;
    // ArrayList 'pesquisarCliente retorna os clientes cadastrados.
    ArrayList<Cliente> listarCliente(Cliente filtro) throws Exception;
    //pesquisar um cliente cadastrado.
    Cliente pesquisarCliente(String cpf) throws Exception;
    // Método lista detalhes do cliente.
    Cliente detalhesCliente(Cliente c) throws Exception;

}
