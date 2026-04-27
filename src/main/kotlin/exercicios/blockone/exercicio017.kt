package exercicios.blockone

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    class TrianguloRetangulo(val catOposto: Float, val catAdjascente: Float) {
        fun calcularHipotenusa(): Float {
            return sqrt(catOposto.pow(2) + catAdjascente.pow(2))
        }
    }

    println("Digite o cateto oposto do triângulo: ")
    val catop = readln().toFloat()

    println("Digite o cateto adjascente: ")
    val catadj = readln().toFloat()

    val triangulo = TrianguloRetangulo(catop, catadj)

    println("A Hipotenusa vale: ${triangulo.calcularHipotenusa()}")
}