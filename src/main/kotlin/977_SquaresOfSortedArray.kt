fun main() {
    print(sortedSquares(intArrayOf(-4,-1,0,3,10)))
}

fun sortedSquares(A: IntArray): IntArray {
    var arr = IntArray(A.size)
    for ((i, a) in A.withIndex()) {
        if (a < 0) arr[i] = a * a else arr[i] = -a * -a
    }
    arr.sort()
    return arr
}