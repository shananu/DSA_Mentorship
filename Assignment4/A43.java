import java.util.*;
public class A43 
{
    public int maxSubArray(int[] nums) {
        int sum=0;
       int max=-10000;
       for(int i=0;i<nums.length;i++)
       { 
           sum=0;
           for(int j=i;j<nums.length;j++)
           {
               sum=sum+nums[j];
               max=Math.max(sum,max);
           }
       }
       return max;
   }
    public static void main(String[] args)
    {
        A43 obj = new A43();
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the length of the array (should not be 0): ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n;i++)
            {
                System.out.print("Enter "+(i+1)+"th element: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("The maximum sum =  "+ (obj.maxSubArray(arr)));
        }
    }    
}
