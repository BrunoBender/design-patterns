package factory.abstractFactory.model.moradia;

public class Casa extends Moradia {
    boolean hasQuintal;
    int qtdAndares;

    public Casa(
            boolean hasQuintal,
            int qtdAndares,
            String apelido,
            int qtdQuartos,
            int qtdBanheiros,
            boolean hasSalaDeEstar)
    {
        super(apelido, qtdQuartos, qtdBanheiros, hasSalaDeEstar);
        this.hasQuintal = hasQuintal;
        this.qtdAndares = qtdAndares;
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Avaliar área externa");
        System.out.println("Analisar telhado");
        System.out.println("Conferir pintura externa");
    }
}
