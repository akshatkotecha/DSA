class ProductOfNumbers {
    ArrayList<Integer> list=new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int product=1;
        for(int i=list.size()-1;i>=list.size()-k;i--){
            product*=list.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */