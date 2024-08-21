package Questao5;


public abstract class AnimalMarinhoAB extends AnimalAB {

    private int caminhoNadado;

    public AnimalMarinhoAB(String nome, TipoAnimal tipoAnimal, int quantidadeDormido,
                           int quantidadeComida, int caminhoNadado,
                           String habitat, double peso, double altura, int idade) {
        super(nome, tipoAnimal, quantidadeDormido, quantidadeComida, habitat, peso, altura, idade);
        this.caminhoNadado = caminhoNadado;
    }


    public abstract void nadar();

    public int getCaminhoNadado() {
        return caminhoNadado;
    }

    public void setCaminhoNadado(int caminhoNadado) {
        this.caminhoNadado = caminhoNadado;
    }
    @Override
    public String toString() {
        return "AnimalMarinhoAB{" +
                "nome='" + getNome() + '\'' +
                ", tipoAnimal=" + getTipoAnimal().getDescricao() +
                ", quantidadeDormido=" + getQuantidadeDormido() +
                ", caminhoNadado=" + caminhoNadado +
                "\n, quantidadeComida=" + getQuantidadeComida() +
                ", habitat='" + getHabitat() + '\'' +
                ", peso=" + getPeso() +
                ", altura=" + getAltura() +
                ", idade=" + getIdade() +
                '}';
    }
}

