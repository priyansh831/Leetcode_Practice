import java.util.*;
// Brute force
class Main{

      public static int maxSubArray(int[] nums){
  
        int max=Integer.MIN_VALUE;
        int n=nums.length;
    if(n==0)return 0;
    if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            int sum=0;
            sum+=nums[i];
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                max=Math.max(sum,max);
            }
          
        }
         return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(maxSubArray(arr));
        sc.close();
    }
    
}
