
import java.util.*;
public class A12
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter maximum marks");
        double mm= sc.nextDouble();*/
        System.out.println("Enter students's marks");
        double m= sc.nextDouble();
        //double p=m/mm*100.0;
        if(m>90 && m<=100)
        System.out.println("Excellent");
        else if(m>80 && m<=90)
        System.out.println("Good");
        else if(m>70 && m<=80)
        System.out.println("Fair");
        else if(m>60 && m<=70)
        System.out.println("Satisfactory");
        else if(m<=60 && m>=0)
        System.out.println("Below Par");
        else
        System.out.println("Invalid Input");
    }
    
}

//grading system
