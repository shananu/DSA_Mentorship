import java.util.*;
public class A220 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the size for W:");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i<=n/2)
                    {
                        if(j==1 || j==n)
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                    }
                    if(i>n/2)
                    {
                        for(int m=n/2+1;m>=1;m--)
                        {
                            for(int p=1;p<=m;p++)
                            {
                                if(p==1 || p==m)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
