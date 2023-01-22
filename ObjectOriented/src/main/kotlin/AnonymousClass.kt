interface Event {
    fun onSucess()
}

class Program {
    fun save(e: Event) {
        println("Abrindo conexões.")
        println("Salvando conexões.")
        println("Sucesso. Conexões fechadas.")
        e.onSucess()
    }
}

fun main() {
    val p = Program()

    //Classe anônima
    p.save(object : Event {
        override fun onSucess() {
            println("onSucess")
        }
    })
}

