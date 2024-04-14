import java.util.*;
public class A26
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
           System.out.println("Enter the number of rows:");
           int r = sc.nextInt();
           int c = r+2;
           int c1= c/2;
           for(int i=1;i<=r;i++)
           {
               for(int j= (-c1);j<=c1;j++)
               {
                   if(Math.abs(j)>=i || Math.abs(j) >= r-i+1)
                       System.out.print("* ");
                   else
                       System.out.print("  ");
               }
               System.out.println();
           }
        }
    }
}
