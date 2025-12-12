package org.solid.lsp.solucao.estrategias;

import org.solid.lsp.solucao.EstrategiaDeFrete;
import org.solid.lsp.solucao.Pedido;

public class FreteGratis implements EstrategiaDeFrete {

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto();
    }

}