import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        boolean flag=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=false;
                break;
            }
        }
        System.out.println(flag ? "Is palindrom": "Is not a palindrom");
    }
}
