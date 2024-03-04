class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int ans = 0;
        int score = 0;
        int i=0, j=tokens.length-1;
        
        while(i<=j)
        {
            if(tokens[i]<=power)
            {
                score++;
                power = power - tokens[i];
                i++;
                
                if(ans<score)
                    ans = score;
            }
            else if(score>0)
            {
                power += tokens[j];
                score--;
                j--;
            }
            else
                break;
        }
        return ans;
    }
}