package org.solid.srp.atividade02.solucao.servicos;

import org.solid.srp.atividade02.solucao.Pedido;

public class ValidadorDeEstoque {

    public void validar(Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
    }

}