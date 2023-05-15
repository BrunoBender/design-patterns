package factory.abstractFactory.model.vagaCarro;

public abstract class VagaCarro {
    String descricao;
    double metrosQuadrados;

    public VagaCarro(String descricao, double metrosQuadrados) {
        this.descricao = descricao;
        this.metrosQuadrados = metrosQuadrados;
    }

    public abstract void realizarInspecao();
}
