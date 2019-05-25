public class Main {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("abbc");
        sb.append("bba");
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        sb.insert(3,"ddd");
        System.out.println(sb);
        sb.replace(3,6,"c");
        System.out.println(sb);
        sb.insert(1,"a");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String s="abba";
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        if(s.equals(sb1.toString())){
            System.out.println("Is palindrom!");
        }

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("Aa").replace(1,2,"aa").reverse().toString();
    }
}
