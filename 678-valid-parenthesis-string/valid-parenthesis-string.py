class Solution:
    def checkValidString(self, s: str) -> bool:
        mini=0
        maxi=0
        for i in s:
            if i=='(': mini+=1
            else: mini-=1
            if i!=')': maxi+=1
            else: maxi-=1
            if maxi<0: return False
            mini=max(mini,0)
        return mini==0