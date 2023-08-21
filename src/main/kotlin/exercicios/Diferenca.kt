package exercicios

class Diferenca {
}
fun main(args: Array<String>){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val media = ((a*b)-(c*d))
    println("DIFERENCA = ${media}")
}