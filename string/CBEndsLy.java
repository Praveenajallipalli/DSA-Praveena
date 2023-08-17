import java.util.Scanner;

public class CBEndsLy {
    public static boolean endsLy(String str) {
        int n=str.length();
        if(n==0||n==1){
          return false;
        }
        // if(str.charAt(n-2)=='l'&&str.charAt(n-1)=='y'){
        //   return true;
        // }else{
        //   return false;
        // }
        if(str.endsWith("ly")){
          return true;
        }else{
          return false;
        }
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(endsLy(str));
      }
      
}
