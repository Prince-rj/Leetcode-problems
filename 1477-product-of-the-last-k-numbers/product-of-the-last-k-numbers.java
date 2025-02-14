class ProductOfNumbers {
    ArrayList<Integer> arr;
    int product;
    int v=0;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
        product=1;
    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        int val=1;
        for(int i=arr.size()-1;i>=arr.size()-k;i--){
            val*=arr.get(i);
        }
        return val;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */