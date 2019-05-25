public class Main {
    public static void main(String[] args) {
        int[] array = {10,24,3,5,12,5,6,123,-1,-4,5};
        int sum=0;
        for(int x:array){
            if(x>0) sum+=x;
        }
        System.out.println(sum);
    }
}
