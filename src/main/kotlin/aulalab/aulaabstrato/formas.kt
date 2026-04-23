package aulalab.aulaabstrato

import kotlin.math.PI


abstract class Forma(
    var x: Int,
    var y: Int
): Comparable<Forma> {

    public fun mover(dx: Int, dy: Int) {
        this.x += dx
        this.y += dy
    }

    abstract fun calcularArea(): Double

    override fun compareTo(other: Forma): Int {
        return (calcularArea() - other.calcularArea()).toInt()
    }
}

open class Quadrado(
    x: Int,
    y: Int,
    var lado: Int
) : Forma(x, y) {
    override fun calcularArea(): Double {
        return (lado * lado).toDouble()
    }
}

class Circulo(
    x: Int,
    y: Int,
    var raio: Int
) : Forma(x, y) {
    override fun calcularArea(): Double {
        return PI * raio.times(raio)
    }
}

