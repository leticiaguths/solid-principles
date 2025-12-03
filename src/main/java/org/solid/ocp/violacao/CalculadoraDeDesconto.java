package org.solid.ocp.violacao;

public class CalculadoraDeDesconto {

    public double aplicarDesconto(Pedido pedido) {
        double valor = pedido.getValorBruto();
        TipoDesconto tipo = pedido.getTipoDesconto();

        if (tipo == TipoDesconto.CUPOM) {
            // Lógica para CUPOM: 10%
            return valor * 0.90;
        } else if (tipo == TipoDesconto.VIP) {
            // Lógica para VIP: 15%
            return valor * 0.85;
        } else if (tipo == TipoDesconto.SAZONAL) {
            // Lógica para Sazonal: 5%
            return valor * 0.95;
        }

        // AQUI ESTÁ A VIOLAÇÃO: SE O NOVO DESCONTO (ANIVERSARIO) FOSSE ADICIONADO:
        /* else if (tipo == TipoDesconto.ANIVERSARIO) {
        // Lógica para Aniversário: 20%
            return valor * 0.80;
        } */
        // ESSA MODIFICAÇÃO NO CÓDIGO EXISTENTE (A CLASSE CalculadoraDeDesconto) VIOLA O OCP!

        return valor;
    }
}