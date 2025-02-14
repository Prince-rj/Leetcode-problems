class ProductOfNumbers {
    ArrayList<Integer> arr;
    ArrayList<Integer> zeros;
    int product;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
        zeros=new ArrayList<>();
        product=1;
    }
    
    public void add(int num) {
        if(num!=0){
            product=product*num;
            arr.add(product);
        }
        else{
            product=1;
            arr.add(0);
            zeros.add(arr.size()-1);
        } 
    }
    
    public int getProduct(int k) {
        int val=arr.size()-k-1;
        // System.out.println(arr);
        // System.out.println(zeros);
        for(var i=zeros.size()-1;i>=0;i--){
            if(zeros.get(i)>val)return 0;
            else if(zeros.get(i)<k)break;
        }
        if(val==-1||arr.get(val)==0)return product;
        return product/arr.get(val);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */