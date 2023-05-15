package factory.abstractFactory.model.vagaCarro;

public class Garagem extends VagaCarro {

    public Garagem(String descricao, double metrosQuadrados) {
        super(descricao,metrosQuadrados);
    }

    @Override
    public void realizarInspecao() {
        System.out.println("---- Conferindo garagem da casa --------");
        System.out.println("Conferir portão");
        System.out.println("Tem depósito?");
        System.out.println("Analizar possíveis goteiras");
    }
}
