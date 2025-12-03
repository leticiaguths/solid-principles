package org.solid.srp.atividade02.solucao.servicos;

import org.solid.srp.atividade02.solucao.Pedido;

public class CalculadoraDeCusto {

    public double calcular(Pedido pedido) {
        double frete = 0.0;

        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0;
        }

        double impostos = pedido.getValorTotal() * 0.15;
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        return valorFinal;
    }

}