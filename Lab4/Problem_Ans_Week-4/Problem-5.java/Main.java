public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing different overloaded methods
        System.out.println("Sum" + calc.add(5, 10));
        System.out.println("Sum: " + calc.add(5.5, 2.3));
        System.out.println("Sum: " + calc.add(3, 4, 5));
    }
}
