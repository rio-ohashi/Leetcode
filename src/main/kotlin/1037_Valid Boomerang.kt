fun main() {
    val array:Array<IntArray> = arrayOf(intArrayOf(1,1),intArrayOf(2,2),intArrayOf(3,3))
    isBoomerang(array)
}
fun isBoomerang(points: Array<IntArray>): Boolean {
    for (array: IntArray in points) {
        var num = 0
        var seqCol = 0
        for (item in 0..array.size-1) {
            if (seqCol == 0) {
                num = array[item]
            } else if (num != array[item]) {
                return true
            }
            seqCol += 1
        }
    }
    return false
}