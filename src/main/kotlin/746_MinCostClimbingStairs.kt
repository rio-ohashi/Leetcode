//fun main() {
//    print(minCostClimbingStairs(intArrayOf(10, 15, 20)))
//}
//
//
//fun minCostClimbingStairs(cost: IntArray): Int {
//    var total = 0
//    var index = 0
//    while (true) {
//        if (index == 0) {
//            if (cost[index] > cost[index+1]) {
//
//            } else {
//                start += index
//                total += cost[index]
//            }
//            if (cost[start + 1] > cost[start + 2]) {
//                index += start + 2
//            } else {
//                index += start + 2
//            }
//        }  else if (cost[index + 1] > cost[index+2]) {
//            index += 1
//            total += cost[index+1]
//        } else {
//            index += 2
//            total += cost[index+2]
//        }
//        if (total >= cost.size) break
//    }
//    return total
//}
