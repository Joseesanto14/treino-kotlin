package exercicios

fun main() {
    class Meter(val value: Double) {
        fun toKilometer(): Double {
            return value.div(1000)
        }

        fun toHectometer(): Double {
            return value.div(100)
        }

        fun toDecameter(): Double {
            return value.div(10)
        }

        fun toDecimeter(): Double {
            return value.times(10)
        }

        fun toCentimeter(): Double {
            return value.times(100)
        }

        fun toMillimeter(): Double {
            return value.times(1000)
        }

        override fun toString(): String {
            return value.toString()
        }
    }

    println("Digite um valor em metros: ")
    val metro = Meter(readln().toDouble())

    println("Metro: $metro\n" +
            "Quilômetro: ${metro.toKilometer()}\n" +
            "Hectômetro: ${metro.toHectometer()}\n" +
            "Decâmetro: ${metro.toDecameter()}\n" +
            "Decímetro: ${metro.toDecimeter()}\n" +
            "Centímetro: ${metro.toCentimeter()}\n" +
            "Milimetro: ${metro.toMillimeter()}\n")
}