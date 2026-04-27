package exercicios.blockone

fun main() {
    class Produto(val valor: Float) {
        fun darDesconto(porcentagemDesconto: Int) = valor - (valor * porcentagemDesconto)/100
    }

    println("Digite o preço do produto: ")
    val produto = Produto(readln().toFloat())

    println("Preço: R$${produto.valor}\n" +
            "Com desconto: R$${produto.darDesconto(5)}")
}