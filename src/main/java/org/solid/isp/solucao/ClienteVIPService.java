package org.solid.isp.solucao;

import org.solid.isp.solucao.interfaces.ICadastroCliente;
import org.solid.isp.solucao.interfaces.IGerenciadorFidelidade;
import org.solid.isp.solucao.interfaces.INotificador;

public class ClienteVIPService implements ICadastroCliente, INotificador, IGerenciadorFidelidade {

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
        System.out.println("VIP: Enviando notificação para " + email + " - " + mensagem);
    }

    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
        System.out.println("VIP: Aplicando " + percentual + "% de desconto para " + email);
    }

}