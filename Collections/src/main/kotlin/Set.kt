fun main() {
    // Set (Não precisa ser um conjunto ordernado, não permite valores duplicados e não tem index)
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid") // o segundo Madrid é ignorado
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)

    set2.add("São Paulo")
    set2.remove("Berlim")
    println(set2.contains("São Paulo"))

    println(set2.size)
    set2.clear()
    println(set2)
}
