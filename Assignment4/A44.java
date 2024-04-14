import java.util.*;
public class A44 {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(b>prices[i]) b=prices[i];
            if(p<prices[i]-b) p=prices[i]-b;
        }
        return p;
    }

    public static void main(String[] args)
    {
        A44 obj = new A44();
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the length of the array (should not be 0): ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n;i++)
            {
                System.out.print("Enter "+(i+1)+"th element: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("The maximum profit =  "+ (obj.maxProfit(arr)));
        }
    }  
}
