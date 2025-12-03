package org.solid.lsp.violacao;

public class Pedido {

    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 0.0;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    // Método que calcula o valor do frete e atualiza o valor final.
    // O CONTRATO IMPLÍCITO (Pós-condição) é: valorFinal SEMPRE AUMENTARÁ
    // ou PERMANECERÁ o mesmo, mas nunca diminuirá o valorBruto base.

    public void aplicarFrete(double valorFrete) {
        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }
        this.valorFrete = valorFrete;
        this.valorFinal = this.valorBruto + this.valorFrete;
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

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}