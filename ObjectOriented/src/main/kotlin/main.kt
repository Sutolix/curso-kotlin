class People (val yearOfBirth: Int, var name: String) {
    var doc: String? = null

    // com isso, o parâmetro doc passa a ser opcional e temos 2 formas de instanciar a classe,
    // além disso, agora podemos usar alguma lógica de tratamento com o doc
    constructor(yearOfBirth: Int, name: String, doc: String) : this(yearOfBirth, name) {
        this.doc = doc
    }

    fun sleep() {

    }

    fun wakeUp() {

    }
}

fun main() {
    val people: People = People(1999, "Márcio", "234234234")
    println(people.yearOfBirth)
    println(people.name)
    println(people.doc)

    people.sleep()
    people.wakeUp()
}
