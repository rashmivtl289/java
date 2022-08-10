

interface triangle {

    double area_triangle(double x,double y);
}

interface rectangle{
    double area_rectangle(double x,double y);
}
class area implements triangle,rectangle{
    public double area_triangle(double x,double y){
        return x*y/2;
    }
    public double area_rectangle(double x,double y){
        return x*y;
    }
}
public class pr4 {
    public static void main(String[] args) {
        area a=new area();
        System.out.println("Area of triangle : " +a.area_triangle(10.5, 20.4));
        System.out.println("Area of rectangle : " +a.area_rectangle(10.2,6.8));

    }
}
