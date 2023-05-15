package factory.abstractFactory.model.moradia;

public class Apartamento extends Moradia {
    double condominio;
    int numeroAp;
    int andar;

    public Apartamento(
            double condominio,
            int numeroAp,
            int andar,
            String apelido,
            int qtdQuartos,
            int qtdBanheiros,
            boolean hasSalaDeEstar)
    {
        super(apelido, qtdQuartos, qtdBanheiros, hasSalaDeEstar);
        this.condominio = condominio;
        this.numeroAp = numeroAp;
        this.andar = andar;
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Conferir valor do condomínio");
        System.out.println("Permite pets?");
        System.out.println("Vizinhos barulhentos?");
    }
}
