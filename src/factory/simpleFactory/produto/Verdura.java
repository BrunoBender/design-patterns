package factory.simpleFactory.produto;

public class Verdura extends Produto {
    boolean isOrganico;

    public Verdura(String descricao, double preco, boolean isOrganico) {
        super(descricao, preco, 12);
        this.isOrganico = isOrganico;
    }

    @Override
    public boolean validarPagamento() {
        boolean isPagamentoFeito = false;
        return isPagamentoFeito ? true : despesa <= 10;
    }
}
