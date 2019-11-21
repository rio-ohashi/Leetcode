fun main() {

    print(romanToInt("MDCCCLXXXIV"))
}

fun romanToInt(s: String): Int? {
    val roman = mapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    ).withDefault { 0 }

    var arabic = 0
    var prev = 0
    for (index in s.length-1 downTo 0) {
        val cur = roman.getValue(s[index])
        arabic += if (cur >= prev) cur else - cur
        prev = cur
    }
    return arabic
}
