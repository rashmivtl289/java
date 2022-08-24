package shape;

public class shmain {
    public static void main(String[] args) {
        circle c=new circle();
        square s=new square();
        Traingle t=new Traingle();
        
        
        s.getData((float)5.5);
        System.out.println("The area of square is:"+s.area());
        t.getData((double)20.56,(double)23.90);
        System.out.println("The area of triangle is"+t.area());
        c.getData((double)5.5);
        System.out.println("The area of circle is:"+c.area());



    }
    
}
