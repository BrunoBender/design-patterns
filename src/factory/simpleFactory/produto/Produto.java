package factory.simpleFactory.produto;

public abstract class Produto {
    String descricao;
    double preco;
    double despesa;

    public Produto (String descricao, double preco) {
        this(descricao, preco, 0);
    }

    public Produto (String descricao, double preco, double despesa) {
        this.descricao = descricao;
        this.preco = preco;
        this.despesa = despesa;
    }

    private double calcularLucro() {
        return preco - despesa;
    }

    public abstract boolean validarPagamento();

    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.append(descricao)
                .append(" | R$")
                .append(preco)
                .append(" | lucro: R$")
                .append(calcularLucro())
                .toString();
    }
}
