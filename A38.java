import java.util.Scanner;
public class A38 
{
    public static void main(String[] args) 
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
            int l=arr[0];
            for(int i=0;i<n;i++)
            {
                if(l<arr[i]) l=arr[i];
            }
            System.out.println("The largest element in the array is: "+l);
        }
    }
}
