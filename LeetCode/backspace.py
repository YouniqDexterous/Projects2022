import re
#stack and 2 pointer
class Solution:    
    def backspaceCompare(self, s: str, t: str) -> bool:
        st1 =[]
        st2 =[]
        for chr in s:
            if chr == '#':
                if len(st1) > 0:
                    st1.pop()
            else:
                st1.append(chr)
        
        
        for chr in t:
            if chr == '#':
                if len(st2) > 0:
                    st2.pop()
            else:
                st2.append(chr)
        "".join(st1)
        "".join(st2)
        return st1 == st2




sol = Solution()
s = "ab#c"
t = "ad#c"
print(sol.backspaceCompare(s, t))