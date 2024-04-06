/*
Neste algoritmo, o processo começa solicitando ao usuário que insira a quantidade de maçãs que
deseja comprar. Essa quantidade é lida e armazenada em uma variável.
Em seguida, o algoritmo calcula o valor total a ser pago pelas maçãs. Se a quantidade de maçãs
for igual ou superior a 12, um preço com desconto é aplicado. Caso contrário, o preço normal é
usado.

O cálculo é feito multiplicando a quantidade de maçãs pelo preço correspondente.
Por fim, o valor total calculado é exibido para o usuário, informando quanto ele deve pagar
pelas maçãs. A lógica matemática por trás desse algoritmo envolve uma decisão baseada na quantidade:
se a quantidade atinge um certo limite, um preço mais baixo é aplicado, refletindo um desconto por
volume. Isso incentiva a compra em maior quantidade, oferecendo um melhor preço por unidade.
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