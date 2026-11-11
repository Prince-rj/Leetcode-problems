class Solution:
    def minimumCost(self, cost1: int, cost2: int, costBoth: int, need1: int, need2: int) -> int:
        both=max(need1,need2)*costBoth
        notboth=need1*cost1+need2*cost2
        exp=int(1e100)
        if cost1>costBoth: 
            exp=need1*costBoth
            if need2>need1: exp+=(need2-need1)*cost2
        if cost2>costBoth:
            exp=need2*costBoth
            if need1>need2: exp+=(need1-need2)*cost1
        exp2=int(1e100)
        if cost1+cost2>costBoth:
            if need1>need2: 
                exp2=costBoth*need2
                exp2+=cost1*(need1-need2)
            else:
                exp2=costBoth*need1
                exp2+=cost2*(need2-need1)
            
        return min(both,min(notboth,min(exp,exp2)))