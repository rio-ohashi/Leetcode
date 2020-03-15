fun main() {
//    print(searchInsert(intArrayOf(1, 3, 5, 6), 5)) // 2
//    print(searchInsert(intArrayOf(1, 3, 5, 6), 2)) // 1
//    print(searchInsert(intArrayOf(1, 3, 5, 6), 7)) //4
//    print(searchInsert(intArrayOf(1, 3, 5, 6), 0)) //0
    print(searchInsert(intArrayOf(1, 3), 2)) //1
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        var mid = (start + end) / 2
        if (nums[mid] == target) return mid
        else if (nums[mid] > target) end = mid - 1
        else start = mid + 1
    }
    return start
}