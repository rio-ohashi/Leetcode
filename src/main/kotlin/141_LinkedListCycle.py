class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode):
        if head is None:
            return False
        s = set([])
        while True:
            if head.next is None:
                return False
            elif head.next in s:
                return True
            s.add(head)
            head = head.next
if __name__ == '__main__':
    print(Solution().hasCycle())

