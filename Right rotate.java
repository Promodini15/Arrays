class Solution {
    static void reverse(int arr[],int start,int end){
        while(start<end)
{
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}
    }
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
        for(int i=0;i<n;i++){
System.out.print(nums[i]+" ");
        }
      
         
    }
}
