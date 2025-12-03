package org.solid.ocp.solucao;

public class CalculadoraDeDesconto {
    public double aplicarDesconto(Pedido pedido, EstrategiaDeDesconto estrategia) {
        return estrategia.calcularDesconto(pedido);
    }
}