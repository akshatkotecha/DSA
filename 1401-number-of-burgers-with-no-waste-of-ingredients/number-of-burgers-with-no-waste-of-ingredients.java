class Solution {
    public List<Integer> numOfBurgers(int num1, int num2) {
        List<Integer> list=new ArrayList<>();
        if(num1%2!=0 || num1<2*num2 || num1>4*num2 || (num1-2*num2)%2!=0) return list;
        list.add((num1-2*num2)/2);
        list.add(2*num2-(num1/2));
        return list;
    }
}