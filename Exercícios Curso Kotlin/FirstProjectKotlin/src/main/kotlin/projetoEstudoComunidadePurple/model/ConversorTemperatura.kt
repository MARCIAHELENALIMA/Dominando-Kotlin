package projetoEstudoComunidadePurple.model

class ConversorTemperatura {

    // Método para converter Celsius para Kelvin
    fun celsiusToKelvin(celsius: Double): Double {
        return celsius + 273.15 // Aplica a fórmula K = C + 273.15
    }

    // Método para converter Celsius para Fahrenheit
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32 // Aplica a fórmula F = C * 1.8 + 32
    }

    // Método para converter Celsius para Réaumur
    fun celsiusToReaumur(celsius: Double): Double {
        return celsius * 0.8 // Aplica a fórmula Re = C * 0.8
    }

    // Método para converter Celsius para Rankine
    fun celsiusToRankine(celsius: Double): Double {
        return celsius * 1.8 + 32 + 459.67 // Aplica a fórmula Ra = C * 1.8 + 32 + 459.67
    }
}
