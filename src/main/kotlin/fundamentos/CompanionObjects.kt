package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object{
        fun criarComValoresPadrao(): MinhaClasse{
            return MinhaClasse("Leo", "rua", 21)
        }
    }
}
class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criarComValoresPadrao(): SegundaClasse{
        return SegundaClasse("Leo", "rua", 21)
    }
}
fun main(){
    var segundaClasse = SegundaClasse("nome", "endereco", 21).criarComValoresPadrao()

    var minhaClasse = MinhaClasse.criarComValoresPadrao()
}