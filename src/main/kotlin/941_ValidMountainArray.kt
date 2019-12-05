fun main() {
    print(validMountainArray(intArrayOf(0,1,2,6,3,4, 3,2,1)))
}


fun validMountainArray(A: IntArray): Boolean {
    var isUpped = false
    var isDowned = false
    var prev = -1
    for (cur in A) {
        if (prev == cur ||
            (!isUpped && prev > cur) ||
            (isDowned && prev < cur)
        ) {
            return false
        }
        if (prev != -1 && prev < cur) isUpped = true
        if (prev > cur) isDowned = true
        prev = cur
    }
    return isDowned && isUpped
}

//fun validMountainArray(A: IntArray): Boolean {
//    var isUpped = false
//    var iskeepingUp = true
//    var prev = -1
//    for (i in A) {
//        if (prev != -1 && prev < i) isUpped = true
//        if (prev == i) return false
//        if (prev > i) iskeepingUp = false
//        if (iskeepingUp && prev > i) return false
//        if (!iskeepingUp && prev < i) return false
//        prev = i
//    }
//    return !iskeepingUp && isUpped
//}