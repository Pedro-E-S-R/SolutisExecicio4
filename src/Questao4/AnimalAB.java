package Questao4;



public  abstract class AnimalAB implements AnimalIF{

    private int quantidadeComida;
    private int quantidadeDormido;

    public AnimalAB(int quantidadeComida, int quantidadeDormido) {
        this.quantidadeComida = quantidadeComida;
        this.quantidadeDormido = quantidadeDormido;
    }


    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getQuantidadeDormido() {
        return quantidadeDormido;
    }

    public void setQuantidadeDormido(int quantidadeDormido) {
        this.quantidadeDormido = quantidadeDormido;
    }
}
