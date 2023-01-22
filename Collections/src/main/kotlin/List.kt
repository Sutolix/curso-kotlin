fun main() {
    // List (É um conjunto ordernado)
    val list1: List<Int> = listOf(1, 2, 3, 4, 5) // lista imutável
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) // lista mutável

    list2.add(8)
    list2.remove(3)
    list2.removeAt(0)
    println(list2)
    println(list1.contains(5))

    list2.clear()
    println(list2)
}
