package Questao4;

public class Bagre extends AnimalMarinhoAB{
    public Bagre(int quantidadeComida, int quantidadeDormido, int caminhoNadado) {
        super(quantidadeComida, quantidadeDormido, caminhoNadado);
    }

    @Override
    public void nadar() {
        System.out.println(this.getClass().getSimpleName() +" nadou "
        +" metros");
    }

    @Override
    public void comer() {
        System.out.println(this.getClass().getSimpleName() + " comeu " + getQuantidadeComida()
                + "kg");
    }

    @Override
    public void dormir() {
        System.out.println(this.getClass().getSimpleName()+" dormiu "
                + getQuantidadeDormido()+" horas");
    }
}
