fun main() {
    print(twoSum(intArrayOf(3, 2, 4), 6))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = HashMap<Int,Int>()
    for ((index, value) in nums.withIndex())  {
        if (numMap.containsKey(target - value))
            return intArrayOf(index, numMap[target - value]!!)
        numMap[value] = index
    }
    return intArrayOf(0, 0)
}