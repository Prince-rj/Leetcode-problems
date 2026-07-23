# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ptr1=l1; ptr2=l2; head=ListNode(-1); ptr=head; carry=0
        while ptr1!=None and ptr2!=None:
            val=carry+ptr1.val+ptr2.val
            carry=val//10
            val%=10
            newNode=ListNode(val)
            ptr.next=newNode
            ptr=ptr.next
            ptr1=ptr1.next
            ptr2=ptr2.next
        while ptr1!=None:
            val=carry+ptr1.val
            carry=val//10
            val%=10
            newNode=ListNode(val)
            ptr.next=newNode
            ptr=ptr.next
            ptr1=ptr1.next
        while ptr2!=None:
            val=carry+ptr2.val
            carry=val//10
            val%=10
            newNode=ListNode(val)
            ptr.next=newNode
            ptr=ptr.next
            ptr2=ptr2.next
        if carry!=0:
            newNode=ListNode(carry)
            ptr.next=newNode
            
        return head.next
        