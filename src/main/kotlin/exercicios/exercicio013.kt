package exercicios

fun main() {
    class Funcionario(val nome: String, salario: Float) {
        var salario = Salario(salario)

        inner class Salario(var valor: Float) {
            fun darAumento(porcentagemAumento: Int) {
                valor += (valor * porcentagemAumento)/100
            }

            override fun toString(): String {
                return valor.toString()
            }
        }
    }

    println("Digite o nome do funcionario: ")
    val nome = readln()
    println("Digite o salário do funcionario: ")
    val funcionario = Funcionario(nome, readln().toFloat())

    funcionario.salario.darAumento(15)
    println("O salário de ${funcionario.nome} com 15% de aumento fica: R$${funcionario.salario}")
}