package Questao5;

public abstract class AnimalVoadorAB extends AnimalAB implements AnimalIF {

    private int caminhoVoado;
    private int quantidadeAssa;
    private double envergaduraAssa;

    public AnimalVoadorAB(String nome, TipoAnimal tipoAnimal, int quantidadeDormido,
                          int caminhoVoado,int quantidadeAssa,double envergaduraAssa,
                          int quantidadeComida, String habitat, double peso,
                          double altura, int idade) {
        super(nome, tipoAnimal, quantidadeDormido, quantidadeComida, habitat, peso, altura, idade);
        this.caminhoVoado = caminhoVoado;
        this.quantidadeAssa = quantidadeAssa;
        this.envergaduraAssa = envergaduraAssa;
    }


    public abstract void voar();

    public int getCaminhoVoado() {
        return caminhoVoado;
    }

    public void setCaminhoVoado(int caminhoVoado) {
        this.caminhoVoado = caminhoVoado;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    public void setEnvergaduraAssa(double envergaduraAssa) {
        this.envergaduraAssa = envergaduraAssa;
    }

    public int getQuantidadeAssa() {
        return quantidadeAssa;
    }

    public void setQuantidadeAssa(int quantidadeAssa) {
        this.quantidadeAssa = quantidadeAssa;
    }
    @Override
    public String toString() {
        return "AnimalVoadorAB{" +
                "nome= '" + getNome() + '\'' +
                ", tipoAnimal= " + getTipoAnimal().getDescricao()+
                ", quantidadeDormido= " + getQuantidadeDormido() +
                ", caminhoVoado= " + caminhoVoado +
                ", quantidadeAssa= " + quantidadeAssa +
                ", \nenvergaduraAssa=" + envergaduraAssa +
                ", quantidadeComida=" + getQuantidadeComida() +
                ", habitat='" + getHabitat() + '\'' +
                ", peso=" + getPeso() +
                ", altura=" + getAltura() +
                ", idade=" + getIdade() +
                '}';
    }
}
