import java.util.*;
public class A35 
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
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i] != 0)
                {
                    arr[j]=arr[i];
                    j++;
                }
            }
            for(int i=j;i<n;i++)
            {
                arr[j]=0;
                j++;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }    
}
