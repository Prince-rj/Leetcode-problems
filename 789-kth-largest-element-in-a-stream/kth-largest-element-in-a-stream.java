class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min=new PriorityQueue<>();
    int s=0;
    public KthLargest(int k, int[] nums) {
        for(int i:nums)pq.add(i);
        s=k;
        while(s>0){
            if(!pq.isEmpty()){
                s--;
                min.add(pq.poll());
            }
            else break;
        }
    }
    
    public int add(int val) {
        int min_peek=Integer.MIN_VALUE;
        if(!min.isEmpty())min_peek=min.peek();
        // int pq_peek=pq.peek();
        // System.out.println(pq);
        // System.out.println(min);
        // System.out.println(s);
        if(val>=min_peek||s>0){
            if(s>0){
                s--;
                min.add(val);
            }
            else{
                if(!min.isEmpty())pq.add(min.poll());
                min.add(val);
            }
        }
        else pq.add(val);
        return min.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */