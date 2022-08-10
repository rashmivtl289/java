

class Outer{
    int x=100;
    class Inner{
        int y=100;
        public void imethod(){
            System.out.println(x);
            System.out.println(x+y);
        }
    }
        public void display(){
            Inner ob1= new Inner();
            System.out.println(x);
            System.out.println(x+ob1.y);
        }
}
public class pr2 {
    public static void main(String[] args) {
        Outer obname= new Outer();
        obname.display();
        Outer.Inner ob2= obname.new Inner();
        ob2.imethod();
    }
}
