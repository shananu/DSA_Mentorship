import java.util.*;
public class A37part2 
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
            Arrays.sort(arr);
            if(arr[n-1]==n)
            {
                for(int i=0;i<n;i++)
                {
                    if(arr[i]!=i)
                    {
                        System.out.println("The missing element is "+i);
                        break;
                    }
                }
            }
            else System.out.println("The missing element is "+n);
        }
    }
}
