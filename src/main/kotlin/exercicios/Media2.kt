package exercicios

class Media2 {
}
fun main(args: Array<String>){
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val C = readLine()!!.toDouble()
    val pesoA = A * 2
    val pesoB = B * 3
    val pesoC = C * 5
    val media = (pesoA + pesoB + pesoC)/10
    val format = String.format("%.1f", media)
    println("MEDIA = ${format}")
}