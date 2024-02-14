import java.util.Scanner;
public class A36 
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
            System.out.println("Enter the element to be searched: ");
            int x = sc.nextInt();
            int index=-1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==x) index=i+1;
            }
            if(index!=-1) System.out.println("The element is present at position "+index);
            else System.out.println("Element is not present");
        }    
    }    
}
