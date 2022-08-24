package shape;

public class circle {
    double radious;
    double height;
    public void getData(double temp)
    {
        radious=temp;

    }
     public double area()
    {
        return ((3.1427*(2.0*radious)*(2.0*radious))/4.00);
    }
    
}

