package Questao4;



public abstract class AnimalMarinhoAB extends AnimalAB implements AnimalIF {

    private int caminhoNadado;

    public AnimalMarinhoAB(int quantidadeComida, int quantidadeDormido, int caminhoNadado) {
        super(quantidadeComida, quantidadeDormido);
        this.caminhoNadado = caminhoNadado;
    }

    public abstract void nadar();

    public int getCaminhoNadado() {
        return caminhoNadado;
    }

    public void setCaminhoNadado(int caminhoNadado) {
        this.caminhoNadado = caminhoNadado;
    }
}

