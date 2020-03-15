//fun main() {
//    print(repeatedNTimes(intArrayOf(1,2,3,3)))
//}

//fun repeatedNTimes(A: IntArray): Int? {
//    val n = A.size/2
//    var dic = mutableMapOf<Int,Int?>()
//
//    for (i in A) {
//        if (dic.containsKey(i)) {
//            dic[i] = dic[i]?.plus(1)
//        } else {
//            dic[i] = 1
//        }
//    }
//    println(dic)
//    var g = dic.filterValues { it == n }.keys
//    return g.
//}