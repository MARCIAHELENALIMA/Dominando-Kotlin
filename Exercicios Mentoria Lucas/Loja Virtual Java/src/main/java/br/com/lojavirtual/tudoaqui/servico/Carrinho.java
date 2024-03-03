package br.com.lojavirtual.tudoaqui.servico;

import br.com.lojavirtual.tudoaqui.entidade.Produto;
import java.util.*;

// Classe Carrinho com métodos CRUD
public class Carrinho {
    // Mapa para armazenar os produtos no carrinho e suas quantidades
    private final Map<Produto, Integer> produtos;

    public Carrinho() {
        produtos = new HashMap<>();
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {
        // Verifica se há estoque suficiente antes de adicionar o produto
        if (produto.getEstoque() >= quantidade) {
            // Adiciona o produto ao mapa de produtos ou atualiza a quantidade se o produto já está no carrinho
            produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
            // Subtrai a quantidade adicionada do estoque do produto
            produto.subtrairDoEstoque(quantidade);
        } else {
            System.out.println("Estoque insuficiente do produto " + produto.getNome());
        }
    }

    // Método para remover um produto do carrinho
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    // Método para alterar a quantidade de um produto no carrinho
    public void alterarQuantidade(Produto produto, int novaQuantidade) {

        // Verifica se há estoque suficiente antes de alterar a quantidade
        if (produto.getEstoque() >= novaQuantidade) {

            // Atualiza a quantidade do produto no mapa de produtos
            produtos.put(produto, novaQuantidade);
        } else {
            System.out.println("Estoque insuficiente do produto " + produto.getNome());
        }
    }

    // Método para calcular o total do carrinho
    public float calcularTotal() {
        float total = 0;
        // Percorre o mapa de produtos
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            // Adiciona ao total o preço do produto multiplicado pela sua quantidade
            total += entry.getKey().getPreco() * entry.getValue();
        }
        // Retorna o total
        return total;
    }

    // Método para confirmar a compra
    public void confirmarCompra() {
        // Percorre o mapa de produtos
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            // Subtrai a quantidade comprada do estoque do produto
            entry.getKey().subtrairDoEstoque(entry.getValue());
        }
        // Limpa o mapa de produtos
        produtos.clear();
        // Retorna true para indicar que a compra foi confirmada
    }

    // Método para obter a quantidade de um produto específico no carrinho
    public int getQuantidade(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }
}
