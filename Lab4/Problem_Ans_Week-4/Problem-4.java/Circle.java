public class Circle extends Shape{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void calculateArea()
    {
        System.out.println(3.1416*radius*radius);
    }


}
