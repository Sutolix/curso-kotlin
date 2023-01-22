open class TheEletronic(var brand: String) {
    private fun corrent(active: Boolean) {}
    fun turnOn() {
        corrent(true)
    }
    open fun turnOff() {
        corrent(false)
    }
}

class TheComputer(brand: String) : TheEletronic(brand) {
    fun save() {}
    //sobreescreve o método turnOff da classe pai para a classe atual
    override fun turnOff() {
        save()
        //super se refere a classe pai, nela o método permanece inauterado
        super.turnOff()
    }

    // Overload permite criar métodos/funções com o mesmo nome contanto que tenham pâramentros de tipos
    // e quantidade diferentes
    fun teste() {}
    fun teste(a: Int) {}
    fun teste(a: Int, b: String) {}
    fun teste(b: String) {}
}

fun main() {
    var computer: TheComputer = TheComputer("Dell")
    computer.turnOn()
    computer.save()
    computer.turnOff()
}
