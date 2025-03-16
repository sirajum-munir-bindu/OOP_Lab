public class Main {
    public static void main(String[] args) {
        Employee e[] = new Employee[2];

        e[0] = new FullTimeEmployee(5000.5);
        e[1] = new PartTimeEmployee(3000.5);

        for(int i = 0; i < e.length; i++)
        {
            e[i].calculateSalary();
        }
    }

}
