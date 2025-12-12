package org.solid.lsp.solucao.estrategias;

import org.solid.lsp.solucao.EstrategiaDeFrete;
import org.solid.lsp.solucao.Pedido;

public class FretePadrao implements EstrategiaDeFrete {
    private double valorFrete;

    public FretePadrao(double valorFrete) {

        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }

        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() + valorFrete;
    }

    public double getValorFrete() { return valorFrete; }
}