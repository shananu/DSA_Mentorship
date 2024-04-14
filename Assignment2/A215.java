import java.util.*;
public class A215 
{
    public static void main(String[] args)   
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            int S= 1;
            int s=n/2;
            for(int i =1;i<=n;i++)
            {
                 
                if(i<=n/2+1)
                {
                    int f= i*2-1;
                    int d= i;
                    int e= f-1; 
                    for(int k=1;k<=s;k++)
                    {
                        System.out.print("  ");
                    }
                    for(int j=1;j<=f;j++)
                    {
                        if(d<=f)
                        {
                            System.out.print(d+" ");
                            d++;
                        }
                        else
                        {
                            System.out.print(e+" ");
                            e--;
                        }
                        s--;
                    }
                }
                else
                {
                    int f= (n-i+1)*2-1;
                    int d= n-i+1;
                    int e= f-1;
                    for(int k=1;k<=S;k++)
                    {
                        System.out.print("  ");
                    }
                    
                    for(int j=1;j<=f;j++)
                    {
                        if(d<=f)
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
                    S++;
                }
                System.out.println();
            }
        }
    } 
}
