import java.lang.Exception

fun tryCatch(s: String?) {

    try {
        val a = 10 / 0
        println(s!!.length) // usar quando se tem certeza que a variável não vai ser nula, assim o Kotlin não trata e assumimos caso haja uma exception
    } catch (e: NullPointerException) {
        println("Variável nula!")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!")
    } catch (e: Exception) {
        println("Exception generica") // pega qualquer exception
    } finally {
        println("Finally!") // sempre executa, independente do que acontecer. Exemplo de uso: Fechar uma conexão com um banco de dados
    }

}

fun main() {
    val s: String? = null
    println(s?.length)

    tryCatch(s)

    val abc = readlnOrNull()
    println(abc?.length)
}
