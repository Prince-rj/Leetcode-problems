class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        # Sum 1 for every pattern that exists as a substring in word
        return sum(1 for pattern in patterns if pattern in word)
