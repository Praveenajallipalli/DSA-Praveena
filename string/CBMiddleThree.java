import java.util.Scanner;

public class CBMiddleThree {
    public static String middleThree(String str) {
        if(str.length()==0 || str.length()==1 || str.length()==2){
          return "0";
        }
        int n=str.length()/2;
        String ans="";
        for(int i=n-1;i<=n+1;i++){
          ans=ans+(String.valueOf(str.charAt(i)));
        }
        return ans;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(middleThree(str));
      }

}
