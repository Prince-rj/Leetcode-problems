class Solution:
    def findTheDistanceValue(self, arr1: list[int], arr2: list[int], d: int) -> int:
        arr1.sort()
        arr2.sort()
        cnt=0
        for i in arr1:
            Flag=True
            for j in arr2:
                if abs(i-j)<=d:
                    Flag=False
                    break
            if Flag:
                cnt+=1
        return cnt