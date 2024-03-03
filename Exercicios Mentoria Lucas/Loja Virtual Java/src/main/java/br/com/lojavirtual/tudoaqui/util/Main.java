package br.com.lojavirtual.tudoaqui.util;

import br.com.lojavirtual.tudoaqui.entidade.Produto;
import br.com.lojavirtual.tudoaqui.servico.Carrinho;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        testeCarrinho();
    }
    private static void testeCarrinho() throws Exception {
        // Cria um novo produto
        Produto testeProduto = new Produto("Produto Teste", 10.0f, "Categoria Teste", 100);

        // Cria um novo carrinho
        Carrinho carrinho = new Carrinho();

        // Adiciona o produto ao carrinho
        carrinho.adicionarProduto(testeProduto, 5);
        System.out.println("Quantidade do produto no carrinho: " + carrinho.getQuantidade(testeProduto));

        // Altera a quantidade do produto no carrinho
        carrinho.alterarQuantidade(testeProduto, 10);
        System.out.println("Quantidade do produto no carrinho após alteração: " + carrinho.getQuantidade(testeProduto));

        // Calcula o total do carrinho
        System.out.println("Total do carrinho: " + carrinho.calcularTotal());

        // Confirma a compra
        carrinho.confirmarCompra();
        System.out.println("Quantidade do produto no carrinho após confirmação da compra: " + carrinho.getQuantidade(testeProduto));
    }
}
