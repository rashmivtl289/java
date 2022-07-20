import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class str3 {
    public static void main(String[] args) {
        String s1,s2=" ",s3=" ",s4,s5;
        int l,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=sc.next();
        System.out.println("Length=" +s1.length());
        StringBuffer sb=new StringBuffer(s1);
        System.out.println("Capacity=" +sb.capacity());
        l=sb.length();

        
        
        if(l==0)
        {
            System.out.println("String is empty");
        }
        else{
            for(i=l-1;i>=0;i--)
            {
                
            s2=s2+s1.charAt(i);
            
         }
        System.out.println("Reversed string is:" +s2);
        }

        
        s3=s2.toUpperCase();
        System.out.println("Uppercase:"+s3);
         
        System.out.println("Enter a string");
        s4=sc.next();
        StringBuffer sb2=new StringBuffer(s4);
       s5=sb2.append(s3).toString();
       System.out.println("Appended:"+s5);
  }
}
