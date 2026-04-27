package exercicios.blocktwo

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    println("Digite o nome completo de uma pessoa: ")
    val nome = readln()

    println("Nome original: $nome\n" +
            "Uppercase: ${nome.uppercase(getDefault())}\n" +
            "Lowercase: ${nome.lowercase(getDefault())}\n" +
            "Quantas letras(sem espaço): ${nome.replace(" ", "").length}\n" +
            "Quantas letras tem o primeiro nome: ${nome.split(" ")[0].length}"
    )
}