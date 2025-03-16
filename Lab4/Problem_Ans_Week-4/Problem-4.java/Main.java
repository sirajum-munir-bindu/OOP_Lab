public class Main {
    public static void main(String[] args) {
        Shape s[] = new Shape[2];

        s[0] = new Circle(4.5);
        s[1] = new Rectangle(2.5 , 4.5);

        for(int i = 0; i < s.length; i++)
        {
            s[i].calculateArea();
        }
    }
}
