package business

import entity.Guest

class GuestBusiness {
    fun ofAge(age: Int) = age >= 18

    fun typeIsValid(type: String) = (type == "comum" || type == "premium" || type == "luxo")

    fun guestIsValid(guest: Guest) = when (guest.invityType) {
            "comum" ->  guest.invityCode.startsWith("xt")
            "premium", "luxo" -> guest.invityCode.startsWith("xl")
            else -> false
    }
}
