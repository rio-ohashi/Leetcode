fun main() {
    print(longestUnivaluePath())
}

class longestUnivaluePath {

    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */
    fun longestUnivaluePath(root: TreeNode?): Int {
        if (root == null)  return -1
        var leftLength = sub(root.left, 0, 0)
        var rightLength = sub(root.right, 0, 0)
        return if (leftLength > rightLength) leftLength else rightLength
    }

    fun sub(root: TreeNode? ,length:Int, maxlength:Int): Int{
        if (root == null || root.left == null || root.right == null) return maxlength
        var max = maxlength
        if (root?.left?.value!! == root.right?.value) {
            max = length+1
        }
        var leftLength = sub(root.left, length+1, maxlength)
        var rightLength = sub(root.right,length+1, maxlength)
        return if (leftLength > rightLength) leftLength else rightLength
    }


    class TreeNode(var value: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}