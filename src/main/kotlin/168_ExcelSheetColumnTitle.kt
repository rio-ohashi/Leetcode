fun main() {
    print(convertToTitle(28))
}

fun convertToTitle(n: Int): String {
    var a = n
    val numberAlphabet= 26.0
    val alpha = mutableMapOf<Int, Char>(
        1 to 'A', 2 to 'B', 3 to 'C', 4 to 'D', 5 to 'E',
        6 to 'F', 7 to 'G', 8 to 'H', 9 to 'I', 10 to 'J',
        11 to 'K', 12 to 'L', 13 to 'M', 14 to 'N', 15 to 'O',
        16 to 'P', 17 to 'Q', 18 to 'R', 19 to 'S', 20 to 'T',
        21 to 'U', 22 to 'V', 23 to 'W', 24 to 'X', 25 to 'Y', 26 to 'Z'
    ).withDefault { 'A' }

    var str:String = ""
    for (int in 0..n) {
//        var i: String = n
        val pow = Math.pow(numberAlphabet, int.toDouble()+1).toInt()
        a-=pow
        str += alpha[a]

        var a = 1
    }
    return str
}