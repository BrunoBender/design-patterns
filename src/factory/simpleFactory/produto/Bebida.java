package factory.simpleFactory.produto;

public class Bebida extends Produto {
    Long miliLitros;

    public Bebida(String descricao, double preco, Long mililitros){
        super(descricao, preco);
        this.miliLitros = mililitros;
    }

    @Override
    public boolean validarPagamento() {
        boolean isPagamentoFeito = true;
        return isPagamentoFeito;
    }
}
