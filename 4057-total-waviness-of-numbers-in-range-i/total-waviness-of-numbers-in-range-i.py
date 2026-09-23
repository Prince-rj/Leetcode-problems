class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:
        cnt=0
        def help(num):
            nonlocal cnt
            if len(num)<3: return
            for i in range(1,len(num)-1):
                if num[i]<num[i-1] and num[i]<num[i+1]:
                    cnt+=1
                elif num[i]>num[i-1] and num[i]>num[i+1]:
                    cnt+=1
        for i in range(num1,num2+1):
            print(str(i),cnt)
            help(str(i))
        return cnt