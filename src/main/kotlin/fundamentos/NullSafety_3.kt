package fundamentos

fun main(){
    //Cuidado ao usar as !! poderá acontecer uma nullPointerException
    val pessoa: Pessoa? = null
    println(pessoa!!.nome)
}