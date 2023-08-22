package exercicios

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val Variaveis1 = readLine()!!.split(" ").map { it.toDouble() }

    val x1 = Variaveis1[0]
    val y1 = Variaveis1[1]

    val Variaveis2 = readLine()!!.split(" ").map { it.toDouble() }

    val x2 = Variaveis2[0]
    val y2 = Variaveis2[1]

    var distancia = String.format("%.4f",sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))))

    println(distancia)
}