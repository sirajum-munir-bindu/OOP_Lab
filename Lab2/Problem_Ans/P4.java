import java.util.*;

public class Car {

        private String brand;
        private String model;
        private int year;
        private String price;

        public Car(String brand , String model , int year , String price)
        {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public void displayDetails()
        {
            System.out.println("The Brand of the car is : " +brand);
            System.out.println("The Model of the car is : " +model);
            System.out.println("The Year of the car release : " +year);
            System.out.println("The Price of the car is : " +price);
        }

        public static void main(String[] y){
            Scanner sc= new Scanner(System.in);
            int c  ;
            String a , b , d;
            System.out.print("Enter the car Brand name = ");
            a =sc.next();

            System.out.print("Enter the car model name = ");
            b =sc.next();

            System.out.print("Enter the car release Year = ");
            c = sc.nextInt();

            System.out.print("Enter the car Price = ");
            sc.nextLine();
            d = sc.nextLine();

            Car x = new Car(a , b , c ,d);

            x.displayDetails();


        }

}

