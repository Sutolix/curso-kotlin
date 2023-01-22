//classes abstratas não podem ser instanciadas e ficam só para herança
//elas devem ser usadas quando temos métodos que todas as classes que
//herdarem ela terão, mas haverá uma lógica diferente para cada um
//como o "speak" na classe abaixo
abstract class Mammal(val name: String) {
    // podem existir métodos pré-definidos
    fun wakeUp() {}
    fun sleep() {}
    abstract fun speak()
}

//‘interface’ funciona igual uma classe abstrata, a diferença
//é que não é possível atribuir valores a variáveis em uma ‘interface’
//enquanto em uma classe abstrata é possível
interface Savage {
    fun atack()
}


interface Inter1
interface Inter2
//você pode implementar multiplas ‘interfaces’ enquanto não é possível fazer
//herança multipla com classes abstratas
class Test: Inter1, Inter2

class Dog(name: String) : Mammal(name), Savage {
    //quando uma classe é herdeira de uma classe abstrata os métodos abstratam precisam
    //ser criados
    override fun speak() {
        TODO("Not yet implemented")
    }

    override fun atack() {
        TODO("Not yet implemented")
    }
}

fun main() {
    var dog: Dog = Dog("Pluto")
    dog.atack()
}
