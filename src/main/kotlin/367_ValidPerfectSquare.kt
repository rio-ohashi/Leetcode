fun isPerfectSquare(num: Int): Boolean {
    var min = 1
    var max = num
    var mid = 0
    for (i in 1..num) {
        mid = (min + max) / 2
        if (min > max) break
        if (num % mid == 0 && num / mid == mid) return true
        if (num / mid > mid) {
            min = mid + 1
        } else {
            max = mid - 1
        }
    }
    return false
}
//fun isPerfectSquare(num: Int): Boolean {
//    for (i in 1..(num/2)+1) {
//        if (num  % i == 0 && num / i == i) return true
//        if (num / 2 == i) break
//    }
//    return false
//}


fun main() {
    print(isPerfectSquare(
        1))
}