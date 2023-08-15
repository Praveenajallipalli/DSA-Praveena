import java.util.*;
public class FreqOfEleArr {
    public static int freqCount(int key,int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(freqCount(key,arr));
    }
}
