class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        this.bt(k,comb,0,n,ans);
        return ans;
    }
    protected void bt(int target, LinkedList<Integer> comb, int start, int remain, List<List<Integer>> ans)
    {
        if(remain==0 && comb.size()==target)
        {
            ans.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(remain<1 || comb.size()==target)
            return;
        for(int i=start;i<9;i++)
        {
            comb.add(i+1);
            this.bt(target,comb,i+1,remain-i-1,ans);
            comb.removeLast();
        }
    }
}