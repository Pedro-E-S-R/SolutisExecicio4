package Questao3;

import Questao2.AnimalAB;

public class Elefante extends AnimalAB {


    public Elefante(int quantidadeComida, int quantidadeAndado, int quantidadeDormido) {
        super(quantidadeComida, quantidadeAndado, quantidadeDormido);
    }

    @Override
    public void comer() {
        System.out.println("Elefante comeu "+getQuantidadeComida()+" kg");

    }

    @Override
    public void moverse() {
        System.out.println("Elefante andou "+getQuantidadeAndado()+" metros");
    }

    @Override
    public void dormir() {
        System.out.println("Elefante dormiu "+getQuantidadeDormido()+" horas");
    }
}