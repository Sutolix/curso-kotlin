fun ofAge(age: Int): Boolean {
    return age > 18
}

fun bonusWhen(role: String): Float {

//    var bonus = 0f
//    when (role) {
//        "Gerente" -> bonus = 2000f
//        "Coordenador" -> bonus = 1500f
//        "Engenheiro de Software" -> bonus = 1000f
//        "Estagiário" -> bonus = 500f
//        else -> bonus = 0f
//    }
//    return bonus

    val bonus = when (role) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }

    return bonus
}

fun salutation(isDay: Boolean) = if (isDay) "Bom dia" else "Boa noite"

fun main() {

    if (ofAge(15)) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    println(salutation(false))

//    val n = 10
//    if(n in 1..100) {
//        println(n)
//    }

    val n = 10
    when(n) {
        in 10..100 -> println("1..10")
    }


    for(i in 0..20 step 2) {
        print("$i ")
    }

    println()

    for(j in 20 downTo 0) {
        print("$j ")
    }

    println()

    val s = "Kotlin"
    var i = 0
    while(i < s.length) {
        print("${s[i]}")
        i++
    }

    println()

    do {
        print("Qual o seu nome? ")
        val name = readlnOrNull()
    } while (name == "")
}
