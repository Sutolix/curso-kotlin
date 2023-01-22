/**
 * Main Function
 */
fun main() {

    /**
     Type       Bit
     Double     64
     Float      32
     Long       64
     Int        32
     Short      16
     Byte       8
     Boolean    ?
     String     ?
     Char       ?
     */

    // var -> pode mudar de valor
    // val -> não muda de valor, é tipo um const e faz parte das boas práticas usá-lo

    val c: Char = 'a' // Para Char usa-se ''
    val s: String = "Tiago"
    val b: Boolean = true

    val double: Double = 10.0
    val float: Float = 10f
    val long: Long = 10L
    val int: Int = 10
    val short: Short = 10
    val byte: Byte = 10

    var age: Float

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")

    // Unsigned - Números sem sinal (sem números negativos)
    val uint: UInt = 1u
    val ushort: UShort = 1u
    val ubyte: UByte = 1u
    val ulong: ULong = 1u

    println("UInt MAX ${UInt.MAX_VALUE} - MIN ${UInt.MIN_VALUE}")

    fun test(s: String, c: Char) {
        println("Olá, $s $c - ${s.length}")

        var localAge: Int = 30
        localAge++ // primeiro o compilador executa depois intera
        ++localAge // primeiro o compilador intera denpois executa
        println(localAge)
    }

    test(s, c) // Call the function test
}
