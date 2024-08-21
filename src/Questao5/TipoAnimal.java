package Questao5;

public enum TipoAnimal {
    AEREO("Aéreo"),
    TERRESTRE("Terrestre"),
    MARINHO("Marinho");

    private final String descricao;

    TipoAnimal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
