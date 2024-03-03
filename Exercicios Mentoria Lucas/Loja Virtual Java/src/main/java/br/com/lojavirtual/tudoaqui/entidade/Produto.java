package br.com.lojavirtual.tudoaqui.entidade;

import javax.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Produto {

    @Column(nullable = false) // não pode ser nulo
    private String nome;
    private Float preco;
    private String categoria;
    private int estoque;

    // Construtor public da classe Produto
    public Produto(String nome, float preco, String categoria, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }

    // Método para subtrair do estoque a quantidade informada
    public void subtrairDoEstoque(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente do produto " + nome + ",lamento querido, tente depois");
        }
    }

    // Método para adicionar ao estoque a quantidade informada
    public void reporEstoque(int quantidade) {
        estoque += quantidade;
        System.out.println("Estoque do produto: " + nome + " atualizado com sucesso!!");
    }
}
