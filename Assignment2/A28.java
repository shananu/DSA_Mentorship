import java.util.*;
public class A28
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of rows");
            int n= sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int k=n-i;k>0;k--)
                {
                    System.out.print("  ");
                }
                for(int j=n;j>=i;j--)
                {
                    if(i==j) System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

