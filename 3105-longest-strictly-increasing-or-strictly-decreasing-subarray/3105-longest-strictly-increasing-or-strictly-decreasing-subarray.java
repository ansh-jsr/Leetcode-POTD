class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int inc=1;
        int minc=1;
        int dec=1;
        int mdec=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                inc++;
            }else{
                inc=1;
            }
            minc=Math.max(inc,minc);
        }
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                dec++;
            }else{
                dec=1;
            }
            mdec=Math.max(dec,mdec);
        }

        return Math.max(minc,mdec);

    }
}