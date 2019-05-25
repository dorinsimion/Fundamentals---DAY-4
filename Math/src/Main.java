import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.max(3,4));//4
        System.out.println(Math.min(5,6));//5
        System.out.println(Math.abs(-4)); //4
        System.out.println(Math.sqrt(81));//9
        System.out.println(Math.sqrt(2));//1.4
        System.out.println(Math.pow(4,3));//64
        System.out.println(Math.cos(90));
        System.out.println(Math.sin(90));
        System.out.println(Math.floor(3.5));//3
        System.out.println(Math.ceil(3.5));//4
        System.out.println(Math.round(3.6));//4

        int n = new Random().nextInt(6)+1;
        System.out.println(n);
    }

}
