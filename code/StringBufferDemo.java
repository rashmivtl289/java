

public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Hello");
        // System.out.println("buffer : " +sb);
        // System.out.println("length : " +sb.length());
        // System.out.println("capacity : " +sb.capacity());
        // //sb.setLength(2);
        // System.out.println("buffer : " +sb);
        // System.out.println("capacity : " +sb.capacity());
        // //System.out.println("charAt() : " +sb.charAt(5));
        // sb.setCharAt(1, '1');
        // System.out.println("Buffer after setCharAt() : " +sb);
        
        
        // StringBuffer sb = new StringBuffer("Hello");
        // sb.append("World");
        // System.out.println("Buffer :" +sb);

    //     String s;
    //     int a=40
    //     StringBuffer sb=new StringBuffer(40);
    // //     s=sb.append("a=").append(a).append("!").toString();
    // //     System.out.println(s);
    // //     System.out.println("capacity : " +sb.capacity());

    

    // StringBuffer sb=new StringBuffer("I java!");
    // sb.insert(2, "Like ");
    // System.out.println(sb);

    // StringBuffer sb=new StringBuffer("I java!");
    // System.out.println("After reversing : " +sb.reverse());

    StringBuffer sb=new StringBuffer("This is a test");
    System.out.println("After deleting : " +sb.delete(4,7));
    sb.deleteCharAt(2);
    System.out.println("After deleting : " +sb);
     }
}
