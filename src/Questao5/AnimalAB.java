package Questao5;


public  abstract class AnimalAB implements AnimalIF {

    private String nome;
    private TipoAnimal tipoAnimal;
    private int idade;
    private double altura;
    private double peso;
    private String habitat;
    private int quantidadeComida;
    private int quantidadeDormido;

    public AnimalAB(String nome, TipoAnimal tipoAnimal, int quantidadeDormido, int quantidadeComida, String habitat, double peso, double altura, int idade) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.quantidadeDormido = quantidadeDormido;
        this.quantidadeComida = quantidadeComida;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getQuantidadeDormido() {
        return quantidadeDormido;
    }

    public void setQuantidadeDormido(int quantidadeDormido) {
        this.quantidadeDormido = quantidadeDormido;
    }
}
