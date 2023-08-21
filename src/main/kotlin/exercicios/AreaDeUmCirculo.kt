package exercicios

class RaioDeUmCirculo {
}
fun main(args: Array<String>){
    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val diametro = pi * raio * raio
    val diamFormat = String.format("%.4f", diametro)
    println("A=${diamFormat}")
}