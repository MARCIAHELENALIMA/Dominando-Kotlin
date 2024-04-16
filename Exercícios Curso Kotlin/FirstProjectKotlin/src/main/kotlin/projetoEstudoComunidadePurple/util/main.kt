package projetoEstudoComunidadePurple.util

import projetoEstudoComunidadePurple.model.AnaliseAltura
import projetoEstudoComunidadePurple.model.ConversorTemperatura

fun main() {

    println("Bem-vindo ao programa de conversão de temperaturas e análise de alturas!")

    // Cria instâncias das classes ConversorTemperatura e AnaliseAltura
    val conversorTemperatura = ConversorTemperatura()
    val analiseAltura = AnaliseAltura()

    // Opções para o usuário
    println("Escolha uma opção:")
    println("1. Converter temperatura")
    println("2. Realizar análise de altura")
    print("Opção: ")

    when (readlnOrNull()?.toIntOrNull()) {
        1 -> converterTemperatura(conversorTemperatura)
        2 -> realizarAnaliseDeAltura(analiseAltura)
        else -> println("Opção inválida! Por favor, escolha uma opção válida.")
    }

    println("\nObrigado por usar o programa!")
}

fun converterTemperatura(conversorTemperatura: ConversorTemperatura) {
    // Recebe entradas do usuário para as temperaturas em Celsius
    print("Digite a temperatura em Celsius para conversão: ")
    val temperaturaCelsius = readlnOrNull()?.toDoubleOrNull()

    if (temperaturaCelsius != null) {
        // Realiza as conversões de temperatura
        val temperaturaKelvin = conversorTemperatura.celsiusToKelvin(temperaturaCelsius)
        val temperaturaFahrenheit = conversorTemperatura.celsiusToFahrenheit(temperaturaCelsius)
        val temperaturaReaumur = conversorTemperatura.celsiusToReaumur(temperaturaCelsius)
        val temperaturaRankine = conversorTemperatura.celsiusToRankine(temperaturaCelsius)

        // Exibe os resultados das conversões
        println("\nResultados das conversões de temperatura:")
        println("Celsius: $temperaturaCelsius")
        println("Kelvin: $temperaturaKelvin")
        println("Fahrenheit: $temperaturaFahrenheit")
        println("Réaumur: $temperaturaReaumur")
        println("Rankine: $temperaturaRankine")
    } else {
        println("Temperatura inválida! Por favor, insira um valor numérico válido.")
    }
}

fun realizarAnaliseDeAltura(analiseAltura: AnaliseAltura) {
    // Realizar análise de altura com a lista prévia de informações
    val numeroMulheres = analiseAltura.contarMulheres()
    val (maximo, minimo) = analiseAltura.calcularAlturaMaxMin()
    val mediaAlturaHomens = analiseAltura.calcularMediaAlturaHomens()

    // Exibir os resultados da análise de altura
    println("\nResultados da análise de altura:")
    println("Número de mulheres: $numeroMulheres")
    println("Maior altura: $maximo")
    println("Menor altura: $minimo")
    println("Média de altura dos homens: $mediaAlturaHomens")
}
