package exercicios.blockone

fun main() {
    val alunos = Array(4) { "" }

    for (i in 0..3) {
        println("Digite o nome do aluno ${i+1}: ")
        alunos[i] = readln()
    }

    alunos.sortBy { it.random() }

    println("Ordem de apresentação: ${alunos.contentToString()}")
}