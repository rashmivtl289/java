

class const_over{
    public int l,b,h;
    const_over(int length){
        l=b=h=length;
    }
    const_over(int length,int bredth,int height){
        l=length;
        b=bredth;
        h=height;
    }
    public int volume(){
        return l*b*h;
    }
    public void print(){
        System.out.println("Demonstrate of constructor overloading and method overloading...");
    }
    public void print(int v){
        System.out.print(v);
    }
}

public class pr1{
public static void main(String[] args) {
    const_over cube= new const_over(20);
    const_over cuboid= new const_over(20,34,15);
    int v1=cube.volume();
    int v2=cuboid.volume();
    cube.print();
    System.out.print("\nVolume of Cube :");
    cube.print(v1);
    System.out.print("\nVolume of Cuboid :");
    cuboid.print(v2);
}    
}
