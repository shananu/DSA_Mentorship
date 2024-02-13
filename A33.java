import java.util.Scanner;
public class A33 
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
            System.out.println("Enter the number: ");
            int x=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(x==arr[i]) c++;
            }
            System.out.println("The frequency of "+x+" in the array is "+c);
        }
    }    
}
