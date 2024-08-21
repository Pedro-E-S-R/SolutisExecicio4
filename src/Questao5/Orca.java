package Questao5;



public class Orca extends AnimalMarinhoAB implements AnimalIF{

    public Orca(String nome, TipoAnimal tipoAnimal, int quantidadeDormido, int quantidadeComida, int caminhoNadado, String habitat, double peso, double altura, int idade) {
        super(nome, tipoAnimal, quantidadeDormido, quantidadeComida, caminhoNadado, habitat, peso, altura, idade);
    }

    @Override
    public void nadar() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
