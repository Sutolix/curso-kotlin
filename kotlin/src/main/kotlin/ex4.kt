fun isSquare() {
    print("Por favor informe o lado 1: ")
    val s1 = readlnOrNull()
    if(s1 == null || s1 == "") {
        println("Número inválido")
        return
    }

    print("Por favor informe o lado 2: ")
    val s2 = readlnOrNull()
    if(s2 == null || s2 == "") {
        println("Número inválido")
        return
    }

    if(s1.toInt() == s2.toInt()) {
        println("É um quadrado!")
    } else {
        println("Não é um quadrado.")
    }
}

fun isEquilateralTriangle(s1: Int, s2: Int, s3: Int): String {
    return if(s1 == s2 && s1 == s3) {
        "O triangulo é equilátero!"
    } else {
        "O triangulo não é equilátero."
    }
}

fun main() {
    isSquare()
    println(isEquilateralTriangle(4,2,4,))
}
