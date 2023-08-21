package fundamentos

fun main(){
    filtraLista()
    filtraPrimeiroPar()
    chamadasDeLista()
    listaMutavel()
    ordenaLista()
    embaralhaLista()
    setOf()
    map()
}

//listOf é imutável
//Para criar uma lista mutavel é só usar mutableListOf

fun filtraLista(){
    var lista = listOf(1,2,3,4,5,6)
    val filtraPares = lista.filter { it % 2 == 0 }
    //.filter itera sobre uma lista, verifica se a condição passada é verdadeira, se verdadeira mantem o
    //item na lista senão remove, ou seja neste caso esta collection está filtrando os numeros pares
    println(filtraPares)
}

fun filtraPrimeiroPar(){
    var lista = listOf(1,2,3,4,5,6)
    val filtraPares = lista.filter { it % 2 == 0 }.first()
    //.filter itera sobre uma lista, verifica se a condição passada é verdadeira, se verdadeira mantem o
    //item na lista senão remove, ou seja neste caso ela está pegando o primeiro numero par da lista
    println(filtraPares)
}

fun chamadasDeLista(){
     var lista = listOf(1,2,3,4,5,6,7,8,9,10)
    println(lista[0]) // Imprime o indice 0
    println(lista.size) //Imprime o tamanho da lista
    println(lista.indexOf(6)) // Imprime o valor no indice selecionado
}

fun listaMutavel(){
    var lista = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    lista.add(11)
    println("Lista modificada, numero: ${lista.last()} adicionado")
    println(lista)

    lista.removeAt(0)
    println("Foi removido um item da lista pelo index: ${lista}")

    lista.remove(10)
    println("Foi removido um item pelo elemento: ${lista}")

    lista[2] = 55
    println("Editou o indice 2 para adicionar o numero ${lista[2]}")
    println(lista)
}

fun ordenaLista(){
    var lista = mutableListOf(5,6,2,9,12,1)
    println("Lista fora de ordem: ${lista}")//Da para lista Strings em ordem alfabética também
    lista.sort()
    println("A lista foi colocada em ordem: ${lista}")
}

fun embaralhaLista(){
    var lista = mutableListOf(1,2,3,4,5,6,7,8)
    lista.shuffle()
    println("Lista foi embaralhada: ${lista}")
}

fun setOf(){
    var setNumeros = setOf(1,1,2,2,3,3) //SetOf é semelhante a uma lista mas não recebe valores duplicados
    var lista = listOf(1,1,2,2,3,3)
    println("setOf: $setNumeros")
    println("Lista: ${lista}")
    println("Verifica se a lista contem o numero: ${setNumeros.contains(2)}")
}
fun map(){
    var mapNomeIdade = mutableMapOf("Leo" to 21, "Duda" to 20)
    println(mapNomeIdade)

    mapNomeIdade.put("Ze", 21) //No map tem que usar put ao invés de add
    mapNomeIdade["Joao"] = 30
    println(mapNomeIdade)

    mapNomeIdade.remove("Ze") // Remove sempre pela chave
    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Joao", 34) //Só será adicionado se não existir préviamente
    println(mapNomeIdade)


}