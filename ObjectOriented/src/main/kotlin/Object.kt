class Matematica {
    companion object {
        const val PI = 3.1415

        fun teste() {
            println("Teste")
        }
    }

    object Obj1 {
        // é inicializado apenas 1 vez, independente de quantas vezes a classe for inicializada
        init {
            println("Inicialização")
        }

        const val r = 4.899879
        fun teste() {
            println("Teste obj1")
        }
    }

    object Obj2 {
        const val p = 4.899879
        fun teste() {
            println("Teste obj2")
        }
    }
}

fun main() {
    Matematica.Obj1
    Matematica.Obj1
    Matematica.Obj1
//    println(Matematica.PI)
//    println(Matematica.Obj1.r)
//    println(Matematica.Obj2.p)
//    Matematica.teste()
//    Matematica.Obj1.teste()
//    Matematica.Obj2.teste()
}
