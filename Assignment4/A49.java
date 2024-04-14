import java.util.*;
public class A49 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target)  return mid;
            else if(nums[mid] < target) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
    public static void main(String[] args)
    {
        
        A49 obj = new A49();
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
            System.out.println("Target: ");
            int k = sc.nextInt();
            int result = obj.searchInsert(arr,k);
            System.out.println("The result is: "+ result);
        }
    }
}
