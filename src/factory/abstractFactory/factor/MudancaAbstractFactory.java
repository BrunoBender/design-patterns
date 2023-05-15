package factory.abstractFactory.factor;

import factory.abstractFactory.model.moradia.Moradia;
import factory.abstractFactory.model.vagaCarro.Garagem;
import factory.abstractFactory.model.vagaCarro.VagaCarro;

public abstract class MudancaAbstractFactory {

    VagaCarro vagaCarro;
    Moradia moradia;

    public void visitarMoradiaEscolhida(String apelidoMoradia, String descricaoVagaCarro) {
        System.out.println("Definir destino");
        System.out.println("Ir ao local no horário definido para visita");

        obterPreDefinicoes(apelidoMoradia, descricaoVagaCarro);
        moradia.realizarInspecao();
        vagaCarro.realizarInspecao();
    }

    private void obterPreDefinicoes(String apelidoMoradia, String descricaoVagaCarro){
        moradia = obterMoradia(apelidoMoradia);
        vagaCarro = obterVagaCarro(descricaoVagaCarro);
    }
    abstract Moradia obterMoradia(String apelidoMoradia);
    abstract VagaCarro obterVagaCarro(String descricaoVagaCarro);
}
