package projetoEstudoComunidadePurple.model

import java.util.*

class AnaliseAltura {

    private val dados: List<Pair<Double, String>> = listOf(
        Pair(1.75, "masculino"),
        Pair(1.65, "feminino"),
        Pair(1.80, "masculino"),
        Pair(1.60, "feminino"),
        Pair(1.70, "masculino"),
        Pair(1.68, "feminino"),
        Pair(1.85, "masculino"),
        Pair(1.55, "feminino"),
        Pair(1.72, "masculino"),
        Pair(1.62, "feminino")
    )

    /*
    Recebo uma lista de pares, onde o primeiro elemento é um número decimal representando a altura
    e o segundo é uma string representando o sexo. A função retorna um inteiro, que é o número de mulheres
    na lista de dados.

    Para contar, uso a função count. Ela conta o número de elementos na lista que atendem a uma determinada
    condição, especificada por uma expressão lambda.

    Na expressão lambda, acesso o segundo elemento do par usando it.second, que representa a string do sexo.
    Transformo essa string em minúsculas usando toLowerCase() para garantir que não haja discrepância de maiúsculas
    e minúsculas. Em seguida, comparo essa string com "feminino", pois é isso que estou procurando. Se o sexo for
    feminino, a expressão lambda retorna true e a função count conta esse elemento.

    No final, a função retorna o número total de elementos que atenderam à condição, ou seja, o número de mulheres
    na lista de dados.
    */
    fun contarMulheres(): Int {
        return dados.count { it.second.lowercase(Locale.getDefault()) == "feminino" }
    }

    /*
    Recebo uma lista de alturas da lista de dados. Em seguida, utilizo as funções maxOrNull e minOrNull para
    a maior e a menor altura, respectivamente. Se a lista estiver vazia, atribuo 0 como padrão.
    Finalmente, retorno a maior e a menor altura como um par de valores.
    */
    fun calcularAlturaMaxMin(): Pair<Double, Double> {
        val alturas = dados.map { it.first }
        val maximo = alturas.maxOrNull() ?: 0.0
        val minimo = alturas.minOrNull() ?: 0.0
        return Pair(maximo, minimo)
    }

    /*
    Primeiro, filtro os dados para incluir apenas os homens. Em seguida, mapeio para obter somente as alturas
    dos homens. Por fim, calculo a média das alturas dos homens usando a função average().
    Se não houver homens na lista, a média será 0.
    */
    fun calcularMediaAlturaHomens(): Double {
        val alturaHomens = dados.filter { it.second.lowercase(Locale.getDefault()) == "masculino" }.map { it.first }
        return if (alturaHomens.isNotEmpty()) {
            alturaHomens.average()
        } else {
            0.0
        }
    }
}