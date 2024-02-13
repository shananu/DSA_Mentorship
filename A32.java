import java.util.*;
public class A32 
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the size of array");
            int n= sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            {
                System.out.print("Element "+(i+1)+": ");
                arr[i] = sc.nextInt();
            }
            int min=arr[0];
            int max=arr[0];
            for(int i=0;i<n;i++)
            {
                if(min>arr[i]) min=arr[i];
                if(max<arr[i]) max=arr[i];
            }
            System.out.println("The maximum element: "+max);
            System.out.println("The minimum element: "+min);
        }
    }    
}
