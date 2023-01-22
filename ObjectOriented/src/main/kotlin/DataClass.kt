class Form(a: Int, b: Int)
data class DataForm(val a: Int, val b: Int)
// data class retorna os valores dos metódos toString, equals e hashCode de forma mais amigável e útil

// data class costuma ser usado como referência para parâmetros, principalmente quando há muitos parâmetros
// deixando assim a declaração da função mais limpa
data class Address(val street: String, val cep: String, val city: String, val neighborhood: String = "")
fun createAdrees(address: Address) {
    println(address.street)
}

fun main() {

    createAdrees(Address("Fake Street", "6545465", "Gotham"))

    println()
    println("###############")
    println()

    val a1: Form = Form(10,8)
    val a2: Form = Form(10,8)

    val b1: DataForm = DataForm(10,8)
    var b2: DataForm = DataForm(10,8)

    println("### Classe Normal ###")
    println(a1.equals(a2))
    println(a1.toString())
    println(a1.hashCode())
    println("------")
    println(a2.toString())
    println(a2.hashCode())

    println()
    println("###############")
    println()

    println("### Data Class ###")
    println(b1.equals(b2))
    println(b1.toString())
    println(b1.hashCode())
    println("------")
    println(b2.toString())
    println(b2.hashCode())

    // Instâncias data class tem o metódo "copy" para copiar os valores de outra instância data class
    // também é possível passar por parâmetro algum valor em específico que será diferente (a = 50 no exemplo)
    b2 = b1.copy(50)
}
