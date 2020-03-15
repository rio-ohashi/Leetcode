fun isValid(s: String?): Boolean {
    val pair = mapOf<Char, Char>('}' to '{', ')' to '(', ']' to '[')
    if (s == null) return false
    if (s == "") return true
    if (s.length % 2 == 1 || s[0] in pair.keys) return false
    var stack = java.util.Stack<Char>()
    for (i in s.indices) {
        when (s[i]) {
            '(', '{', '[' -> stack.push(s[i])
            else -> if (stack.size == 0) {
                return false
            } else if (stack.peek() == pair[s[i]]) stack.pop()
            else {
                stack.push(s[i])
            }
        }
    }
    return stack.size == 0
}

fun main() {
    print(isValid(""))
}
