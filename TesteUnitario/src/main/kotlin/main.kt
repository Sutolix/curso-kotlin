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

fun abc(): Boolean {
    return true
}

fun dfg() {
    throw NullPointerException()
}

fun main() {
    println(checkXandO("xXooox"))
    println(checkXandO("xxxxo"))
    println(checkXandO("dsfsdgdfg"))
    println(checkXandO("ooooxzzzzz"))
}
