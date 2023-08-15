import java.util.*;
public class PrintAllOccurncess{
    public static void findAllOccur(int index,int[] arr,int key){
        if(index>=arr.length){
            return;
        }
        if(arr[index]==key){
            System.out.print(index+" ");
        }
        findAllOccur(index+1,arr,key);
        return;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        findAllOccur(0,arr,key);
        // this is a comment
    }
}

