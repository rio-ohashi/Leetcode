//fun main() {
//    print(sumOfLeftLeaves())
//}
//
//fun sumOfLeftLeaves(root: TreeNode?): Int {
//    var left = sub(root!!.left, true)
//    var right = sub(root!!.right, false)
//
//    return left + right
//}
//
//fun sub(root: TreeNode?, isLeft: Boolean): Int {
//    if (root == null) return 0
//
//    if (root.left == null && root.right == null && isLeft) {
//        return root.`val`
//    }
//
//    return  sub(root.left, true) + sub(root.left, false)
//}