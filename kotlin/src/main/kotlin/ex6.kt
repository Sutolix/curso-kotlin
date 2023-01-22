fun hashLadder(qnt: Int) {
    for (i in 1..qnt) {
        println("#".repeat(i))
    }
}

fun checkXandO(str: String): Boolean {
    val strLower = str.lowercase()

    var x = 0
    var o = 0
    var i = 0

    while (i < strLower.length) {
        if (strLower[i] == 'x') x++
        if (strLower[i] == 'o') o++
        i++
    }

    return ((x == o) && (x != 0))
}

fun main() {
    // Using for loop
    for (i in 1..50) {
        print("$i ")
    }

    println()

    for (i in 50 downTo 1) {
        print("$i ")
    }

    println()

    for (i in 1..50) {
        if(i % 5 == 0) {
            continue
        }

        print("$i ")
    }

    println()

    var sum = 0
    for (i in 1..500) {
        sum += i
    }
    print(sum)

    println()

    hashLadder(5)

    // Using while loop

    val balloonCapacity = 7
    val tankCapacity = 2000
    var ballonsQnt = 0
    while ((ballonsQnt * balloonCapacity) + balloonCapacity < tankCapacity) {
        ballonsQnt++
    }
    println("Cabem $ballonsQnt balões na caixa d'água.")

    println()

    var j = 1
    while (j <= 50) {
        print(j)
        if (j % 5 == 0 && j % 3 == 0) {
            print(" FizzBuzz")
        } else if (j % 3 == 0) {
            print(" Buzz")
        } else if (j % 5 == 0) {
            print(" Fizz")
        }
        print("\n")
        j++
    }

    println()

    val text = "Meu nome é Julius"
    var k = text.length - 1
    while (k >= 0) {
        print(text[k])
        k--
    }

    println()

    println(checkXandO("xXooox"))
    println(checkXandO("xxxxo"))
    println(checkXandO("dsfsdgdfg"))
    println(checkXandO("ooooxzzzzz"))

}
