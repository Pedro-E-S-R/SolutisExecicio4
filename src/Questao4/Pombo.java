package Questao4;

public class Pombo extends AnimalVoadorAB{
    public Pombo(int quantidadeComida, int quantidadeDormido, int caminhoVoado) {
        super(quantidadeComida, quantidadeDormido, caminhoVoado);
    }


    @Override
    public void comer() {
        System.out.println(this.getClass().getSimpleName() + "comeu " + getQuantidadeComida()
                + "kg");
    }

    @Override
    public void dormir() {
        System.out.println(this.getClass().getSimpleName()+" dormiu "
        + getQuantidadeDormido()+" horas");
    }

    @Override
    public void voar() {
        System.out.println(this.getClass().getSimpleName()+" voou "+
                getCaminhoVoado()+" km");
    }
}
