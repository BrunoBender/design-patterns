package factory.abstractFactory.model.vagaCarro;

public class VagaEstacionamento extends VagaCarro {

    public VagaEstacionamento(String descricao, double metrosQuadrados) {
        super(descricao,metrosQuadrados);
    }

    @Override
    public void realizarInspecao() {
        System.out.println("---- Conferindo vaga do AP  --------");
        System.out.println("É no subsolo?");
        System.out.println("Direito a quantas vagas?");
    }
}
