package exercicios

// km = 0,15 ; dia = 60,00 ; total = ?

fun main() {
    class Carro(val kmsRodados: Float, val diasAlugados: Int) {

        fun calcularValorPorKm(valorPorKm: Float): Float {
            return valorPorKm * kmsRodados
        }

        fun calcularValorPorDiaAlugado(valorPorDiaAlugado: Float): Float {
            return valorPorDiaAlugado * diasAlugados
        }

        fun calcularValorTotal(valorPorKm: Float, valorPorDiaAlugado: Float): Float {
            return calcularValorPorKm(valorPorKm) + calcularValorPorDiaAlugado(valorPorDiaAlugado)
        }
    }
    val vALORKM = 0.15f
    val vALORDIA = 60.00f

    println("Digite a quantidade de quilômetros rodados com o carro alugado: ")
    val kmRodados = readln().toFloat()

    println("Digite o número de dias que o carro foi alugado")
    val diasAlugados = readln().toInt()

    val carro = Carro(kmRodados, diasAlugados)

    println("Dados do aluguel:\n" +
            "Carro alugado por ${carro.diasAlugados} dias. Valor: R$${carro.calcularValorPorDiaAlugado(vALORDIA)}\n" +
            "Carro rodou ${carro.kmsRodados} Kms. Valor: R$${carro.calcularValorPorKm(vALORKM)}\n" +
            "Valor Total a Pagar: R$${carro.calcularValorTotal(vALORKM,vALORDIA)}")
}