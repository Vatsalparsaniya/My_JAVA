import java.util.Scanner;

public class Employee{
    int salary,day_hour;

    public void getInfo(int salary,int day_hour){
        this.salary = salary;
        this.day_hour = day_hour;
    }

    static void addSalary(Employee e){
        if(e.salary < 500)
            e.salary += 10;
    }

    static void addWork(Employee e){
        if(e.day_hour > 6)
            e.salary += 5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter the salary of employee and number of hours of work per day");
        int sal = scan.nextInt();
        int h = scan.nextInt();
        emp.getInfo(sal,h);
        addSalary(emp);
        addWork(emp);
        System.out.println("\nThe final salary of employee is : " + emp.salary);
    }
}
