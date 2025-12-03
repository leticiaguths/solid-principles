package org.solid.srp.atividade01.solucao.servicos;

import org.solid.srp.atividade01.solucao.Funcionario;

public class GeradorDeRelatorio {
    private CalculadoraDeSalario calculadora;

    public GeradorDeRelatorio(CalculadoraDeSalario calculadora) {
        this.calculadora = calculadora;
    }

    public void imprimirRelatorio(Funcionario funcionario) {
        System.out.println("--- Relatório de Funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salário Líquido Calculado: R$ " + calculadora.calcularSalarioLiquido(funcionario));
        System.out.println("--------------------------------");
    }
}