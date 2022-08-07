# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def numComponents(self, head: Optional[ListNode], nums: List[int]) -> int:
        ans = 0
        temp = head
        while temp:
            if temp.val in nums:
                ans += 1
                while temp and (temp.val in nums):
                    temp = temp.next
            else:
                temp = temp.next
        return ans