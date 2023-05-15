package factory.abstractFactory.model.moradia;

public abstract class Moradia {
    String apelido;
    int qtdQuartos;
    int qtdBanheiros;
    boolean hasSalaDeEstar;

    public Moradia(String apelido, int qtdQuartos, int qtdBanheiros, boolean hasSalaDeEstar) {
        this.apelido = apelido;
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiros = qtdBanheiros;
        this.hasSalaDeEstar = hasSalaDeEstar;
    }

    public abstract void realizarInspecao();
}
