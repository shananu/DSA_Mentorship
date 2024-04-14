import java.util.*;
public class A31 
{
    public static void main(String args[])
    {
        try(Scanner sc= new Scanner(System.in))
        {
            System.out.println("Enter the size of array");
            int n= sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            {
                System.out.print((i+1)+"th element: ");
                arr[i] = sc.nextInt();
            }
            int c=0;
            if(n==1) System.out.println("The peak element is: "+arr[0]);
            else
            {
                for(int i=0;i<n;i++)
                {
                    if(i==n-1)
                    {
                        if(arr[i]>=arr[i-1]) c=i;
                    }
                    else if(i==0)
                    {
                        if(arr[0]>arr[1])  c=0;
                    }
                    else
                    {
                        if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) c=i;
                    }
                }
                System.out.println("The peak element is: "+arr[c]);
            }
        }
       
    }    
}
