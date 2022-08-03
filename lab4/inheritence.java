package lab4;

interface Rectangle{
    double areaR(double x,double y);

}
interface Traingle{
    double areaT(double x,double y);

}
class area implements Rectangle,Traingle{
    public double areaT(double x, double y){
    return (x*y)/2;


}
public double areaR(double x,double y){
    return (x*y);
}
}
public class inheritence {
    public static void main(String[] args) {
        area a =new area();
        System.out.println("Area of Rectangle:"+a.areaR(10,20));
        System.out.println("Area of Trangle:"+a.areaT(10,20));
    }
    
}
