fun main() {
    val salary = 10000f
    val fundYield = 0.002f
    val otherYield = 0.008f
    val monthlyInvestment = salary * 0.05f

    var mounth = 0
    var anaBalance = 0f
    var paulaBalance = 0f

    do {
        anaBalance += (monthlyInvestment * 2) + (anaBalance * fundYield)
        paulaBalance += monthlyInvestment + (paulaBalance * otherYield)
        mounth++

        println("Ana: $anaBalance")
        println("Paula: $paulaBalance")
        println()
    } while(anaBalance > paulaBalance)

    println("--- Paula alcançou Ana em $mounth meses")

}