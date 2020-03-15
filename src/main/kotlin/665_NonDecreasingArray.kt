//fun main() {
//    print(checkPossibility(intArrayOf(3,4,2,3)))
//}
//
//fun checkPossibility(nums: IntArray): Boolean {
//    var count = 0
//    var max = 0
//    if (nums.size < 2) return true
//    for ((i,n) in nums.withIndex()) {
//        if (max < n) max = n
//        if ((i != 0 && nums[i] < max) || i != 0 && nums[i]) {
//            count += 1
//        }
//    }
//    return count < 2
//}