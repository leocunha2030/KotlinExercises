package exercicios

fun main(args: Array<String>) {
    //.map é utilizado para converter os valores de entrada, que são originalmente strings, em valores numéricos
    // split(" "), essa string é dividida em um array de strings, onde cada elemento do array representa um dos valores
    // it.toDouble() converte essa string em um valor numérico (double).
    val valoresPeca1 = readLine()!!.split(" ").map { it.toDouble() }

    val codigoPeca1 = valoresPeca1[0].toInt()
    val quantidadePeca1 = valoresPeca1[1].toInt()
    val valorUnitarioPeca1 = valoresPeca1[2]

    val valoresPeca2 = readLine()!!.split(" ").map { it.toDouble() }

    val codigoPeca2 = valoresPeca2[0].toInt()
    val quantidadePeca2 = valoresPeca2[1].toInt()
    val valorUnitarioPeca2 = valoresPeca2[2]


    val valorFinal1 = String.format("%.2f", quantidadePeca1 * valorUnitarioPeca1 + quantidadePeca2 * valorUnitarioPeca2)


    println("VALOR A PAGAR: R$ ${valorFinal1}")
}