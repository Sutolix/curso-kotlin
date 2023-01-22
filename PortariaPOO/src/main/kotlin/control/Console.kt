package control

class Console private constructor() {
    companion object {
        fun readInt(msg: String): Int {
            var value: Int? = null
            do {
                print(msg)
                val info = readLine()
                if (info != null && info != "") {

                    value = info.toIntOrNull()
                    if (value == null || value <= 0) {
                        println("Valor inválido")
                    }

                } else {
                    println("Valor inválido")
                }
            } while (value == null || value <= 0)

            return value
        }

        fun readString(msg: String): String {
            var value: String? = null
            do {
                print(msg)
                val info = readLine()

                if (info != null && info != "") {
                    value = info.lowercase()
                } else {
                    println("Valor inválido")
                }
            } while (value == null)

            return value
        }
    }

}
