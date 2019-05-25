public class Main {
    public static void main(String[] args) {
        String s ="abcd";
        String b=s+"abcd"; //concatenate
        System.out.println(b);
        String c= s.concat(s); //concatenate
        System.out.println(c);
        String d="   ada  sda   ";
        String e=d.trim(); //delete white spaces at begin and end
        System.out.println("$"+e+"$");
        System.out.println(b.equals(c));
        String f= "dasdSADAASDada";
        String g=f.toLowerCase();
        String h=f.toUpperCase();
        char i=f.charAt(1); // return char at position i;
        String k="Ana are mere";
        String[] j=k.split(" ");
        for (String l:j){
            System.out.println(l);
        }
        System.out.println(j[0]);  //Ana
        String m=k.substring(4);
        System.out.println(m); //are mere
        String n=k.substring(0,3);
        System.out.println(n);//Ana
        int o = k.length();
        String p=k.replace("e","a");
        System.out.println(p);
        String t=k.replaceAll("a","a");
        System.out.println(t);

        String v= String.valueOf(false);
        String w= String.format("%10s","sadas");
        char[] z=k.toCharArray();//A n a ' ' m e r e  ' '
        for(char x:z){
            System.out.print(x+"!");
        }
        System.out.println(z[4]);//a
        boolean aa= s.equalsIgnoreCase(k);

        int index = s.indexOf('c');
        int index2=s.indexOf("bc");
        int lastIndex=s.lastIndexOf('c');
        boolean contains= s.contains("bc");
        boolean startWith=s.startsWith("Abc");
        boolean endWith = s.endsWith("c");
        int compare= s.compareTo("abc");

    }

}
