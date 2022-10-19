class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            for(int j=0;i+j<=9;j++)
            {
                String substring = digits.substring(j, i+j);
                int value = Integer.parseInt(substring);
                if(value>=low && value<=high)
                    ans.add(value);
            }
        }
        return ans;
    }
}