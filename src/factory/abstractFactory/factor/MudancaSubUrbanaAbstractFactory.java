package factory.abstractFactory.factor;

import factory.abstractFactory.model.moradia.Casa;
import factory.abstractFactory.model.vagaCarro.Garagem;

public abstract class  MudancaSubUrbanaAbstractFactory extends MudancaAbstractFactory {

    public MudancaSubUrbanaAbstractFactory(String apelidoCasa, String descricaoGaragem) {

        boolean hasQuintal = true;
        int qtdAndares = 1;
        int qtdQuartos = 2;
        int qtdBanheiros = 3;
        boolean hasSalaDeEstar = false;

        Casa casa = new Casa(hasQuintal,
         qtdAndares,
         apelidoCasa,
         qtdQuartos,
         qtdBanheiros,
         hasSalaDeEstar);

        double metrosQuadrados = 110;

        Garagem garagem = new Garagem(descricaoGaragem, metrosQuadrados);

    }

}
