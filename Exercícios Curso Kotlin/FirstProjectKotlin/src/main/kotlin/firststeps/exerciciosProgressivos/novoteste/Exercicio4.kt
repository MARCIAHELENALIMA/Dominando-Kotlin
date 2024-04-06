/*
Neste algoritmo, inicio pedindo três números distintos. Esses números serão usados para determinar
qual deles é o maior.
Solicito o primeiro número e o armazeno. Este número é o ponto de partida para a comparação.
Depois peço o segundo número. Se este for maior que o primeiro, ele se torna o novo maior número.
Depois, peço o terceiro número. Se este for maior que os dois anteriores, ele se torna o maior número.

Estou comparando cada número com os outros para encontrar o maior. Utilizo comparações diretas, se
um número é maior que o outro, ele é considerado o maior até que uma comparação seguinte prove o
contrário. No final digo qual dos três números é o maior.
 */

package firststeps.exerciciosProgressivos.novoteste

fun main() {
    println("Digite três números para comparar qual é o maior:")
    print("Número 1: ")
    val numero1 = readln().toInt()
    print("Número 2: ")
    val numero2 = readln().toInt()
    print("Número 3: ")
    val numero3 = readln().toInt()

    val maiorNumero = encontrarMaiorNumero(numero1, numero2, numero3)
    println("O maior número entre os três é: $maiorNumero")
}

fun encontrarMaiorNumero(numero1: Int, numero2: Int, numero3: Int): Int {
    var maiorNumero = numero1
    if (numero2 > maiorNumero) {
        maiorNumero = numero2
    }
    if (numero3 > maiorNumero) {
        maiorNumero = numero3
    }
    return maiorNumero
}
