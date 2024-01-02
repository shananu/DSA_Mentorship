import java.util.Scanner;
public class A216 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number");
            int n= sc.nextInt();
            int d= (n-1)*2-1;
            if(n==1)
                System.out.println(n);
            else
            {
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    for(int k=1;k<=d;k++)
                    {
                        System.out.print("  ");
                    }
                    for(int j=i;j>=1;j--)
                    {   
                        if(j==n)
                            continue;
                        System.out.print(j+" ");
                    }
                    d=d-2;
                    System.out.println();
                }
            }
        }
    }    
}
