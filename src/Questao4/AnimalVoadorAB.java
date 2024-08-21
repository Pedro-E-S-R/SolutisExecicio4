package Questao4;

public abstract class AnimalVoadorAB extends AnimalAB implements AnimalIF{

    private int caminhoVoado;

    public AnimalVoadorAB(int quantidadeComida, int quantidadeDormido,int caminhoVoado) {
        super(quantidadeComida, quantidadeDormido);
        this.caminhoVoado = caminhoVoado;
    }
    public abstract void voar();

    public int getCaminhoVoado() {
        return caminhoVoado;
    }

    public void setCaminhoVoado(int caminhoVoado) {
        this.caminhoVoado = caminhoVoado;
    }
}
