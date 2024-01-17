class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else
                hm.put(arr[i], hm.get(arr[i])+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            int temp = entry.getValue();
            if(!list.contains(temp))
                list.add(temp);
            else
                return false;
        }
        return true;
    }
}