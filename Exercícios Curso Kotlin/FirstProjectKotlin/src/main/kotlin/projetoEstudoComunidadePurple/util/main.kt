package projetoEstudoComunidadePurple.util

import projetoEstudoComunidadePurple.model.ConversorTemperatura

fun main() {

    println("Bem-vindo ao programa de conversão de temperaturas!")

    // Cria instâncias das classes ConversorTemperatura e AnaliseAltura
    val conversorTemperatura = ConversorTemperatura()

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

    println("\nObrigado por usar o programa!")
}
