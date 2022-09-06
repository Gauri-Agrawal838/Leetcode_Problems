class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length, c=0;
        if(len==1 && flowerbed[0]==1)
            return (0>=n);
        else if(len==1 && flowerbed[0]==0)
            return (1>=n);
        int a = flowerbed[0], b = flowerbed[1];
        if(a==b)
        {
            flowerbed[0]=1;
            c++;
        }
        if(len==2)
            return (c>=n);
        int p = flowerbed[len-2], q = flowerbed[len-1];
        if(p==q)
        {
            flowerbed[len-1]=1;
            c++;
        }
        for(int i=1;i<len-1;i++)
        {
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]!=1)
            {
                flowerbed[i] = 1;
                c++;
            }
        }
        return (c>=n);
    }
}