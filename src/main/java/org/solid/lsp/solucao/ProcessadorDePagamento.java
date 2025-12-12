package org.solid.lsp.solucao;

public class ProcessadorDePagamento {

    public void processar(Pedido pedido, EstrategiaDeFrete estrategia) {
        double valorFinal = estrategia.calcularValorFinal(pedido);
        pedido.setValorFinal(valorFinal);

        System.out.println("Pedido processado. Valor bruto: R$ " + pedido.getValorBruto() + " | Valor final: R$ " + pedido.getValorFinal());
    }

}