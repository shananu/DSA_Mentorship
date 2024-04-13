import java.util.*;
public class A25
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the number of rows:");
            int n = sc.nextInt();
            int d = n / 2;
            int r = 1;
            int a = n / 2 + 1;
            int f = 1;
            for (int i = 1; i <= n; i++)
            {
                if (i <= (n / 2 + 1))
                {
                    for (int k = 1; k <= d; k++)
                    {
                        System.out.print("  ");
                    }
                    d--;
                    for (int j = 1; j <= r; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                    r = r + 2;
                }
                else
                {
                    for (int k = 1; k <= f; k++) 
                    {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= a; j++) 
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                    a = a - 2;
                    f++;
                }
            }
        }
    }
}
