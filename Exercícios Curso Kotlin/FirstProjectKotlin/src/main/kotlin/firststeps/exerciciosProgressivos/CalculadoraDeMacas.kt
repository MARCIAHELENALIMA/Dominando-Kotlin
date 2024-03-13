package firststeps.exerciciosProgressivos

class CalculadoraDeMacas(private val quantidade: Int) {
    private val precoNormal = 1.30
    private val precoDesconto = 1.00
    private var resultado: Double = 0.0

    init {
        if (quantidade >= 12) {
            resultado = precoDesconto * quantidade
        } else {
            resultado = precoNormal * quantidade
        }
    }

    fun getResultado(): Double {
        return resultado
    }
}
