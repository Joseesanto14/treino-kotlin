package exercicios

import kotlin.random.Random

fun main() {
    val alunos = Array(5) { "" }

    for (i in 0..4) {
        println("Digite o nome do ${i+1} º aluno: ")
        alunos[i] = readln()
    }

    println("Aluno sorteado foi: ${alunos.random()}")
}