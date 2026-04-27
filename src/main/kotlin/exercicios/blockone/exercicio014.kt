package exercicios.blockone

// Celsius para Fahrenheit

fun main() {
    println("Digite uma temperatura em graus Celsius: ")
    val tempC = readln().toFloat()

    println("Temperatura em Celsius: $tempC ºC\n" +
            "Temperatura em Fahrenheit: ${tempC * (9f.div(5f)) + 32f} ºF")
}