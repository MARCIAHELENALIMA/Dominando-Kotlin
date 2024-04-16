package projetoEstudoComunidadePurple.test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import projetoEstudoComunidadePurple.model.AnaliseAltura

class AnaliseAlturaTest {

    @Test
    fun testContarMulheres() {
        val analiseAltura = AnaliseAltura()
        val numeroMulheres = analiseAltura.contarMulheres()
        assertEquals(5, numeroMulheres)
    }

    @Test
    fun testCalcularAlturaMaxMin() {
        val analiseAltura = AnaliseAltura()
        val (maximo, minimo) = analiseAltura.calcularAlturaMaxMin()
        assertEquals(1.85, maximo, 0.01)
        assertEquals(1.55, minimo, 0.01)
    }

    @Test
    fun testCalcularMediaAlturaHomens() {
        val analiseAltura = AnaliseAltura()
        val mediaAlturaHomens = analiseAltura.calcularMediaAlturaHomens()
        assertEquals(1.7625, mediaAlturaHomens, 0.01)
    }
}