public class Rectangle extends Shape{
    private double length , width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea()
    {
        System.out.println(length*width);
    }
}
