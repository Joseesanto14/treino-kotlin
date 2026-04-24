package exercicios

fun main() {
    println("Insira um número inteiro: ")
    val n = readln().toInt()

    println("Número: $n\n" +
            "Antecessor: ${n.antecessor()}\n" +
            "Sucessor: ${n.sucessor()}")
}

fun Int.sucessor(): Int {
    return this + 1
}

fun Int.antecessor(): Int {
    return this - 1
}