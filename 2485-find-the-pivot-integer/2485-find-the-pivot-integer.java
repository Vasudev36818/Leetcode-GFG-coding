class Solution {
    public int pivotInteger(int n) {
        if(n==0) return -1;
        if(n==1) return 1;
        int sum=n*(n+1)/2;
        int sum1=0; int num=0;

        while(n>0){
            num=n--;
            sum-=num;
            if(sum==sum1) return num;
            sum1+=num;
        }
        return -1;
    }
}