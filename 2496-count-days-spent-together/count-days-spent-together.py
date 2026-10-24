class Solution:
    def countDaysTogether(self, arriveAlice: str, leaveAlice: str, arriveBob: str, leaveBob: str) -> int:
        daystom=[31,28,31,30,31,30,31,31,30,31,30,31]

        def todays(s):
            mon=int(s[0]+s[1])
            day=0
            for i in range(mon-1):
                day+=daystom[i]
            day+=int(s[3]+s[4])
            return day
        alice_arr=todays(arriveAlice)
        bob_arr=todays(arriveBob)
        alice_lev=todays(leaveAlice)
        bob_lev=todays(leaveBob)
        
        st=max(alice_arr,bob_arr)
        ed=min(alice_lev,bob_lev)
        return max(0,ed-st+1)
