package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}
data class Dono(var nome: String, var idade: Int){

}

fun main (){
    var carro = Carro("Branco", 2021, Dono("Leonardo", 21))

    carro.cor
    println(carro.cor)

    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono)
    carro.dono.nome = "Zé"

    println(carro.dono)
}