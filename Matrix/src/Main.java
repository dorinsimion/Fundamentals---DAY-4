import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] array = new int[n][];

        for(int i=0;i<n;i++){
            array[i]=new int[i+1];
            for(int j=0;j<array[i].length;j++){
                array[i][j]=j+1;
            }
        }
        System.out.println("Afisare:");
        for(int[] x:array){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
