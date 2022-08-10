

import java.util.Scanner;

public class pr3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer(40);
        String s;
        System.out.println("capacity : " +sb.capacity());
        System.out.println("Enter a string to reverse");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int i=0;
        int l=s.length()-1;
        int len=l;
        StringBuffer rev= new StringBuffer();
        char r;
        while(len!=-1){
            r=s.charAt(len);
            len--;
            rev.insert(i, r);
            i++;
        }
        System.out.println(rev);
        int le=l;
        while(le!=-1){
            r=rev.charAt(le);
            rev.setCharAt(le, (char) (r-32));
            le--;
        }
        System.out.println(rev);

        System.out.println("Enter a String to append");
        String st=sc.next();
        rev.append(st);
        System.out.println("After appending :" +rev);
    }
}
