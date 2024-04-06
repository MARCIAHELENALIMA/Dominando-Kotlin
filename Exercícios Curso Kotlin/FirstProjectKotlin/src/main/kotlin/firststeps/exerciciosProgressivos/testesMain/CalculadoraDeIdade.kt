/*
No método main, a resposta do usuário é lida com readLine após a pergunta sobre o ano de nascimento e
armazenada na variável anoNascimentoLido. A variável idade recebe o resultado da função calculaIdade,
que utiliza anoNascimentoLido como argumento. A mensagem final exibe a idade calculada.

A função calculaIdade aceita um parâmetro anoNascimento do tipo Int e retorna um Int. Ela calcula a idade
subtraindo o ano de nascimento do ano atual, obtido através do método estático LocalDate.now().year.
*/
package firststeps.exerciciosProgressivos.testesMain

import java.time.LocalDate

fun main() {
    print("Qual seu ano de nascimento meu querido? ")
    val anoNascimentoLido = readln().toInt()
    val idade = calculaIdadePessoa(anoNascimentoLido) // argumento é o valor que passa para o parametro anoNascimento da função
    println("Você tem $idade seu coroa")
}

fun calculaIdadePessoa(anoNascimento: Int) = LocalDate.now().year - anoNascimento

/*
OPÇÕES DE USO DA FUNÇÃO CALCULAIDADE

fun calculaIdade(anoNascimento: Int): Int {
    val anoAtual = LocalDate.now().year
    val idade = anoAtual - anoNascimento
    return idade
}
fun calculaIdade(anoNascimento: Int): Int {
    val anoAtual = LocalDate.now().year
    return anoAtual - anoNascimento
}
*/