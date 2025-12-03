package org.solid.srp.atividade02.solucao.servicos;

import org.solid.srp.atividade02.solucao.Pedido;

public class RepositorioDePedido {
    public void salvar(Pedido pedido, double valorFinal) {
        System.out.println("Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");
    }
}