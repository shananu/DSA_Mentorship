import java.util.*;
public class A37 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the size of array");
            int n= sc.nextInt();
            int arr[]=new int[n];
            int s=0;
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            {
                System.out.print("Element "+(i+1)+": ");
                arr[i] = sc.nextInt();
                s=s+arr[i];
            }
            Arrays.sort(arr);
            int sum= (int)(n*(n+1)*0.5);
            System.out.println("Elemnet not present is: "+(sum-s));
        }
    }    
}
