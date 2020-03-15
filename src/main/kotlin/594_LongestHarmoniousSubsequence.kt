

fun findLHS(nums: IntArray): Int {
    if (nums.size == 0) return 0
    var dicPlus = mutableMapOf<Int, Int>()
    var dicMinus = mutableMapOf<Int, Int>()
    for (n in nums.indices) {
        if (!dicPlus.containsKey(nums[n])) {
            dicPlus[nums[n]] = 1
        } else {
            dicPlus[nums[n]] = dicPlus[nums[n]]!!.plus(1)
        }
        if (!dicMinus.containsKey(nums[n])) {
            dicMinus[nums[n]] = 1
        } else {
            dicMinus[nums[n]] = dicMinus[nums[n]]!!.plus(1)
        }
    }
    if (dicPlus.size == 1) return 0
    return 1
}

fun main() {
    println(findLHS(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)))
}