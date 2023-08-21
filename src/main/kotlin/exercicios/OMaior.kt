package exercicios

fun main(args: Array<String>) {

    val variaveis = readLine()!!.split(" ").map { it.toInt() }
    val A = variaveis[0]
    val B = variaveis[1]
    val C = variaveis[2]

    val maiorAB = (A + B + Math.abs(A - B)) / 2
    val maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2

    println("$maiorABC é o maior")

    //  Utilizando a funçãio maxOrNull é muito mais prático
    //    val maior = variaveis.maxOrNull()
    //
    //    println("${maior} é o maior")
}