package exercicios.blocktwo

// Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com o nome "SANTO".

fun main() {
    println("Digite o nome de uma cidade: ")
    val cidade = readln().split(" ").filter { it.isNotBlank() }
    val cidadeOutput = buildString {
        for (char in cidade) {
            append(char)
            if (cidade.last() != char) {
                append(" ")
            }
        }
    }

    if (cidade[0].contains("Santo", true)) {
        println("A cidade $cidadeOutput começa com Santo")
    } else {
        println("A cidade $cidadeOutput não começa com Santo")
    }
}