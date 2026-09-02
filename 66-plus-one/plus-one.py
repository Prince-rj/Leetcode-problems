class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry=1
        i=len(digits)-1
        while carry!=0:
            if i<0:
                digits.insert(0,1)
                carry=0
                continue
            val=digits[i]+carry
            carry=val//10
            digits[i]=val%10
            i-=1
        return digits
            
