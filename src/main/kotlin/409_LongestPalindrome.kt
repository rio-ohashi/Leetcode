//fun main() {
//    pr int(longestPalindrome("abbcba"))
//}
//
//class a() {
//    lateinit var map: MutableMap<String, Int?>
//    fun longestPalindrome(s: String): Int {
//        var maxLen = 0
//        for (index in s.indices) {
//            val key = s[index].toString()
//            if (map.containsKey(key)) {
//                map[key] = map[key]?.plus(1)
//            } else {
//                map[key] = 1
//            }
//        }
//        maxLen += map.filter { it.value?.rem(2) ?: 0 == 0 }.map { it.value }.sumBy {  }
//        return maxLen
//    }
//}