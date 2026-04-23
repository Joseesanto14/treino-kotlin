package exercicios

fun main() {
    println("Digite algo: ")
    val algo = readln()

    println("Informações sobre $algo:\n" +
            "tamanho:${algo.length}\n" +
            "Vazio: ${algo.isEmpty()}\n" +
            "Em branco: ${algo.isBlank()}")
}