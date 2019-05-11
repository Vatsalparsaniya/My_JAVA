import java.util.Scanner;

interface MidExam{
  SubjectMarks Mid = new SubjectMarks();
  public void getMidMarks();
  public void setMidMarks(int[] marks);
}

interface InternalMarks{
  SubjectMarks Internal = new SubjectMarks();
  public void getInternalMarks();
  public void setInternalMarks(int[] marks);
}

interface EndExam{
  SubjectMarks End = new SubjectMarks();
  public void getEndExamMarks();
  public void setEndExamMarks(int[] marks);
}

interface ExtraActivity{

  public String getExtraActivity();
  public void SetExtraActivity(String Activity);
}

interface Sports{

  public void SetSportsGrade(String Grade);
  public String GetSportsGrade();
}

class SubjectMarks{
  int OOP;
  int COP;
  int CS;
  int DAA;
  int CN;
}

public class Result extends Student implements MidExam,ExtraActivity,InternalMarks,EndExam,Sports{
  String SportsMarks;
  String ExtraActivityName;
  public void setInternalMarks(int[] marks){
        Internal.COP = marks[0];
        Internal.OOP = marks[1];
        Internal.CS = marks[2];
        Internal.DAA = marks[3];
        Internal.CN = marks[4];
    }
    public void getInternalMarks(){
      System.out.println("\n=> Internal Marks : \nCOP = "+Internal.COP+"\nOOP = "+ Internal.OOP +"\nCS = "+Internal.CS + "\nDAA = "+Internal.DAA + "\nCN = "+ Internal.CN );

    }
    public void setMidMarks(int[] marks){
      Mid.COP = marks[0];
      Mid.OOP = marks[1];
      Mid.CS = marks[2];
      Mid.DAA = marks[3];
      Mid.CN = marks[4];
    }
    public void getMidMarks(){
      System.out.println("\n=> MID Exam Marks : \nCOP = "+Mid.COP+"\nOOP = " + Mid.OOP +"\nCS = "+Mid.CS + "\nDAA = "+Mid.DAA + "\nCN = "+Mid.CN);
    }
    public void setEndExamMarks(int[] marks){
      End.COP = marks[0];
      End.OOP = marks[1];
      End.CS = marks[2];
      End.DAA = marks[3];
      End.CN = marks[4];
    }
    public void getEndExamMarks(){
      System.out.println("\n=> END Exam  Marks : \nCOP = "+End.COP+"\nOOP = " +End.OOP +"\nCS = "+End.CS + "\nDAA = "+End.DAA + "\nCN = "+End.CN);
    }
    public void SetSportsGrade(String Grade){
      this.SportsMarks = Grade;
    }
    public String GetSportsGrade(){
      return SportsMarks;
    }

    Result(String StudentName,String BranchName,String RollNO){
      super(StudentName,BranchName,RollNO);
    }
    public void SetExtraActivity(String ExtraActivityName){
      this.ExtraActivityName= ExtraActivityName;
  }
    public String getExtraActivity(){
      return this.ExtraActivityName;
    }

  public static void main(String[] args){

      String Name,RollNo,BranchName;
      int[] marks = new int[5];
      Scanner Sc = new Scanner(System.in);
      System.out.print("Enter your Name :");
      Name = Sc.next();
      System.out.print("Enter your RollNo :");
      RollNo = Sc.next();
      System.out.print("Enter your Branch :");
      BranchName = Sc.next();

      Result ResultofS1 = new Result(Name,BranchName,RollNo);

      System.out.print("Enter your Marks : ");
      System.out.print("\nEnter Internal Marks In Order(COP,OOP,CS,DAA,CN) :\n");
      for(int i = 0;i < marks.length ; i++){
        marks[i] = Sc.nextInt();
      }
      ResultofS1.setInternalMarks(marks);
      System.out.print("\nEnter MID Exam Marks In Order(COP,OOP,CS,DAA,CN) :\n");
      for(int i = 0;i < marks.length ; i++){
        marks[i] = Sc.nextInt();
      }
      ResultofS1.setMidMarks(marks);
      System.out.print("\nEnter End Exam Marks In Order(COP,OOP,CS,DAA,CN) :\n");
      for(int i = 0;i < marks.length ; i++){
        marks[i] = Sc.nextInt();
      }
      ResultofS1.setEndExamMarks(marks);

      System.out.print("Enter Sports Grade :");
      String SportsMarks = Sc.next();
      ResultofS1.SetSportsGrade(SportsMarks);
      System.out.print("Enter your Extra Activity :");
      String ExtraActivityName = Sc.next();
      ResultofS1.SetExtraActivity(ExtraActivityName);

      System.out.print("\n\nYour Result:\n");
      ResultofS1.getInternalMarks();
      ResultofS1.getMidMarks();
      ResultofS1.getEndExamMarks();

      System.out.print("\nExtra Activity : " + ResultofS1.GetSportsGrade());
      ResultofS1.getExtraActivity();
      System.out.print("Sports Grade : " + ResultofS1.getExtraActivity());
  }

}

class Student{
  String StudentName;
  String BranchName;
  String RollNO;
  Student(String StudentName,String BranchName,String RollNO){
    this.StudentName = StudentName;
    this.BranchName = BranchName;
    this.RollNO = RollNO;
  }
}
