package exercicios

import java.lang.Math.toRadians
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

fun main() {
    class Angulo(val value: Float) {
        val radiano = toRadians(value.toDouble())

        fun getSeno(): Double {
            return sin(radiano)
        }

        fun getCosseno(): Double {
            return cos(radiano)
        }

        fun getTangente(): Double {
            return tan(radiano)
        }

        override fun toString(): String {
            return value.toString()
        }
    }

    println("Digite um ângulo em graus: ")
    val angulo = Angulo(readln().toFloat())

    println("Angulo: $angulo º\n" +
            "Seno: ${angulo.getSeno()}\n" +
            "Cosseno: ${angulo.getCosseno()}\n" +
            "Tangente: ${angulo.getTangente()}"
    )
}