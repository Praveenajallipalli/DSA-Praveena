import java.util.*;
public class CoddingBatHelloName {
    public static String helloName(String name) {
        String ans= "Hello"+" "+name+"!";
        return ans;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(helloName(name));
      }
}