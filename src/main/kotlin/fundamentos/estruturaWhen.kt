package fundamentos

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(){
//    // O When Permite comparar uma expressão com várias opções e executar o bloco de código correspondente
//    val x = 13
//    when(x){
//        5,6,7 -> println("x == 5") //Se x for qualquer um ele entra nessa condicional
//        8 -> println("x == 8")
//        9 -> println("x == 9")
//        10 -> {
//            println("x == 10")
//            println("X é uma dezena")
//        }
//        in 11..15 -> println("X está entre 11 e 15")
//        !in 16..20 -> println("Não está entre 16 a 20") //Negação
//        else -> println("Numero não mapeado")
//    }




    when {
        comecaComOi(5) -> println("5")
        comecaComOi("oi, tudo bem?") -> println("Oi, tudo bem?")// verificou verdadeiro, para de verificar os proximos
        comecaComOi("oi, to loco") -> println("ta loco")
    }
}

fun comecaComOi(oi: Any): Boolean{
    return when(oi){
        is String -> oi.startsWith("oi")
        else -> false
    }
}