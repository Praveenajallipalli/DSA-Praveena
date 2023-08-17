import java.util.*;
public class CBFirstHalf {
    public static String firstHalf(String str) {
        int index=str.length()/2;
        String ans=str.substring(0,index);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(firstHalf(name));
    }
}
