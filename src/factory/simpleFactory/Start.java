package factory.simpleFactory;

import factory.simpleFactory.produto.Bebida;
import factory.simpleFactory.produto.Produto;
import factory.simpleFactory.produto.TipoProduto;

import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Produto repolho = ProdutoSimpleFactory.obterProduto(TipoProduto.VERDURA, 15, "Repolho roxo");
        Produto batata = ProdutoSimpleFactory.obterProduto(TipoProduto.VERDURA, 35, "Batata ralada");
        Produto energetico = ProdutoSimpleFactory.obterProduto(TipoProduto.BEBIDA, 45, "Energetico");

        List<Produto> produtoList = Arrays.asList(repolho, batata, energetico);

        produtoList.stream().map(Produto::toString).forEach(System.out::println);
        produtoList.stream().map(Produto::validarPagamento).forEach(System.out::println);
    }
}
