/*
Começo pedindo as informações, uso a função readln() para ler suas respostas e guardar
nas variáveis, como o nome do produto, a quantidade desejada e o preço unitário.
Eu calculo o valor total da compra e aplico desconto com base na quantidade que o
usuário informou na comprando.

Calculo o valor total da compra multiplicando a quantidade pelo preço unitário e
guardo na variável valor total.
Depois calculo o desconto com base na quantidade e no valor total ultilizando a função
calcularDesconto e guardo o resultado na variável desconto
tambem calculo o total a pagar subtraindo o desconto do valor total da compra.

A função recebe a quantidade e o valor total como parâmetros e retorna o desconto
- Se o usuário comprar 5 unidades ou menos, aplico um desconto de 2%.
- Se o usuário comprar entre 6 e 10 unidades, o desconto é de 3%.
- Se o usuário comprar mais de 10 unidades, aplico um desconto de 5%.

Depois de calcular o desconto, eu subtraio esse valor do valor total da compra para
obter o total a pagar. Mostro um resumo da compra no fim.
 */

package firststeps.exerciciosProgressivos.testesMain

fun main(){
    //Entradas do usuário
    println("Simulação de compra! Vamos calcular o valor da sua compra?")
    println("----------------------------------------------------------")
    println("Qual é o produto que você deseja comprar?")
    val nomeProduto = readln()
    println("Quantas unidades você gostaria de levar?")
    val quantidade = readln().toIntOrNull() ?: 0
    println("Qual é o preço unitário do produto?")
    val precoUnitario = readln().toDoubleOrNull() ?: 0.0

    // Cálculo
    val valorTotal = quantidade * precoUnitario
    val desconto = calcularDesconto(quantidade, valorTotal)
    val totalPagar = valorTotal - desconto

    // Exibir resultados (saídas)
    println("---------------------------------")
    println("Resumo da sua compra:")
    println("Produto: $nomeProduto")
    println("Quantidade: $quantidade unidades")
    println("Preço unitário: R$$precoUnitario")
    println("----------------------------------")
    println("Valor total da compra: R$$valorTotal")
    println("Desconto aplicado: R$$desconto")
    println("Total a pagar: R$$totalPagar")
}

fun calcularDesconto(quantidade: Int, valorTotal: Double): Double {
    return when {
        quantidade <= 5 -> valorTotal * 0.02
        quantidade <= 10 -> valorTotal * 0.03
        else -> valorTotal * 0.05
    }
}






















