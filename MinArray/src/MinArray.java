public class MinArray {
    public static void main(String[] args) {
        int[] array = {10,24,3,12,5,6,123,-1,-4};
        int min = array[0];
        for(int x:array){
            if(x<min)
                min=x;
        }
        System.out.println(min);
    }
}
