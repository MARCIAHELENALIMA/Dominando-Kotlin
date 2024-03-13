package firststeps

import firststeps.exerciciosProgressivos.CalculadoraDeMacas
import firststeps.exerciciosProgressivos.VerificarNumero

class Main {

    fun testeVerificaNumero() {
        val verificarNumero = VerificarNumero()
        // Testando com um número positivo
        verificarNumero.verificarPositivoOuNegativo(5)
        // Testando com um número negativo
        verificarNumero.verificarPositivoOuNegativo(-3)
    }

    private fun testeCalculadoraDeMacas() {
        print("Digite a quantidade de maçãs: ")
        val quantidade = readln().toInt()

        val calculadora = CalculadoraDeMacas(quantidade)
        val precoFinal = calculadora.getResultado()

        println("Valor total a pagar: \$${precoFinal}")
    }

    fun teste() {
        val teste = Main()

        // Chama o método de teste
        //teste.testeVerificaNumero()
        teste.testeCalculadoraDeMacas()
    }
}