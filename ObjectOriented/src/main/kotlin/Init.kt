class Animal (var specie: String) {
    var speaks: String = ""

    // pode-se ter vários inits e eles são executados na ordem de escrita
    init {
        println("1")
    }
    init {
        println("2")
    }
    init {
        speaks = if(specie == "cachorro") {
            "au"
        } else if (specie == "gato") {
            "miau"
        } else {
            ""
        }
    }
    fun speak() {
        println(speaks)
    }
}

fun main() {
    Animal("gato").speak()
}
