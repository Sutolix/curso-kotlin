interface Employee {
    var wage: Float
    fun bonus(): Float
}

class Manager(override var wage: Float) : Employee {
    override fun bonus(): Float {
        return wage * 0.5f
    }
}

class Analyst(override var wage: Float) : Employee {
    override fun bonus(): Float {
        return wage * 0.3f
    }
}

fun showBonus(employee: Employee) {
    println(employee.bonus())
}

fun main() {
    showBonus(Manager(5000f))
}
