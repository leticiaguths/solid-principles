package org.solid.isp.violacao;

public class ClienteComumService implements GerenciadorDeClientes {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("COMUM: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "COMUM: Encontrado cliente com email " + email;
    }

    // VIOLAÇÃO AQUI: O ClienteComumService é forçado a implementar métodos que não usa.
    @Override
    public void enviarNotificacao(String email, String mensagem) {
    // Deveria ser vazia ou lançar exceção
        throw new UnsupportedOperationException("Clientes comuns não recebem notificações.");
    }

    // VIOLAÇÃO AQUI: O ClienteComumService é forçado a implementar métodos que não usa.
    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
    // Deveria ser vazia ou lançar exceção
        throw new UnsupportedOperationException("Desconto VIP não aplicável a clientes comuns.");
    }

}