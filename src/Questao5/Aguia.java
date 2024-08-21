package Questao5;


public class Aguia extends AnimalVoadorAB implements AnimalIF {
    public Aguia(String nome, TipoAnimal tipoAnimal, int quantidadeDormido, int caminhoVoado, int quantidadeAssa, double envergaduraAssa, int quantidadeComida, String habitat, double peso, double altura, int idade) {
        super(nome, tipoAnimal, quantidadeDormido, caminhoVoado, quantidadeAssa, envergaduraAssa, quantidadeComida, habitat, peso, altura, idade);
    }

    @Override
    public void voar() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
