package exercicios

fun main(args: Array<String>){
    val raio = readLine()!!.toFloat()
    val pi = 3.14159
    val volume = String.format("%.3f",(4.0/3.0) * pi * raio * raio * raio)

    println("VOLUME = ${volume}")
}