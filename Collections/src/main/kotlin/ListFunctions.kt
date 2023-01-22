data class Ingredient(val name: String, val amounts: Int)
data class Recipe(val name: String, val calories: Int, val ingredients: List<Ingredient> = listOf())

private fun dataList(): List<Recipe> {
    return listOf(
        Recipe(
            "Lasanha", 1200,
            listOf(
                Ingredient("Presunto", 5),
                Ingredient("Queijo", 10),
                Ingredient("Molho de tomate", 2),
                Ingredient("Manjerição", 3)
            )
        ),
        Recipe("Panqueca", 500),
        Recipe("Omelete", 200),
        Recipe("Parmegiana", 700),
        Recipe("Sopa de feijão", 300),
        Recipe(
            "Hamburguer", 2000,
            listOf(
                Ingredient("Pão", 1),
                Ingredient("Hamburguer", 3),
                Ingredient("Queijo", 1),
                Ingredient("Catupiry", 1),
                Ingredient("Bacon", 3),
                Ingredient("Alface", 1),
                Ingredient("Tomate", 1)
            )
        )
    )
}

fun main() {
    val data = dataList()

    println("Tenho dados? ${if (data.any()) "sim" else "não"}") // retorna true caso a coleção tenha ao menos um elemento
    println("São ${data.count()} elementos")

    println("Primeira receita: ${data.first().name}")
    println("Última receita: ${data.last().name}")

    println(listOf<Int>().firstOrNull()) // retorna nulo caso não haja nada na lista (ao invés de uma exceção)

    println(listOf<Int>(1, 2, 3).sum()) // o sum serve apenas para listas de números
    println(data.sumOf { it.calories }) // use sumOf para somar as propriedades dos itens da lista

    println(data.maxOf { it.calories }) // retorna a propriedade com maior número
    println(listOf(1, 4, 9).max()) // retorna o maior número
    println(listOf(1, 4, 9).maxOf { it })
    println(listOf(1, 4, 9).maxOfOrNull { it })
    println(listOf(1, 3, 7, 51, 12).average())

    val lst = listOf(1, 5, 7, 95, 6, 4, 8, 2, 5, 4, 1, 1, 1, 1, 5, 74, 15)
    println(lst.distinct()) // elimina os repetidos (tanto faz o tipo dos itens da lista)
    println(data.distinctBy { it.name }) // analisa o atributo especificado

    // orderna
    println(lst.sorted())
    println(lst.sortedDescending())

    println(lst.reversed()) // reverte a lista

    println(data.filter { it.calories > 500 })
    println(data.map { it.name })
    println(data.count { it.calories > 500 })
    println(data.any { it.calories > 500 })

    println(data.take(2)) // pega os 2 primeiros elementos da lista
    println(data.takeLast(2)) // pega os 2 últimos elementos da lista

    data.forEach {
        println(it.name)
    }
}
