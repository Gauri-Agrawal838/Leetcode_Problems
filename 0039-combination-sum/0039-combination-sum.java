class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        this.bt(target,comb,0,candidates,ans);
        return ans;
    }
    protected void bt(int remain, LinkedList<Integer> comb, int start, int[] candidates, List<List<Integer>> ans)
    {
        if(remain==0)
        {
            ans.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(remain<0)
            return;
        for(int i=start;i<candidates.length;i++)
        {
            comb.add(candidates[i]);
            this.bt(remain-candidates[i],comb,i,candidates,ans);
            comb.removeLast();
        }
        
    }
}