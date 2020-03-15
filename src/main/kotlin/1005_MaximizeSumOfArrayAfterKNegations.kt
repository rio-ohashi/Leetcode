import kotlin.math.min

fun main() {
    print(largestSumAfterKNegations(intArrayOf(2, -3, -1, 5, -4), 2)) // 13
}

fun largestSumAfterKNegations(A: IntArray, K: Int): Int {
    var sum = 0
    var minuses = mutableListOf<Int>()

    for (n in A) {
        if (n > 0) {
            sum += n
        } else {
            minuses.add(n)
        }
    }

    A.sort()
    for ((i, m) in minuses.withIndex()) {
        if (i < K) {
            sum += -m
        } else {
            sum += m
        }

    }

    return sum
}