class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {

        for ((i, v) in nums.withIndex()) {
            nums[i] = nums[nums.lastIndex+1-i-    k]
        }
        print(nums)
    }
}


fun main() {
    val s = Solution()
    (s.rotate(intArrayOf(1,2,3,4,5,6,7), 1))
}