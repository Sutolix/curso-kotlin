// Com o enum conseguimos fazer listagem de entradas válidas, diminuindo verificações sobre o conteúdo de um parâmetro
// além de fazer tratamento dessas entradas
enum class Priority(val value: Int) {
    Low(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
    },
    Medium(5),
    High(10)
}

fun x(priority: Priority) {
    println(priority)
}

fun main() {
    x(Priority.Low)
    println("----")
    for (p in Priority.values()) {
        println(p.value)
    }
}
