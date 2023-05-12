package factory.simpleFactory;

import factory.simpleFactory.produto.Bebida;
import factory.simpleFactory.produto.Produto;
import factory.simpleFactory.produto.TipoProduto;
import factory.simpleFactory.produto.Verdura;

public class ProdutoSimpleFactory {

    public static Produto obterProduto(TipoProduto tipo, double preco, String descricao) {
        switch (tipo){
            case BEBIDA -> {
                descricao = descricao + " (Bebidas MS Mercados)";
                double precoFinal = preco * 1.25;
                return new Bebida(descricao, precoFinal, 500l);
            }
            case VERDURA -> {
                descricao = descricao + " (a melhor verdura!)";
                double precoFinal = preco * 1.15;
                return new Verdura(descricao, precoFinal, true);
            }
            default -> {
                return null;
            }
        }
    }
}
