package fundamentos

fun main() {
//    parOuImpar(10)
//    parOuImpar(5)
    println(resultadoDaNota(10))
    println(resultadoDaNota(3))
    println(resultadoDaNota(1))
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}

// Se a nota >= 7 -> Passou
// Se a nota >= 3 -> Exame
// Se a nota < 3 -> Reprovou
fun resultadoDaNota(nota: Int): String {
    return if (nota >= 7 && nota <= 10) { //return if retorna o valor que está dentro do If
        "Passou"
    } else if (nota >= 3 && nota < 7) {
        "Exame"
    } else if (nota < 3 && nota >= 0) {
        "Reprovou"
    } else {
        "Nota incorreta"
    }
}