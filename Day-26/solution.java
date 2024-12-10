class Solution {
   static int minRemoval(int intervals[][]) {
        // code here
        if(intervals==null || intervals.length==0){
            return 0;
        }

//sorting elements based on their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < end)
            {
                count++;
            }
            else{
                end=intervals[i][1];
            }
        }
        return count;
    }
}
