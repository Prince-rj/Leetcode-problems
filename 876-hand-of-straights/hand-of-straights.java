class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if((hand.length%groupSize)!=0)return false;
        // return true;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(var i:hand)pq.add(i);
        while(!pq.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>();
            int prev=-1;
            for(int i=0;i<groupSize;i++){
                if(pq.isEmpty())return false;
                int v=pq.poll();
                while(!pq.isEmpty()&&prev==v){
                    arr.add(v);
                    v=pq.poll();
                }
                // System.out.println(prev+" "+v);
                if(prev!=-1&&v!=prev+1)return false;
                prev=v;
            }
            for(var i:arr)pq.add(i);
        }
        return true;
    }
}