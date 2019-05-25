package scanner;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
//        for(int i=0;i<n;i++)
//        System.out.println(scanner.nextInt());
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        double d = scanner.nextDouble();
        boolean c =scanner.nextBoolean();
    }
}
