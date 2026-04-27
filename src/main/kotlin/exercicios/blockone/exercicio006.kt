package exercicios.blockone

import kotlin.math.sqrt

fun main() {
    println("Digite um número: ")
    val n = readln().toDouble()

    println("Número: $n\n" +
            "Dobro: ${n.times(2)}\n" +
            "Triplo: ${n.times(3)}\n" +
            "Raiz Quadrada: ${sqrt(n)}")
}