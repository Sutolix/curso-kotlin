import kotlin.math.*

fun main() {
    helloWorld()
    val a = 10
    val b = 5
    println("A soma de $a + $b é igual a ${sum(a, b)}")

    val str = "Programação Kotlin"
    println("${str.length}")
    println("${str[0]}")
    println("${str.startsWith("Pro")}")
    println("${str.endsWith("abc")}")
    println(str.substring(2, 4))
    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())
    println("    teste de string     ".trim())

    println(max(5, 10))
    println(min(5, 10))
    println(sqrt(45.67f))
    println(PI)
    println(E)
    println(round(35455.8798798465))
}

// Função padrão
fun sum(a: Int, b: Int): Int {
    return (a + b)
}

// Função em uma única linha
fun sum2(a: Int, b: Int) = (a + b)

fun helloWorld() {
    println("Hello World")
}

