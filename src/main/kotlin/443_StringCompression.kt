//fun main() {
//
//print(compress(charArrayOf('a','a','b','b','c','c','c','c','c','c','c','c','c','c','c','c')))
//}
//
//fun compress(chars: CharArray): Int {
//    var prev = ' '
//    var continueCount = 0
//    var compress = charArrayOf()
//    for((index, c) in chars.withIndex()) {
//        if
//    }
//    return compress.size
//}


//var a = charArrayOf()
//for (m in map) {
//    a+=m.key
//    if(m.value!! > 1) {
//        a+=m.value.toString().toCharArray()
//    }
//}

//
//if(index == chars.size-1) {
//    if (continueCount > 1) {
//        compress += continueCount.toString().toCharArray()
//    }
//} else if(chars[index] == prev) {
//    continueCount += 1
//} else {
//    if (continueCount > 1) {
//        compress += continueCount.toString().toCharArray()
//    }
//    compress += chars[index]
//    prev = chars[index]
//    continueCount = 1
//}