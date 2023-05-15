package factory.abstractFactory.factor;

import factory.abstractFactory.model.moradia.Casa;
import factory.abstractFactory.model.moradia.Moradia;
import factory.abstractFactory.model.vagaCarro.Garagem;
import factory.abstractFactory.model.vagaCarro.VagaCarro;

public class  MudancaSubUrbanaAbstractFactory extends MudancaAbstractFactory {

    @Override
    Moradia obterMoradia(String apelidoMoradia) {
        boolean hasQuintal = true;
        int qtdAndares = 1;
        int qtdQuartos = 2;
        int qtdBanheiros = 3;
        boolean hasSalaDeEstar = false;

        Casa casa = new Casa(hasQuintal,
                qtdAndares,
                apelidoMoradia,
                qtdQuartos,
                qtdBanheiros,
                hasSalaDeEstar);

        return casa;
    }

    @Override
    VagaCarro obterVagaCarro(String descricaoVagaCarro) {
        double metrosQuadrados = 110;

        Garagem garagem = new Garagem(descricaoVagaCarro, metrosQuadrados);
        return garagem;
    }

}
