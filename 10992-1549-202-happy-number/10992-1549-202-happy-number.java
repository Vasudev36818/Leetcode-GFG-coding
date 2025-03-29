class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        if (n < 10) return false;

        int sum;
        while (n != 1 && n != 4) {  // If it reaches 4, it will enter an endless cycle
            sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
