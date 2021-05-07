package main.kotlin.testes

import main.kotlin.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.description}")

    }
    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.description}")
}