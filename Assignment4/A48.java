import java.util.*;
public class A48 {
    public int[] searchRange(int[] nums, int target) 
    {
        int arr[]={-1,-1};
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(c==0) 
                {
                    arr[0]=i;
                    c++;
                }
                arr[1]=i;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        
        A48 obj = new A48();
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
            System.out.println("Enter the number to be searched: ");
            int k = sc.nextInt();
            int result[]= new int[2];
            result = obj.searchRange(arr,k);
            System.out.println("The result is: "+Arrays.toString(result));
        }
    }
}
