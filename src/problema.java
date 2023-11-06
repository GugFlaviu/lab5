import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class problema {
    public static void main(String[] args) {
        int i;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the desired employees:");
        int n = myObj.nextInt();
        List<Employe> employeArrayList= new ArrayList<>();
        for(i=0;i<n;i++){
            Employe employe=new Employe();

            System.out.println("Enter the name:");
            myObj.nextLine();
            String name=myObj.nextLine();

            employe.SetName(name);
            System.out.println("Enter the email:");
            String email=myObj.nextLine();
            employe.SetEmail(email);
            System.out.println("Enter the hourRate:");
            int hourRate=myObj.nextInt();
            employe.SetHourRate(hourRate);
            System.out.println("Enter the capacity:");
            int capacity=myObj.nextInt();
            employe.SetCapacity(capacity);
            System.out.println("Enter the freeDays:");
            int freeDays=myObj.nextInt();
            employe.SetCapacity(freeDays);


            employeArrayList.add(employe);
        }
        for (Employe e :employeArrayList) {
            System.out.print("Nume:"+e.GetName()+ "\t");
            System.out.print("Email:"+e.GetEmail()+ "\t");
            System.out.print("Hour Rate:"+e.GetHourRate()+ "\t");
            System.out.print("Capacity:"+e.GetCapacity()+ "\t");
            System.out.print("freeDays:"+e.GetFreeDays()+ "\t");
            System.out.print("DailyIncome:"+e.CalculateDailyIncome()+ "\t");
            System.out.print("MonthlyIncome:"+e.CalculateMonthlyIncome()+ "\t");
        }


    }
}
