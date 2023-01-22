fun main() {
    val invalidInputMessage = "Entrada inválida."

    print("Qual sua idade? ")
    val age = readlnOrNull()

    if (age != null && age != "") {
        if (age.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    } else {
        println(invalidInputMessage)
        return
    }

    print("Qual o tipo do seu convite? ")
    var ticketType = readlnOrNull()
    if (ticketType != null && ticketType != "") {
        ticketType = ticketType.lowercase()

        if (ticketType != "comum" && ticketType != "premium" && ticketType != "luxo") {
            println("Negado. Tipo de convite inválido.")
            return
        }

        print("Digite o código do convite: ")
        var ticketCode = readlnOrNull()
        if (ticketCode != null && ticketCode != "") {

            ticketCode = ticketCode.lowercase()
            if (ticketType == "comum" && ticketCode.startsWith("xt")) {
                println("Welconme :)")
            } else if ((ticketType == "premium" || ticketType == "luxo") && ticketCode.startsWith("xl")) {
                println("Welconme :)")
            } else {
                println("Negado. Código de convite inválido")
            }

        } else {
            println(invalidInputMessage)
            return
        }

    } else {
        println(invalidInputMessage)
        return
    }

}
