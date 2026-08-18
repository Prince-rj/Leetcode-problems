class Solution:
    def minMutation(self, startGene: str, endGene: str, bank: List[str]) -> int:
        q=deque()
        q.append([startGene,0])
        vis=set()
        valid=set()
        for i in bank: valid.add(i)
        mutation=['A','C','G','T']
        while q:
            tmp=q.popleft()
            if tmp[0] == endGene: return tmp[1]
            for x in range(len(tmp[0])):
                for y in mutation:
                    st = list(tmp[0])
                    st[x] = y
                    st = ''.join(st)
                    if st in valid and st not in vis: q.append([st,tmp[1]+1])
                    vis.add(st)
        return -1


