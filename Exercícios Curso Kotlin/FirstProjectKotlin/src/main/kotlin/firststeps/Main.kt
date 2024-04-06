package firststeps

import firststeps.exerciciosProgressivos.CalculadoraDeMacas
import firststeps.exerciciosProgressivos.VerificarNumero
import firststeps.exerciciosProgressivos.CalculadoraDeIdade
import firststeps.exerciciosProgressivos.VerificarMaiorNumero

class Main {

    fun testeVerificaNumero() {
        val verificarNumero = VerificarNumero()
        // Testando com um número positivo
        verificarNumero.verificarPositivoOuNegativo(5)
        // Testando com um número negativo
        verificarNumero.verificarPositivoOuNegativo(-3)
    }

    fun testeCalculadoraDeMacas() {
        print("Digite a quantidade de maçãs: ")
        val quantidade = readln().toInt()

        val calculadora = CalculadoraDeMacas(quantidade)
        val precoFinal = calculadora.getResultado()

        println("Valor total a pagar: \$${precoFinal}")
    }

    fun testeCalculadoraDeIdade(){
        print("Qual seu ano de nascimento meu querido? ")
        val anoNascimentoLido = readln().toInt()
        val idade = CalculadoraDeIdade.calculaIdade(anoNascimentoLido)//argumento é o valor que passa para o parametro anoNascimento da função
        print("Você tem $idade seu coroa")
    }

    fun testeVerificarMaiorNumero(){
        val verificador = VerificarMaiorNumero()
        println("Digite três números para comparar qual deles é o maior: ")
        println("Número 1: ")
        val numero1 = readln().toInt()
        println("Número 2: ")
        val numero2 = readln().toInt()
        println("Número 3: ")
        val numero3 = readln().toInt()

        val maiorNumero = verificador.encontrarMaiorNumero(numero1, numero2, numero3)
        println("O maior número entre os três é: $maiorNumero")
    }
}

fun main() {
    val teste = Main()

    // Chama o método de teste
    //teste.testeVerificaNumero()
    teste.testeVerificarMaiorNumero()
}
