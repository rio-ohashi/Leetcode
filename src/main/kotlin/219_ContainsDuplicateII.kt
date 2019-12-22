fun main() {
//    print(containsNearbyDuplicate(intArrayOf(99,99), 2))
//    print(containsNearbyDuplicate(intArrayOf(99,99), 2))
    print(containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 3))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var m = mutableMapOf<Int, Int>()
    var max = 99999999
    for ((i,n) in nums.withIndex()) {
        if (m.containsKey(n) && (max > i - m[n]!!)) {
            max = i - m[n]!!
        }
        m[n] = i
    }
    return max <= k
}