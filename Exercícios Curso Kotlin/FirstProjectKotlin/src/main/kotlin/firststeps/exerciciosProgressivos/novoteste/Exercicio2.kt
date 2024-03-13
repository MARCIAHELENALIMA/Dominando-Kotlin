/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
imprima o custo total da compra.
 */
package firststeps.exerciciosProgressivos.novoteste

fun main() {
    print("Digite a quantidade de maças: ")
    val quantidade = readln().toInt()
    val precoFinal = calculaValorTotal(quantidade)
    print("valor total a pagar: $precoFinal")
}

fun calculaValorTotal(quantidade: Int): Double {
    val precoNormal = 1.30
    val precoDesconto = 1.00
    val resultado: Double

    if (quantidade >= 12) {
        resultado = precoDesconto * quantidade
    } else {
        resultado = precoNormal * quantidade
    }
    return resultado
}