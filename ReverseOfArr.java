import java.util.*;
public class ReverseOfArr {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int[] out=new int[n];
    for(int i=0;i<n;i++){
        out[n-1-i]=arr[i];
    }
    for(int i=0;i<n;i++){
        System.out.print(out[i]+" ");
    }
   } 
}
