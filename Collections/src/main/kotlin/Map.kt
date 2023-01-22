fun main() {
    //Map (Funciona na base de chave->valor e não pode adicionar dois valores para uma mesma chave, definir um novo
    // valor para uma chave irá sobrescrever o valor antigo)
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "xxx"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"))

    println(map1)
    println(map1.entries)
    println(map1.keys)
    println(map1.values)

    map2["Brasil"] = "Brasília"
    println(map2)

    map2.remove("França")
    println(map2.contains("França"))

}
