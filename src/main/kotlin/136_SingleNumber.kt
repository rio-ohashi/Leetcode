fun main() {
    print(singleNumber(intArrayOf(2,2,1,1,4,3,3)))
}
//
//fun singleNumber(nums: IntArray): Int {
//    return sum
//}
fun singleNumber(nums: IntArray): Int {
    return nums.toSet().sum() * 2 - nums.sum()
}

fun singleNumber(nums: IntArray): Int {
    var map = mutableMapOf<Int, Int?>()
    for (n in nums) {
        if (map.containsKey(n)) {
            map.remove(n)
        } else {
            map[n] = 1
        }
    }
    for ((k, v) in map) {
        return k
    }
    return -1
}