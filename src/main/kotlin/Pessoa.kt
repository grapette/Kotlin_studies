package main.kotlin

class Pessoa {
    var nome: String = "Igor"
    var cpf: String = "000.123.456-78"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}
fun main() {
    val Igor =Pessoa()
    println(Igor.pessoaInfo())
}