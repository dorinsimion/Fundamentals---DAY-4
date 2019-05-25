public class Main {
    public static void main(String[] args) {
        int[] array = {10,24,3,5,12,5,6,123,-1,-4,5};
        int n=5;
        int count=0;
        for(int x:array){
            if(x==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
