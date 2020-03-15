//fun main() {
//    print(deleteDuplicates())
//}
//
//
//fun deleteDuplicates(head: ListNode?): ListNode? {
//    if (head == null) return null
//
//    return sub(head)
//}
//
//fun sub(head: ListNode?) : ListNode? {
//    if (head == null) return null
//    var a: ListNode? = null
//    if (head?.`val` == head?.next?.`val`) {
//        a= sub((if (head != null) head.next else null)!!.next) as Nothing?
//    } else {
//        a= sub(head?.next) as Nothing?
//    }
//    return a
//}
//
//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}