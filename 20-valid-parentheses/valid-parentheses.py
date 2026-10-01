class Solution:
    def isValid(self, s: str) -> bool:
        stack=deque()
        for i in s:
            if len(stack)==0 and (i==')' or i=='}' or i==']'): return False
            elif len(stack)!=0 and stack[-1]=='(' and i==')': stack.pop()
            elif len(stack)!=0 and stack[-1]=='{' and i=='}': stack.pop()
            elif len(stack)!=0 and stack[-1]=='[' and i==']': stack.pop()
            else: stack.append(i)
            # print(stack,i)
        return len(stack)==0