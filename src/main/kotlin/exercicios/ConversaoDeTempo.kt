package exercicios

fun main(args: Array<String>) {
    var N = readLine()!!.toInt()

    var horas = N / 3600
    var minutos = (N % 3600)/60
    var segundo = N % 60

    println("${horas}:${minutos}:${segundo}")
}