package main;

public class EmployeeWage {
    public int final IS_PRESENT=1;
    public int final IS_ABSENT=0;
    public int final WAGE_PER_HOUR=20;
    public int final FULL_DAY_HOUR=8;

        public int empDailyWage(){
        int dailyWage=0;
        int empPresent=(int)(Math.random()*10)%2;
        if(empPresent==IS_PRESENT)
            dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
        System.out.println("Daily Wage on a Full Day is "+dailyWage);
            System.out.println(empPresent);
        return dailyWage;
    }
}
