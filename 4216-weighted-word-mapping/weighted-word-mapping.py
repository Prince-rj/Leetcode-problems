class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
        ans=''
        for i in words:
            ch=0
            for j in i:
                ch+=weights[ord(j)-ord('a')]
            v=ch%26
            ans+=chr(ord('z')-v)
        return ans
