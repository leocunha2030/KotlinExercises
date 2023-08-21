package fundamentos

fun main(){
    var nome : String? = readln() // ou null para testar
    var tamanho: Int = nome?.length ?: 0 // Usando o elvis operator, neste exemplo caso seja nulo a variavel tamanho receberá 0, poderia receber qualquer coisa
    println(tamanho)
}
