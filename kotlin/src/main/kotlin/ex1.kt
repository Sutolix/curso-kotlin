/*
a. Crie um novo arquivo com uma função main.
b. Declare uma variável mutável capaz de armazenar seu nome completo.
c. Declare uma variável de texto sem valor algum.
d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça
e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000).
f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000).
f. Imprima o valor do PIB per capita.
*/

fun main() {
    var fullName: String = "Tiago Silva dos Reis"
    var text: String
    val shoeNumber: UByte = 43u
    val brazilPIB: Long = 1869000000000
    val brazilPopulation: Int = 211000000

    println("PIB per capita: R$ ${brazilPIB / brazilPopulation}")
}
