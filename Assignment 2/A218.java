import java.util.*;
public class A218 
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter an odd number if u want a perfect pattern:)");
            int n= sc.nextInt();
            int f=n;
            for(int i=1;i<=n/2+1;i++)
            {
                for(int k=1;k<=i-1;k++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=n;j++)
                {
                    if(i==1)
                        System.out.print("* ");
                    else if(j==1)
                        System.out.print("* ");
                    else if(i+j==f)
                    {
                        System.out.print("* ");
                        f--;
                    }
                    else
                        System.out.print("  ");
                    //f--;
                }
                System.out.println();
            }
            int d= n/2-1;
            for(int i=1;i<=n/2;i++)
            {
                for(int k=d;k>=1;k--)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=i*2+1;j++)
                {
                    System.out.print("* ");
                }
                d--;
                System.out.println();
            }
        }
    }
}
