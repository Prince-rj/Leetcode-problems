class Solution(object):
    def maxFrequencyElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic={}
        m=0
        for i in nums:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
            m=max(m,dic[i])

        c=0
        for i in dic:
            if dic[i]==m:
                c+=1
        return c*m

            
        