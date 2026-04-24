package exercicios

fun main() {
    class Carteira(var valor: Float) {
        val cVALORDOLAR = 5.25f

        fun adicionarDinheiro(valor: Float) {
            this.valor += valor
        }

        fun retirarDinheiro(valor: Float) {
            if (this.valor - valor < 0) {
                println("Operação negada. O valor da carteira não pode ser negativo.")
                return
            }
            this.valor -= valor
        }

        fun toDolar(): Float {
            return this.valor.div(cVALORDOLAR)
        }
    }

    println("Digite quanto tem na carteira: ")
    val carteira = Carteira(readln().toFloat())

    println("Saldo da Carteira:\n" +
            "Reais: R$${carteira.valor}\n" +
            "Dolares: U$${carteira.toDolar()}")
}