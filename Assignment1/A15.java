import java.util.*;
public class A15
{
    public static void main(String[] args)
    {
       try(Scanner sc=new Scanner(System.in))
       {
        System.out.println("Enter the number");
       int n= sc.nextInt();
       int d=1;
       while(n>9)
       {
           d++;
           n=n/10;
        }
       System.out.println("The number of digits "+d);
       }
       
    }
}
