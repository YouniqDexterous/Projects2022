import re
class Solution:
    def maxDepth(self, s: str) -> int:
        #greedy solution
        if len(s)==0: return 0
        elif (len(s)==1) and (s[0]!='(' or s[0]!=')'): return 0
        else:
            i=0
            local_para = 0
            global_para = 0
            while (i<len(s)-1):
                
                if (s[i]=='('):
                    local_para+=1
                    global_para= max(global_para,local_para)
                elif (s[i]==')'):
                    local_para-=1
                #print(s[i])
                i+=1
            #print("global_para",global_para)
            #print("local_para",local_para)
            return global_para



sol = Solution()
#print(sol.maxDepth("(1)+((2))+(((3)))"),"out" )
print(sol.maxDepth("(1+(2*3)+((8)/4))+1"))