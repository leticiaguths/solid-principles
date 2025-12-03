package org.solid.srp.atividade01.solucao.servicos;

import org.solid.srp.atividade01.solucao.Funcionario;

public class CalculadoraDeSalario {

    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();

        if (salarioBase > 5000.00) {
            return salarioBase * 0.90;
        } else {
            return salarioBase * 0.95;
        }
    }

}