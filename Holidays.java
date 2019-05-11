import java.lang.*;
public class Holidays{

    private String name;
    private int day;
    private String month;

    Holidays(String nm,int d, String mo){
        name = nm;
        day = d;
        month= mo;
    }

    static Boolean inSameMonth(Holidays obj1,Holidays obj2){
        if (obj1.month == obj2.month)
            return true;
        else
            return false;
    }

    static double avgDate(Holidays arr[]){
        double avg;
        int sum=0;
        for (int i=0;i<arr.length;i++)
            sum = sum + arr[i].day;
        avg = sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Holidays obj[] = new Holidays[3];
        obj[0] = new Holidays("Independance Day",4,"July");
        obj[1] = new Holidays("Republic Day",2,"January");
        obj[2] = new Holidays("Mahatma Gandhi Jayanti",6,"October");

        for (int i=0;i<obj.length;i++)
            System.out.println(obj[i].name + " "+ obj[i].day+ " "+ obj[i].month);

        System.out.println("Is this object in same month: "+ inSameMonth(obj[1],obj[2]));
        System.out.println("Average of all days is: "+avgDate(obj));

    }
}
