package exercicios

fun main(args: Array<String>){
    val Variaveis = readLine()!!.split(" ").map { it.toDouble() }

    val A = Variaveis[0]
    val B = Variaveis[1]
    val C = Variaveis[2]

    //Triangulo
    val triangulo = String.format("%.3f",(A * C)/2)
    println("TRIANGULO: ${triangulo}")

    //Circulo
    val pi = 3.14159
    val Circulo = String.format("%.3f",pi * C * C)
    println("CIRCULO: ${Circulo}")

    //Trapézio
    val trapezio = String.format("%.3f",((A + B) * C)/2)
    println("TRAPEZIO: ${trapezio}")

    //Quadrado
    val quadrado = String.format("%.3f",B * B)
    println("QUADRADO: ${quadrado}")

    //Retângulo
    val retangulo = String.format("%.3f", A * B)
    println("RETANGULO: ${retangulo}")
}