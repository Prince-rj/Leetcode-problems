class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        nums=[]
        i=0
        j=0
        while i<m and j<n:
            if nums1[i]<nums2[j]:
                nums.append(nums1[i])
                i+=1
            else:
                nums.append(nums2[j])
                j+=1
        while i<m:
            nums.append(nums1[i])
            i+=1
        while j<n:
            nums.append(nums2[j])
            j+=1
        for i in range(len(nums)):
            nums1[i]=nums[i]
            