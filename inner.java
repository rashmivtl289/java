class outer
{
    int x=100;
    class inner1
    {
        int y=200;
        void imethod()
        {
            System.out.println(x);
            System.out.println(x+y);

        }
     
        

    }
     void display()
     { 
        inner1 ob1=new inner1();
        System.out.println(ob1.y);
        System.out.println(x);



     }
    }


public class inner {
    public static void main(String[] args) {
        outer ob2=new outer();
        ob2.display();
        outer.inner1 ob3=ob2.new inner1();
        ob3.imethod();

    }
    
}
