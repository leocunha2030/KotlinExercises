package fundamentos

fun main() {
    var nome = "Leonardo"
    val nomeVal = "Leonardo"

    nome = "mudou"
    //nomeVal = "Não Mudou"

    var idade = 24 // O var está amarelo porque a idade nunca é mudada, apertando alt + enter que
    println(idade) // A ide sugere trocar Para val que é uma variavel Imutável
}

class variaveis{
    //val teste: String // Em uma classe ao definir uma val é necessario a iniciar na mesma hora diferente de uma função

    lateinit var teste: String

    fun iniciaVariaveis(){
        teste = "Teste"
    }
}