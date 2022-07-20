public class insrt {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("I JAVA");
        sb.insert(2,"LIKE ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("This is a test");
        System.out.println(sb1);
        sb1.delete(4,7);
        System.out.println(sb1);
        sb1.deleteCharAt(2);
        System.out.println(sb1);


    }
    
}
