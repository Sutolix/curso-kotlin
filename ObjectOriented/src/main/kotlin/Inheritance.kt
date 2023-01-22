// private > Apenas a classe tem acesso ao método/atributo
// protect > Apenas a classe e seus herdeiros possuem acesso ao método/atributo

// Deixa a classe privada, de modo a não poder ser heradada e estar visivél apenas em seu arquivo
private class X

open class Eletronic(var brand: String, private var key: String = "") {
    private fun activeCorrent() {}
    fun turnOn() {
        activeCorrent()
        println("Ligar")
    }
    fun turnOff() {
        println("Desligar")
    }
}

class Computer(brand: String) : Eletronic(brand) {
    fun installSoftware() {
        println("Programa Instalado")
    }
}

fun main() {
    var computer: Computer = Computer("Dell")
    computer.turnOn()
    computer.installSoftware()
    computer.turnOff()
}
