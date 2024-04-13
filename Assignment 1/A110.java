
import java.util.*;
public class A110
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The prime factors are:");
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
        }
    }}
}
