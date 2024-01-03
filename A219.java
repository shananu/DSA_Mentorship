import java.util.*;
public class A219
{
    public static void main(String[] args)
    {
        try(Scanner sc =new Scanner(System.in))
        {
            System.out.println("Enter an odd number if u want a perfect swastik:)");
            int n= sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==n/2+1 || j==n/2+1)
                        System.out.print("* ");
                    else if(i<=n/2)
                    {
                        if((i==1 && j<=n/2) || j==n)
                        System.out.print("* ");
                        else
                        System.out.print("  ");
                    }
                    else if(i>n/2)
                    {
                        if(j==1 || (i==n && j>n/2))
                            System.out.print("* ");
                        else  
                            System.out.print("  ");
                    }
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        } 
    }
}