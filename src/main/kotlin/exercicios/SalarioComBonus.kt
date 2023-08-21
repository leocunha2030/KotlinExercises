package exercicios


fun main(args: Array<String>) {
    val nome = readLine()
    val salario = readLine()!!.toDouble()
    val venda = readLine()!!.toDouble()
    val comicao = venda * 0.15
    val total = String.format("%.2f", comicao + salario)
    println("TOTAL = R$ ${total}")
}