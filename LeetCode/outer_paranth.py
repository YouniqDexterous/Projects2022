import re
class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        #greedy solution
        if len(s)==0: return ""
        else:
            stack = []
            str=""
            for i in range(len(s)):
                if s[i]=="(" :
                    if len(stack) >= 1:
                        str+=s[i]
                    stack.append(s[i])
                
                else:
                    if len(stack)>1:
                        str+=s[i]
                    stack.pop()
                #print(stack, "stack")
        
        return str



sol = Solution()
input ="(()())(())"
print(sol.removeOuterParentheses(input))