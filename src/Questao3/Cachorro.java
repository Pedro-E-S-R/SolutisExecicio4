package Questao3;

import Questao2.AnimalAB;

public class Cachorro extends AnimalAB {


    public Cachorro(int quantidadeComida, int quantidadeAndado, int quantidadeDormido) {
        super(quantidadeComida, quantidadeAndado, quantidadeDormido);
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comeu "+getQuantidadeComida()+" kg");
    }

    @Override
    public void moverse() {
        System.out.println("Cachorro andou "+getQuantidadeAndado()+" metros");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dormiu "+getQuantidadeDormido()+" horas");
    }
}
