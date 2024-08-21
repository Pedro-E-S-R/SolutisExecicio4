package Questao5;


public class Cavalo extends AnimalTerrestreAB implements AnimalIF {
    public Cavalo(String nome, TipoAnimal tipoAnimal, int quantidadeDormido, int caminhoAndado, int quantidadeDePatas, int quantidadeComida, String habitat, double peso, double altura, int idade) {
        super(nome, tipoAnimal, quantidadeDormido, caminhoAndado, quantidadeDePatas, quantidadeComida, habitat, peso, altura, idade);
    }

    @Override
    public void moverse() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
