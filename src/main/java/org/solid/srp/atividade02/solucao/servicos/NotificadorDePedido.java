package org.solid.srp.atividade02.solucao.servicos;

import org.solid.srp.atividade02.solucao.Pedido;

public class NotificadorDePedido {

    public void notificar(Pedido pedido) {
        System.out.println("Email de confirmação enviado para: " + pedido.getEmailCliente() + " | Pedido: " + pedido.getId());
    }

}