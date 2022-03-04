class Solution {
    public boolean isPalindrome(int x) {
        String val = String.valueOf(x);
        int newint = 0;
        String newStr = "";
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) == val.charAt(val.length() - 1 - i)) {
                newStr += val.substring(i, i + 1);
            } 
           
        }
        if (!(newStr.equals (""))) {
            newint = Integer.valueOf(newStr);
        }
        
        if (newint == x) {
            return true;
        }
        System.out.println(newStr);
        return false;
    }
}