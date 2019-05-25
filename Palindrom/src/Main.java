import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int N=n;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n/=10;
        }

        if(reverse==N){
            System.out.println("Palindrom!");
        } else{
            System.out.println("Not!");
        }
    }
}
