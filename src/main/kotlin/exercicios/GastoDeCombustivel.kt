package exercicios

fun main(args: Array<String>) {
    val tempo = readLine()!!.toInt()
    val velocidade = readLine()!!.toInt()

    val media = 12

    var distancia = (velocidade * tempo).toDouble()
    var litros = String.format("%.3f",(distancia / media))
    println(litros)
}
