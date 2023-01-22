package control

import business.GuestBusiness
import entity.Guest

class Lobby {

    private val guestBusiness = GuestBusiness()

    init {
        println("Portaria inicializada.")
        println(control())
    }

    private fun control(): String {
        val age = Console.readInt("Qual sua idade? ")
        val guest = Guest(age = age)

        if(!guestBusiness.ofAge(guest.age)) {
            return "Negado. Menores de idade não são permitidos."
        }

        guest.invityType = Console.readString("Qual é o tipo de convite? ")
        if(!guestBusiness.typeIsValid(guest.invityType)) {
            return "Negado. Convite inválido."
        }

        guest.invityCode = Console.readString("Qual o código do convite? ")
        if(!guestBusiness.guestIsValid(guest)) {
            return "Negado. Convite inválido."
        }

        return "Welcome! :)"
    }
}
