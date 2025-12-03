package org.solid.srp.atividade01.solucao.servicos;

import org.solid.srp.atividade01.solucao.Funcionario;

public class RepositorioDeFuncionario {

    public void salvar(Funcionario funcionario) {
        System.out.println("Funcionario " + funcionario.getNome() + " salvo no banco de dados.");
    }

}