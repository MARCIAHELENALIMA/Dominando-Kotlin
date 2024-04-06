package firststeps.exerciciosProgressivos

import java.time.LocalDate

class CalculadoraDeIdade {
    companion object {
        fun calculaIdade(anoNascimento: Int): Int {
            val anoAtual = LocalDate.now().year
            return anoAtual - anoNascimento
        }
    }
}