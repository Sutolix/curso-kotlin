fun yearsCounter(years: Int): String {
    val mouths: Int = years * 12
    val days: Int = years * 365
    val hours: Int = days * 24
    val minutes: Int = hours * 60
    val seconds: Int = minutes * 60

    return "$years equivalem a: \n$mouths meses\n$days dias\n$hours horas\n$minutes minutos\n$seconds segundos"
}

fun strCaracterCounter(str: String) = str.length

fun cubeCalculator(num: Int) = num * num * num

fun milesToKm(miles: Float): Float = miles * 1.609f

fun fromAtoX(string: String): Unit {
    val str: String = string.replace("a", "x", true).lowercase()
    println(str)
}

fun main() {
    val infos: String = yearsCounter(2)
    val length: Int = strCaracterCounter("abracadabra")
    val cube: Int = cubeCalculator(6)
    val km: Float = milesToKm(1500f)

    println(infos)
    println()
    println(length)
    println()
    println(cube)
    println()
    println(km)
    println()

    fromAtoX("Aqui vemos um teste de escrita, uma alma Alada perto de um Anjo Celestial")
}