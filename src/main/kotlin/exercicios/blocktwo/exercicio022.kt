package exercicios.blocktwo

fun main() {
    var n = 0
    while (true) {
        println("Digite um número de 0 até 9999: ")


        try {
            val num = readln().toInt()

            if (num !in 0..9999) {
                throw NumberFormatException()
            }

            n = num

            break
        } catch (e: NumberFormatException) {
            println("Digite um número válido de 0 à 9999!!")
        }
    }


    val unidade = n % 10
    n /= 10
    val  dezena = n % 10
    n /= 10
    val centena = n % 10
    n /= 10
    val unMilhar = n % 10

    println(
        """
        Unidade: $unidade
        Dezena: $dezena
        Centena: $centena
        Unidade de Milhar: $unMilhar
        """
    )

}