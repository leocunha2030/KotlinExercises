package exercicios
import java.math.BigDecimal

fun main(args: Array<String>) {
    val notas_moedas = listOf(
        BigDecimal("100.0"), BigDecimal("50.0"), BigDecimal("20.0"), BigDecimal("10.0"),
        BigDecimal("5.0"), BigDecimal("2.0"), BigDecimal("1.0"), BigDecimal("0.5"),
        BigDecimal("0.25"), BigDecimal("0.1"), BigDecimal("0.05"), BigDecimal("0.01")
    )

    var valor = BigDecimal(readLine()!!)

    println("NOTAS:")
    for (indice in 0 until 6) {
        val quantidade_notas = (valor / notas_moedas[indice]).toInt()
        println("${quantidade_notas} nota(s) de R$ ${String.format("%.2f", notas_moedas[indice])}")
        valor -= quantidade_notas.toBigDecimal() * notas_moedas[indice]
    }

    println("MOEDAS:")
    for (indice in 6 until notas_moedas.size) {
        val quantidade_moedas = (valor / notas_moedas[indice]).toInt()
        println("${quantidade_moedas} moeda(s) de R$ ${String.format("%.2f", notas_moedas[indice])}")
        valor -= quantidade_moedas.toBigDecimal() * notas_moedas[indice]
    }
}


