import java.util.*

fun buddyStrings(A: String, B: String): Boolean {
    var map = Stack<String>()
    var temp = ""
    var swaped = 0
    for (index in A.indices) {
        if (A[index] == B[index]) {
            map.push(A[index].toString())
            if (temp != "") {
                map.push(A[index].toString())
                swaped += 1
            }
            temp = ""
        } else {
            temp = A[index].toString()
        }
    }

    return swaped == 1
}


fun main() {
    print(buddyStrings("aa", "aa"))
}