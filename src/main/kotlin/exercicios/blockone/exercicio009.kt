package exercicios.blockone

fun main() {
    println("Digite um número inteiro: ")
    val n = readln().toInt()

    for (i in 1..10) {
        println("n X $i = ${n.times(i)}")
    }
}