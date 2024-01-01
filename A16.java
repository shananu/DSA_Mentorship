import java.util.*;
public class A16
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int d=0;
        //int c=0;
        //int k=0;
        //int b=n;
        while(n>0)
        {
         d=n%10;
         System.out.print(d+"  ");
         n=n/10;
        }
    }}
}
