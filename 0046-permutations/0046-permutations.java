class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length<1)
            return ans;
        helper(ans, new ArrayList<>(),nums,new boolean[nums.length]);
        return ans;
    }
    private void helper(List<List<Integer>> ans, List<Integer> cur, int[] nums, boolean[] visited)
    {
        if(cur.size()==nums.length)
        {
            ans.add(new ArrayList(cur));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
                continue;
            cur.add(nums[i]);
            visited[i] = true;
            helper(ans, cur, nums, visited);
            cur.remove(cur.size()-1);
            visited[i] = false;
        }
    }
}