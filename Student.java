import java.util.Scanner;

class Student{
    String rollNo;
    String name;
    static int count;

    Student(){
        count++;
    }
    Student(String rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
        count++;
        System.out.println("Object created: " + count);
        System.out.println(this);
    }

    public String toString(){
        return "rollNo: "+ rollNo + ", name: "+ name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String roll,name;
        System.out.println("Enter the number of students: ");
        n = scan.nextInt();
        Student[] obj = new Student[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the rollNo of student "+i+" : ");
            roll = scan.next();
            System.out.println("Enter the name of student "+i+" : ");
            name = scan.next();
            obj[i] = new Student(roll,name);
        }
    }
}
