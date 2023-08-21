package exercicios

class Media1 {
}
fun main(args: Array<String>){
    val A = readLine()!!.toFloat()
    val B = readLine()!!.toFloat()
    val pesoA = A * 0.35
    val pesoB = B * 0.75
    val media = (pesoA + pesoB)/1.1
    val format = String.format("%.5f", media)
    println("MEDIA = ${format}")
}