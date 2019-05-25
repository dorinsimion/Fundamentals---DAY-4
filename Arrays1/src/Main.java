public class Main {
    public static void main(String[] args) {
        int[] array = {10,24,3,5,12,5,6,123,-1,-4,5};
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0) {
                array[i] *= 2;
            } else {
                array[i]*=3;
            }
        }

        for(int x:array)
            System.out.print(x+ " ");
    }
}
