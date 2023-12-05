class Solution {
    public int numberOfMatches(int n) {
        if(n==1) return 0;
        int num=0;
        while(n>1){
           if(n%2==0){
              num+=n/2;
               n/=2;
           }
           else {
              num+=(n/2);
              n=(n/2)+1;   
            }
        }
        return num;
    }
}