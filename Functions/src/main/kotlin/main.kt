fun main() {
    val average = average(10f, 8.2f, 9f, 10f, 8.7f)
    println(average)
    println()

    generic(10, "sfs", true, 5.4f)
}

// vararg permite aceitar várias variáveis e sempre deve ser o último parâmetro
fun average(vararg grades: Float): Float {
    var sum = 0f
    for(n in grades) {
        sum += n
    }
    return sum / grades.size
}

// Tipos genéricos aceitam qualquer tipo de variável. O uso de T é apenas uma boa prática, poderia ser qualquer letra.
fun <T, J> generic(abc:J, vararg vars: T) {
    println("abc: $abc")
    for(n in vars) {
        if(n is String) {
            println(n)
        }
    }
}

// O tipo de retorno Nothing serve para lançar uma exceção. Normalmente é usado para deixar usáveis
// métodos que ainda não tiveram seu corpo implementado.
fun save():Nothing {
    TODO("Ainda não pude fazer.")
}
