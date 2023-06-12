package br.com.gabriel.alugames.main

import br.com.gabriel.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Gabriel", "Gabri@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Gabriel",
        "Gabri@email.com",
        "01/01/2001",
        "GabrielAlmeida")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "11/01/2000"
        it.usuario = "Gabriel123"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "Gabriel123"
    println(gamer1)
}