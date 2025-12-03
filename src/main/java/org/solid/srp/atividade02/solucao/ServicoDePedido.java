package org.solid.srp.atividade02.solucao;

import org.solid.srp.atividade02.solucao.servicos.CalculadoraDeCusto;
import org.solid.srp.atividade02.solucao.servicos.NotificadorDePedido;
import org.solid.srp.atividade02.solucao.servicos.RepositorioDePedido;
import org.solid.srp.atividade02.solucao.servicos.ValidadorDeEstoque;

public class ServicoDePedido {
    private ValidadorDeEstoque validador;
    private CalculadoraDeCusto calculadora;
    private RepositorioDePedido repositorio;
    private NotificadorDePedido notificador;

    public ServicoDePedido() {
        this.validador = new ValidadorDeEstoque();
        this.calculadora = new CalculadoraDeCusto();
        this.repositorio = new RepositorioDePedido();
        this.notificador = new NotificadorDePedido();
    }

    public double processar(Pedido pedido) throws Exception {
        validador.validar(pedido);

        double valorFinal = calculadora.calcular(pedido);

        pedido.setPago(true);

        repositorio.salvar(pedido, valorFinal);

        notificador.notificar(pedido);

        return valorFinal;
    }
}