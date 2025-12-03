package org.solid.ocp.solucao.estrategias;

import org.solid.ocp.solucao.EstrategiaDeDesconto;
import org.solid.ocp.solucao.Pedido;

public class DescontoVIP implements EstrategiaDeDesconto {
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }
}