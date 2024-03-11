package firststeps

import firststeps.exercicio1.VerificarNumero

class Main {

    fun testeVerificaNumero() {
        val verificarNumero = VerificarNumero()

        // Testando com um número positivo
        verificarNumero.verificarPositivoOuNegativo(5)

        // Testando com um número negativo
        verificarNumero.verificarPositivoOuNegativo(-3)
    }
}

fun main() {
    val main = Main()

    // Chama o método de teste
    main.testeVerificaNumero()
}