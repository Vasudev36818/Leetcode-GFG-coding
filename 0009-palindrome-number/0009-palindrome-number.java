class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp =x;
        if (x<0)
        return false;

        while (temp!=0)
        {
            rev = rev*10 + (temp%10);
            temp = temp/10;
        }

        if (rev == x)
        return true;

        else
        return false;
    }
}