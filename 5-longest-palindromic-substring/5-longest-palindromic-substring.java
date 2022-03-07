class Solution {
    public String longestPalindrome(String s) {
        int dp[][] = new int[s.length()][1+s.length()];
        int l = 1;
        int e = 0;
        int maxl = 1;
        for (int i = 0; i < s.length(); i++)
        {
            dp[i][1] = 1;
            dp[i][0] = 1;
        }
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 2; j <= i + 1; j++)
            {
                dp[i][j] = (dp[i-1][j-2]) * ( s.charAt(i) == s.charAt(i - j + 1) ? 1 : 0);
                if (dp[i][j] == 1 && j > maxl) 
                {
                    e = i;
                    l = j;
                    maxl = j;
                }
            }
        }
        return s.substring(e - l + 1, e + 1);
    }
   
}
