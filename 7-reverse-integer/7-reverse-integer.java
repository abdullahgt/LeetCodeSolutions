import java.util.*;
class Solution {
    public int reverse(int x) {
        String storage = Integer.toString(x);
        if(storage.charAt(0) == '-') {
            int result;
            try{
            result = Integer.parseInt("-" + helper(storage));
            } catch(Exception f) {
                return 0;
            }
            return result;
        } else {
            try {
            return Integer.parseInt(helper(storage));
            } catch(Exception e){
                return 0;
            }
        }
        
    }
    private String helper(String y) {
        String returnValue = "";
        if(y.charAt(0) == ('-')) {
            Stack<String> stack = new Stack<>();
            for(int i = 1;i <= y.length() - 1; i++) {
                stack.push(y.valueOf(y.charAt(i)));
            }
            while(stack.size() != 0) {
                returnValue += stack.pop();
            }
        } else {
            Stack<String> stack = new Stack<>();
            for(int i = 0;i <= y.length() - 1; i++) {
                stack.push(y.valueOf(y.charAt(i)));
            }
            while(stack.size() != 0) {
                returnValue += stack.pop();
            }
            
    }
        return returnValue;
}
}