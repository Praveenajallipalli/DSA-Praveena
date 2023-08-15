import java.util.*;
public class SumOfEleOfMatrixInParicularPositions {
    public static int sumOfEle(int[][] arr,int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i+j)%2!=0){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//no of rows of matrix
    int m=sc.nextInt();//no of columns of matrix
    int[][] arr=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println(sumOfEle(arr,n,m));
   }
}
