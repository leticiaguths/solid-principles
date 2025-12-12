package org.solid.isp.violacao;

public interface GerenciadorDeClientes {

    // 1. Operações de Cadastro
    void cadastrarCliente(String nome, String email);

    String buscarClientePorEmail(String email);

    // 2. Operações de Comunicação
    void enviarNotificacao(String email, String mensagem);

    // 3. Operações de Fidelidade/VIP
    void aplicarDescontoVIP(String email, double percentual);

}