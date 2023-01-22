fun bonusCalculator(role: String, experience: Int): Float {
    var bonus = 0f

    if (role === "Gerente") {
        bonus = if (experience >= 2) 3000f else 2000f
    } else if (role === "Coordenador") {
        bonus = if (experience < 1) 1500f else 1800f
    } else if (role === "Engenheiro de Software") {
        bonus = 1000f
    } else if (role === "Estagiário") {
        bonus = 500f
    }

    return bonus
}

fun main() {
    val bonus = (bonusCalculator("Gerente", 1))

    println("R$$bonus")
}

// false
// true
// false
// true