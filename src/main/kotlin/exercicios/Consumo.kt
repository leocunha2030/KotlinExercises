package exercicios

fun main(args: Array<String>){
    val X = readLine()!!.toInt()
    val Y = readLine()!!.toFloat()

    var media = String.format("%.3f",(X / Y))

    println("${media} km/l")
}