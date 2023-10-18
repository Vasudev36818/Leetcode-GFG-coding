class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        if (s.isEmpty()) return 0;

        boolean isNegative = false;
        int i = 0;

        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(0) == '+') i++;

        long result = 0; 

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (!isNegative && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (isNegative && -result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return isNegative ? (int) -result : (int) result;
    }
}
