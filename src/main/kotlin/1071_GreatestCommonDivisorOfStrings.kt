//fun gcdOfStrings(str1: String, str2: String): String {
//    var a = ""
//    var str2map = mutableSetOf<Char>(str2.to.toList().distinct())
//    for (i in str1.indices) {
//            if (str2map.toString().substring(0, i) in str1) {
//                a = str2map.toString().substring(0, i)
//            }
//    }
//    return a
//}
//
//fun main() {
//    print(gcdOfStrings("ABABAB", "ABAB"))
//}