package firststeps.exercicio1

class VerificarNumero {
    fun verificarPositivoOuNegativo(numero: Int) {
        if (numero >= 0) {
            println("O número $numero é positivo")
        } else {
            println("O número $numero é negativo")
        }
    }
}