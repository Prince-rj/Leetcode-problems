class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    int size;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
        size=0;
    }
    
    public void addNum(int num) {
        size++;
        if(!min.isEmpty()&&num>min.peek()){
            min.add(num);
            if(min.size()>size/2){
                max.add(min.poll());
            }
        }
        else{
            max.add(num);
            if(max.size()>size/2){
                min.add(max.poll());
            }
        }
        // System.out.println(max);
        // while(min.size()>size/2){
        //     max.add(min.poll());
        // }
    }
    
    public double findMedian() {
        // System.out.println(max);
        // System.out.println(min);
        if(max.size()==min.size())return (double)(max.peek()+min.peek())/2;
        else if(min.size()>max.size())return min.peek();
        else return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */