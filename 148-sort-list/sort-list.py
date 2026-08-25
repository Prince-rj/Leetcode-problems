# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def merge_two_sorted(a,b):
            ptr1=a
            ptr2=b
            sort=ListNode(-1)
            head=sort
            while ptr1 and ptr2:
                if ptr1.val<=ptr2.val:
                    sort.next=ptr1
                    ptr1=ptr1.next
                    sort=sort.next
                    sort.next=None
                else:
                    sort.next=ptr2
                    ptr2=ptr2.next
                    sort=sort.next
                    sort.next=None
            while ptr1:
                sort.next=ptr1
                ptr1=ptr1.next
                sort=sort.next
                sort.next=None
            while ptr2:
                sort.next=ptr2
                ptr2=ptr2.next
                sort=sort.next
                sort.next=None
            return head.next
        def print_list(h):
            ptr=h
            while ptr:
                print(ptr.val,end=' ')
                ptr=ptr.next
            print()
        def sort(h):
            if not h or not h.next: return h
            slow=h
            fast=h.next.next
            prev=None
            while fast and fast.next:
                fast=fast.next.next
                # prev=slow
                slow=slow.next
            # if prev: prev.next=None
            li2=slow.next
            slow.next=None
            # print_list(h)
            # print_list(li2)
            a=sort(h)
            b=sort(li2)
            return merge_two_sorted(a,b)
        return sort(head)
            
            
            

                
        