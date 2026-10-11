class Solution:
    def replaceDigits(self, s: str) -> str:
        i=0
        ans=''
        for i in range(1,len(s),2):
            val=ord(s[i-1])+int(s[i])
            ans+=s[i-1]+chr(val)
        if len(s)%2!=0:
            ans+=s[len(s)-1]
        return ans

