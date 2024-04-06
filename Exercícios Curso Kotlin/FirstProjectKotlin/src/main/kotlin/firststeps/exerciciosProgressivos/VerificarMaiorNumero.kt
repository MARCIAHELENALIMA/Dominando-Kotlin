/*
Primeiro, eu peço que você pense em três números. Esses serão os valores que vamos considerar.
Agora, com os três números em mente, vamos começar a comparação. A ideia é determinar qual desses
números é o maior. Isso é feito através de uma série de comparações.
A comparação é feita da seguinte maneira: pegamos o primeiro número e o comparamos com o segundo.
Se o primeiro número for maior que o segundo, nós o mantemos em mente como o maior número até agora.
Em seguida, pegamos esse maior número e o comparamos com o terceiro número. Se o terceiro número
for maior, então ele se torna o maior número. Se não, o maior número permanece o mesmo.

A lógica matemática aqui é a da comparação. Estamos usando a propriedade dos números que permite
compará-los para determinar qual é maior. Isso é feito através de operações de comparação.
Uma vez que determinamos qual dos três números é o maior através dessa série de comparações,
temos a resposta para o problema.
Finalmente, eu informo qual dos três números é o maior.
 */

package firststeps.exerciciosProgressivos

class VerificarMaiorNumero {

    fun encontrarMaiorNumero (numero1: Int, numero2: Int, numero3: Int): Int {
        var maiorNumero = numero1
        if (numero2 > maiorNumero){
            maiorNumero = numero2
        }
        if (numero3 > maiorNumero){
            maiorNumero = numero3
        }
        return maiorNumero
    }
}

/*
Em Kotlin, a estrutura when é equivalente à estrutura switch. No entanto, neste caso específico,
o uso de when pode não ser a melhor opção, pois estamos comparando três valores diferentes e
queremos encontrar o maior. A estrutura when é mais adequada quando você tem uma variável e
quer executar diferentes ações dependendo do valor dessa variável.
 */
