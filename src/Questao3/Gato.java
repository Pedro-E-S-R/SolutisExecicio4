package Questao3;

import Questao2.AnimalAB;

public class Gato extends AnimalAB {


    public Gato(int quantidadeComida, int quantidadeAndado, int quantidadeDormido) {
        super(quantidadeComida, quantidadeAndado, quantidadeDormido);
    }

    @Override
    public void comer() {
        System.out.println("Gato comeu "+getQuantidadeComida()+" kg");
    }

    @Override
    public void moverse() {
        System.out.println("Gato andou "+getQuantidadeAndado()+" metros");
    }

    @Override
    public void dormir() {
        System.out.println("Gato dormiu "+getQuantidadeDormido()+" horas");
    }
}