class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++)
        {
            minSalary = Math.min(minSalary, salary[i]);
            maxSalary = Math.max(maxSalary, salary[i]);
        }
        double sum = 0;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]!=minSalary && salary[i]!=maxSalary)
                sum += salary[i];
        }
        sum /= salary.length-2; 
        return sum;
    }
}