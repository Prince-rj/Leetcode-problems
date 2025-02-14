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
            arr=new ArrayList<>();
        } 
    }
    
    public int getProduct(int k) {
        if(arr.size()<k)return 0;
        if(arr.size()==k)return product;
        int val=arr.size()-k-1;
        return product/arr.get(val);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */