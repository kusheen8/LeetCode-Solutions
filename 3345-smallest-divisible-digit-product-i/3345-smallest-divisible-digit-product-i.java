class Solution {
    public int smallestNumber(int n, int t) { 
        while(true){
            int product = 1;
            int x = n;
            while(x > 0){
                product *= (x%10); //  this is to extract one didgit at a time
                x/=10;
            }
            if(product % t == 0) // this is for the second condition we are asked to check
            return n;
            n++;
        }
    }
}