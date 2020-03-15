
fun repeatedStringMatch(A: String, B: String): Int {
    var temp = A
    var count = 1
    while (true) {
        if (temp.indexOf(B) != -1) {
            return count
        }
        temp += A
        if (temp.length > B.length*100) return -1
        count += 1
    }
}

fun main() {
//    print(repeatedStringMatch("abc","cabcabca"))
//    print(repeatedStringMatch("abcd","cdabcdab"))
    print(repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab","ba"))
}