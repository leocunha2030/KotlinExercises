package fundamentos

fun main() {
    printa1a10()
    printa10a1()
    printaDe2Em2()
    printaRange(10, 20)
}

fun printa1a10() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun printa10a1() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaDe2Em2() {
    for (numero in 1..10 step 2) {
        println(numero)
    }
}
fun printaRange(inicio: Int, fim: Int){
    for (numero in inicio..fim)
        println(numero)
}