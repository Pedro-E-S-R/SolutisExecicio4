package Questao3;

import Questao2.AnimalAB;

public class Leao extends AnimalAB {


    public Leao(int quantidadeComida, int quantidadeAndado, int quantidadeDormido) {
        super(quantidadeComida, quantidadeAndado, quantidadeDormido);
    }

    @Override
    public void comer() {
        System.out.println("Leao comeu "+getQuantidadeComida()+" kg");
    }

    @Override
    public void moverse() {
        System.out.println("Leao andou "+getQuantidadeAndado()+" metros");
    }

    @Override
    public void dormir() {
        System.out.println("Leao dormiu "+getQuantidadeDormido()+" horas");
    }
}
