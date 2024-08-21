package Questao5;

public  abstract class AnimalTerrestreAB extends AnimalAB implements AnimalIF {

    private int caminhoAndado;
    private int quantidadeDePatas;

    public AnimalTerrestreAB(String nome, TipoAnimal tipoAnimal, int quantidadeDormido,
                             int caminhoAndado, int quantidadeDePatas,
                             int quantidadeComida, String habitat,
                             double peso, double altura, int idade) {
        super(nome, tipoAnimal, quantidadeDormido, quantidadeComida, habitat, peso, altura, idade);
        this.caminhoAndado = caminhoAndado;
        this.quantidadeDePatas = quantidadeDePatas;

    }


    public abstract void moverse();

    public int getCaminhoAndado() {
        return caminhoAndado;
    }

    public void setCaminhoAndado(int caminhoAndado) {
        this.caminhoAndado = caminhoAndado;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    @Override
    public String toString() {
        return "AnimalTerrestreAB{" +
                "nome='" + getNome() + '\'' +
                ", tipoAnimal=" + getTipoAnimal().getDescricao() +
                ", quantidadeDormido=" + getQuantidadeDormido() +
                ", caminhoAndado=" + caminhoAndado +
                ", quantidadeDePatas=" + quantidadeDePatas +
                ", \nquantidadeComida=" + getQuantidadeComida() +
                ", habitat='" + getHabitat() + '\'' +
                ", peso=" + getPeso() +
                ", altura=" + getAltura() +
                ", idade=" + getIdade() +
                '}';
    }
}
