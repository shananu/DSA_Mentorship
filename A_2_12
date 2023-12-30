import java.util.*;
public class A212
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of rows");
            int n= sc.nextInt();
            int a=0;
            int b=1;
            int c=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c=a+b;
                    a=b;
                    b=c;
                }
                System.out.println();
            }
        }
    }
}

