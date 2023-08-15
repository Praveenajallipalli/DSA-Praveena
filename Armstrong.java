import java.util.*;
import java.lang.Math;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while(m>0){
            int rem=m%10;
            sum=sum+(int)Math.pow(rem,3);
            m=m/10;
        }
        if(sum==n){
            System.out.println("It is an Armstrong number");
        }else{
            System.out.println("It's not an Armstrong number");
        }
    }
} 