fun main() {

}


fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var head = head
    if (head == null) return null
    if (head.`val` == `val`) {
        if (head.next != null) {
            head = head.next!!
            if (head.next != null) {
                return removeElements(head.next!!, `val`)
            } else {
                return removeElements(head, `val`)
            }
        } else {
            return null
        }
    } else {

    }
    return removeElements(head.next!!, `val`)
}


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}