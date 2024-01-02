import java.util.*;
public class A215 
{
    public static void main(String[] args)   
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            for(int i =1;i<=n;i++)
            {
                int f= i*2-1;
                int d= i;
                int e= f-1;  
                for(int j=1;j<=f;j++)
                {
                    if(j<=f)
                    {
                        System.out.print(d+" ");
                        d++;
                    }
                    else
                    {
                        System.out.print(e+" ");
                        e--;
                    }
                }
                System.out.println();
            }
        }
    } 
}
