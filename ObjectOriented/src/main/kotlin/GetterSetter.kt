class GetterSetter {
    var name: String = ""
        // Getter e Setter só são necessários quando haverá uma lógica de tratamento para pegar ou definir o valor
        // de um atributo, do contrário não precisa. Use "field" para se referenciar ao valor do atributo
        get() {
            println("Acesso Get")
            return field
        }
        set(value) {
            println("Acesso Set")
            field = value
        }
}

fun main() {
    val instance = GetterSetter()
    instance.name = "teste"
}
