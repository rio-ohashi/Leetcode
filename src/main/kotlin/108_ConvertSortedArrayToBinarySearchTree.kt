fun main() {
    print(a().sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
}

class a() {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.size == 0) return null
        return sub(nums, 0, nums.size - 1)
    }

    fun sub(nums: IntArray, first: Int, last: Int): TreeNode? {
        if (first > last) return null

        var mid: Int = (first + last) / 2
        var a = TreeNode(nums[mid])
        a.left = sub(nums, first, mid - 1)
        a.right = sub(nums, mid + 1, last)

        return a
    }
}

//class TreeNode(var a: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}