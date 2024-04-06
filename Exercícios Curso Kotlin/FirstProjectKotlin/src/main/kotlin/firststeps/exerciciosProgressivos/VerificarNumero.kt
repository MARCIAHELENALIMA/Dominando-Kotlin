package firststeps.exerciciosProgressivos

class VerificarNumero {
    fun verificarPositivoOuNegativo(numero: Int) {
        if (numero >= 0) {
            println("O número $numero é positivo")
        } else {
            println("O número $numero é negativo")
        }
    }
}