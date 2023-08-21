package fundamentos

fun main(){
    dizOi("Leonardo",21) //Define as variáveis de acordo com o escrito

    dizOi(retornaNome(),21) //Define a variável nome de acordo com a função retornaNome()

    dizOi(idade = 21, nome = "Leonardo") //Definindo as variáveis fora da ordem

    dizOi("Carlão") //A variável idade já está definida, no caso se não for setado nenhuma ela será a da função diz oi
}

fun retornaNome(): String{
    return "Leonardo"
}

fun dizOi(nome: String, idade: Int = 45){
    println("Oi ${nome}, parabéns pelos seus ${idade} anos!")
}