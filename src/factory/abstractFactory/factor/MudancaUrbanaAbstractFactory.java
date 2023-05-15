package factory.abstractFactory.factor;

import factory.abstractFactory.model.moradia.Apartamento;
import factory.abstractFactory.model.moradia.Casa;
import factory.abstractFactory.model.moradia.Moradia;
import factory.abstractFactory.model.vagaCarro.Garagem;
import factory.abstractFactory.model.vagaCarro.VagaCarro;
import factory.abstractFactory.model.vagaCarro.VagaEstacionamento;

public class MudancaUrbanaAbstractFactory extends MudancaAbstractFactory {

    @Override
    Moradia obterMoradia(String apelidoMoradia) {

        Apartamento apartamento = new Apartamento(450,
                134,
                3,
                apelidoMoradia,
                2,
                1,
                false
        );

        return apartamento;
    }

    @Override
    VagaCarro obterVagaCarro(String descricaoVagaCarro) {
        return new VagaEstacionamento(descricaoVagaCarro, 25);
    }
}
