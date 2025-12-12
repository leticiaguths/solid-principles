package org.solid.isp.violacao;

public class ClienteVIPService implements GerenciadorDeClientes {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("VIP: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "VIP: Encontrado cliente com email " + email;
    }

    @Override
    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("VIP: Enviando notificação para " + email);
    }

    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
        System.out.println("VIP: Aplicando " + percentual + "% de desconto para " + email);
    }

}
