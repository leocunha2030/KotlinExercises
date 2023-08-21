package fundamentos

class NullSafety_2 {
}
fun arrayNull(){
    var lista : List<Int?> = listOf(1,2,null,3) // O ? dentro do <Int?> permite a lista contenha elementos nulos
    var listaNullable : List<Int>? = null // Já o ? fora do <Int>? permite que a lista seja nula
    var listaNullable2 : List<Int?>? = null // E o ? dentro e fora do <Int?>? permite que a lista seja nula ou que contenha elementos nulos
}