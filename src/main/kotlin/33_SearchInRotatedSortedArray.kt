fun main() {
//    print(search(intArrayOf(4,5,6,7,0,1,2), 0)) //4
//    print(search(intArrayOf(4,5,6,7,0,1,2), 3)) // -1
//    print(search(intArrayOf(1,2,3,4,5,6), 4))//3
    print(search(intArrayOf(8,1,2,3,4,5,6,7), 6))


}


fun search(nums: IntArray, target: Int): Int {
    if (nums.size == null) return -1
    var topIndex = 0
    var endIndex = nums.size-1
    var middleIndex = endIndex / 2
    var pivotIndex = 0
    if (nums[topIndex] > nums[endIndex]) {
        pivotIndex = getPivot(nums, target, topIndex, endIndex, middleIndex)
    } else {
        pivotIndex = getPivota(nums, target, topIndex, endIndex, middleIndex)
    }
    return pivotIndex
}

fun getPivota(nums: IntArray, target: Int, topIndex: Int, endIndex: Int, middleIndex: Int):Int {
    var top = topIndex
    var end = endIndex
    var mid = middleIndex
    for (index in nums.indices) {
        if (top > end) return -1
        if (nums[top] == target) return top
        if (nums[mid] == target) return mid
        if (nums[end] == target) return end
        if (nums[mid] < target) {
            top = mid + 1
        } else {
            end = mid - 1
        }
        mid = (top + end) / 2
    }
    return -1
}

fun getPivot(nums: IntArray, target: Int, topIndex: Int, endIndex: Int, middleIndex: Int):Int {
    var top = topIndex
    var end = endIndex
    var mid = middleIndex
    for (index in nums.indices) {
        if (top > end) return -1
        if (nums[top] == target) return top
        if (nums[mid] == target) return mid
        if (nums[end] == target) return end
        if (nums[top] < target) {
            top = mid - 1
        } else {
            end = mid + 1
        }
        mid = (top + end) / 2
        return getPivot(nums, target, top, end, mid)
        break
    }
    return -1
}

//
//fun getPivot(nums: IntArray, target: Int):Int {
//    var topIndex = 0
//    var endIndex = nums.size-1
//    var middleIndex = endIndex / 2
//
//    for (index in nums.indices) {
//        if (nums[middleIndex] == target) return middleIndex
//        if (nums[middleIndex] < nums[topIndex]) {
//            if (middleIndex == topIndex + 1) {
//                if (nums[middleIndex] == target) return middleIndex
//                if (nums[topIndex] == target) return topIndex
//            }
//            endIndex = middleIndex - 1
//        } else {
//            if (middleIndex == endIndex - 1) {
//                if (nums[middleIndex] == target) return middleIndex
//                if (nums[endIndex] == target) return endIndex
//            }
//            topIndex = middleIndex + 1
//        }
//        middleIndex = (topIndex + endIndex) / 2
//    }
//    return -1
//
//}