package org.solid.lsp.solucao;

public class Pedido {
    private double valorBruto;
    private double valorFinal;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}