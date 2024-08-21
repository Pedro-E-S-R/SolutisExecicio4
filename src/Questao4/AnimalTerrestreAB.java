package Questao4;

public  abstract class AnimalTerrestreAB extends AnimalAB implements AnimalIF {

    private int caminhoAndado;

    public AnimalTerrestreAB(int quantidadeComida, int quantidadeDormido,int caminhoAndado) {
        super(quantidadeComida, quantidadeDormido);
        this.caminhoAndado = caminhoAndado;
    }
    public abstract void moverse();

    public int getCaminhoAndado() {
        return caminhoAndado;
    }

    public void setCaminhoAndado(int caminhoAndado) {
        this.caminhoAndado = caminhoAndado;
    }
}
