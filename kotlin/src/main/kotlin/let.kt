fun main() {
    val str: String? = "null"

    if(str != null) {
        println(str.length)
    }

    // Mesma coisa que o if a cima
    str?.let {
        // str passa a ser referenciado como it
        println(it.length)
    }
}
