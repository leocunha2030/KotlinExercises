package fundamentos

fun main() {
    WhileMenorQue10()
    doWhileMenorQue10()
}

fun WhileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10(){ //Do While roda uma vez antes de verificar a condicional
    var x = 10
    do{
        println(x)
        x++
    }while (x < 10)

}