public class Employe {

    public String name;
    public String email;
    public int hourRate;
    public int capacity;
    public int freeDays;
    //Setters
    public void SetName(String new_name) {
        this.name = new_name;

    }
    public void SetEmail(String new_email){
        this.email=new_email;

    }
    public void SetHourRate(int new_hour_rate){

        this.hourRate=new_hour_rate;
    }
    public void SetCapacity(int new_capacity){
        this.capacity=new_capacity;

    }
    public void SetFreedAYS(int new_free_days){
        this.freeDays=new_free_days;

    }
    //Getters


    public String GetName() {
        return name;
    }
    public String GetEmail(){
        return  email;
    }
    public int GetHourRate(){
        return hourRate;
    }
    public int GetCapacity(){
        return capacity;
    }
    public int GetFreeDays(){
        return freeDays;
    }
    public int CalculateDailyIncome(){
        int dailyIncome;
        dailyIncome=hourRate*capacity;
        return dailyIncome;
    }
    public int CalculateMonthlyIncome(){
        int monthlyIncome;
        monthlyIncome=CalculateDailyIncome()*30;
        return monthlyIncome;
    }
}
