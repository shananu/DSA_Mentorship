import java.util.*;
public class A213
{
    public static int ncr(int a,int b)
    {
        return(fac(a)/(fac(b)*fac(a-b)));
    }
    public static int fac(int n)
    {
        int d=1;
        for(int i=1;i<=n;i++)
        {
            d=d*i;
        }
        return d;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ncr(i,j)+" ");
            }
            System.out.println();
        }
    }
}
