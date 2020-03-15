fun main() {
//    print(findMaxAverage(intArrayOf(1,12,-5,-6,50,3), 4)) //12.75
    println(findMaxAverage(intArrayOf(-1), 1)) //-1.0
}


fun findMaxAverage(nums: IntArray, k: Int): Double {
    var max:Double = 0.0
    for (i in nums.indices) {
        var total:Double = 0.0
        if (nums.size - i < k) break
        for(j in i..i+k-1) {
            if (nums.size <= j) {
                break
            }
            total += nums[j]
        }
        var ave = total / k
        if (max < ave || max == 0.0) {
            max = ave
        }
    }
    return max
}