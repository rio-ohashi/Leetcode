fun main() {
    print(generate(5))
}

fun generate(numRows: Int): List<List<Int>> {
    var a = mutableListOf<Int>()
    var b = mutableListOf<List<Int>>()
    for (i in 0..numRows) {
        for (j in 0..i+1) {
            a.add(j)
        }
        b.add(a)
    }
    return b
}