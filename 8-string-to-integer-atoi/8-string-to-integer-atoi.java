/*class Solution {
    public int myAtoi(String s) {
        int length = s.length();
        String count = "";
        for(int i = 0; i < length; i++) {
            if((s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                count += Character.valueOf(s.charAt(i));
            } else if((s.charAt(i) == ' ' && count.equals(""))) {
                continue;
            } else if((s.charAt(i) == '-' || s.charAt(i) == '+' ) && count.equals("")) {
                count += Character.valueOf(s.charAt(i));
            } else if(s.charAt(i) < 48 || s.charAt(i) > 57) {
                break;
            } 
        }
        
        if(count.equals("")) {
            return 0;
        }
        Long lng = Long.valueOf(count);
        if(lng >= Math.pow(2,31) - 1) {
            return 2147483647;
        } else if(lng <= -1*Math.pow(2,31)) {
            return -2147483648;
        } else {
        return Integer.parseInt(count);
    }
}
}*/

class Solution {
    public int myAtoi(String input) {
        int sign = 1; 
        int result = 0; 
        int index = 0;
        int n = input.length();
        
        // Discard all spaces from the beginning of the input string.
        while (index < n && input.charAt(index) == ' ') { 
            index++; 
        }
        
        // sign = +1, if it's positive number, otherwise sign = -1. 
        if (index < n && input.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && input.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        
        // Traverse next digits of input and stop if it is not a digit
        while (index < n && Character.isDigit(input.charAt(index))) {
            int digit = input.charAt(index) - '0';

            // Check overflow and underflow conditions. 
            if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            // Append current digit to the result.
            result = 10 * result + digit;
            index++;
        }
        
        // We have formed a valid number without any overflow/underflow.
        // Return it after multiplying it with its sign.
        return sign * result;
    }
}