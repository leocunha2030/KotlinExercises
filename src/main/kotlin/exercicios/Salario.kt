package exercicios

class Salario {
}

fun main(args: Array<String>) {
    val IdUser = readLine()!!.toInt()
    val horas = readLine()!!.toInt()
    val salarioPHora = readLine()!!.toFloat()
    val salario = String.format("%.2f", horas * salarioPHora)
    println("NUMBER = ${IdUser}")
    println("SALARY = U$ ${salario}")
}
