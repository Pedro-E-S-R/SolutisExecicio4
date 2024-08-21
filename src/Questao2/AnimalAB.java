package Questao2;

import Questao1.AnimalIF;

public  abstract class AnimalAB implements AnimalIF {

    private int quantidadeComida;
    private int quantidadeAndado;
    private int quantidadeDormido;

    public AnimalAB(int quantidadeComida, int quantidadeAndado, int quantidadeDormido) {
        this.quantidadeComida = quantidadeComida;
        this.quantidadeAndado = quantidadeAndado;
        this.quantidadeDormido = quantidadeDormido;
    }


    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getQuantidadeAndado() {
        return quantidadeAndado;
    }

    public void setQuantidadeAndado(int quantidadeAndado) {
        this.quantidadeAndado = quantidadeAndado;
    }

    public int getQuantidadeDormido() {
        return quantidadeDormido;
    }

    public void setQuantidadeDormido(int quantidadeDormido) {
        this.quantidadeDormido = quantidadeDormido;
    }
}
