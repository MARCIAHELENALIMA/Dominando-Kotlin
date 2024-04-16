package projetoEstudoComunidadePurple.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import projetoEstudoComunidadePurple.model.ConversorTemperatura

class ConversorTemperaturaTest {

    private val conversor = ConversorTemperatura()

    @Test
    fun testCelsiusToKelvin() {
        assertEquals(273.15, conversor.celsiusToKelvin(0.0), 0.001)
        assertEquals(293.15, conversor.celsiusToKelvin(20.0), 0.001)
    }

    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, conversor.celsiusToFahrenheit(0.0), 0.001)
        assertEquals(68.0, conversor.celsiusToFahrenheit(20.0), 0.001)
    }

    @Test
    fun testCelsiusToReaumur() {
        assertEquals(0.0, conversor.celsiusToReaumur(0.0), 0.001)
        assertEquals(16.0, conversor.celsiusToReaumur(20.0), 0.001)
    }

    @Test
    fun testCelsiusToRankine() {
        assertEquals(491.67, conversor.celsiusToRankine(0.0), 0.001)
        assertEquals(527.67, conversor.celsiusToRankine(20.0), 0.001)
    }
}
