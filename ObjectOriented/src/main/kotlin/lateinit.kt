class Recipe {
    // Indica que o atributo será iniciado mais tarde, seja em um init ou em uma função
    // assim não é necessário iniciar o valor do atrinuto nem atribuir nulo
    // atributos lateinit só são alocados na memória depois de inicializados
    lateinit var instructions: String

    fun generateRecipe() {
        instructions = "Lave as mãos."
    }

    fun printRecipe() {
        // verifica se um atributo lateinit já foi inicializado
        if(!this::instructions.isInitialized) {
            generateRecipe()
        }
    }
}
fun main() {
    var recipe: Recipe = Recipe()
    recipe.printRecipe()
    println(recipe.instructions)
}
