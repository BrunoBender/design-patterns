package factory.abstractFactory;

import factory.abstractFactory.factor.MudancaAbstractFactory;
import factory.abstractFactory.factor.MudancaSubUrbanaAbstractFactory;
import factory.abstractFactory.factor.MudancaUrbanaAbstractFactory;

public class Start {
    public static void main(String[] args) {
        MudancaAbstractFactory subUrbanaFactory = new MudancaSubUrbanaAbstractFactory();
        MudancaAbstractFactory urbanaFactory = new MudancaUrbanaAbstractFactory();

        subUrbanaFactory.visitarMoradiaEscolhida("Primeira casa", "Garagem dos fundos");
        urbanaFactory.visitarMoradiaEscolhida("Primeiro AP", "Vaga do carro");
    }
}
