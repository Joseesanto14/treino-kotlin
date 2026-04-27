package exercicios.blockone

import kotlin.math.ceil

fun main() {
    class Parede(val largura: Float, val altura: Float) {
        val AREA_Q_TINTA_PINTA = 2

        fun area() = largura * altura

        fun litrosTintaNecessariosParaPintar() = ceil(area().div(AREA_Q_TINTA_PINTA)).toInt()

    }

    println("Digite a largura e altura de uma parede em metros: ")
    val l = readln().toFloat()
    val h = readln().toFloat()

    println("Litros de tinta necessários para pintar a parede: " +
            "${Parede(l, h).litrosTintaNecessariosParaPintar()} litro(s)")
}
