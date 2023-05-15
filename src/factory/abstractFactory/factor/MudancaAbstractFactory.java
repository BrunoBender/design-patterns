package factory.abstractFactory.factor;

import factory.abstractFactory.model.moradia.Moradia;
import factory.abstractFactory.model.vagaCarro.VagaCarro;

public abstract class MudancaAbstractFactory {

    VagaCarro vagaCarro;
    Moradia moradia;

    public MudancaAbstractFactory(VagaCarro vagaCarro, Moradia moradia) {
        this.vagaCarro = vagaCarro;
        this.moradia = moradia;
    }

    public void visitarMoradiaEscolhida(String opcaoResidencia) {
        System.out.println("Definir destino");
        System.out.println("Ir ao local no horário definido para visita");

        moradia.realizarInspecao();
        vagaCarro.realizarInspecao();
    }

    public void setGaragem(Gara)
}
