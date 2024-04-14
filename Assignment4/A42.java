import java.util.*;
public class A42 
{
    public int singleNumber(int[] nums) 
    {
        int result = 0;
        for(int i=0;i<nums.length;i++)
        {
           result=result^nums[i]; 
        }
        return result;      
    } 
    public static void main(String[] args)
    {
        A42 obj = new A42();
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
            System.out.println("The single number is: "+ (obj.singleNumber(arr)));
        }
    }   
}
